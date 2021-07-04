package online.ylqdh.codelearn.gof23.Singleton;

import java.lang.reflect.Constructor;

/**
 * @Description: 懒汉式单例模式，一开始不会自动实例化单例，只有调用的时候再实例化
 * @author: yeliqun
 * @date 2021-06-27
 **/
public class LazyManMode {
    private LazyManMode() {
        System.out.println(Thread.currentThread().getName() + " ok!");
    }

    private static LazyManMode lazyMan = null;

    /**
     * 懒汉式，如果对象没有实例化，才进行实例化
     *
     * @return 实例
     */
    public static LazyManMode getInstance() {
        if (lazyMan == null) {
            lazyMan = new LazyManMode();
        }
        return lazyMan;
    }

    // 单线程下没有问题。
    // 缺点： 多线程下，会多次实例化.
    // 理想情况： 应该只有一个线程的实例会被实例化，其余线程只要拿到实例直接用就可以了
    // public static void main(String[] args) {
    // for (int i = 0; i < 10; i++) {
    // new Thread(() -> {
    // LazyManMode.getInstance();
    // }).start();
    //
    // }
    // }

    // 改进. 加锁
    // 双重检测锁模式的 懒汉式单例 --> DCL懒汉式
    private volatile static LazyManMode lazyMan2 = null;

    public static LazyManMode getInstance2() {
        if (lazyMan2 == null) {
            synchronized (LazyManMode.class) {
                if (lazyMan2 == null) {
                    /**
                     * 这行代码不是原子性的操作,涉及三个步骤 1. 分配内存空间 2. 执行构造方法，初始化对象 3. 把这个对象指向这个空间
                     * 那么在多线程下，这3步会乱序执行，所有最后可能拿到的lazyMan2这个实例还是空的 解决方法： 在声明的时候加上volatile关键词
                     */
                    lazyMan2 = new LazyManMode();
                }
            }
        }
        return lazyMan2;
    }

    // 反射可以破坏DCL的懒汉式单例
    public static void main(String[] args) throws Exception {
        LazyManMode lazyMan = LazyManMode.getInstance2();

        Constructor<LazyManMode> declaredConstructor = LazyManMode.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        LazyManMode lazyMan2 = declaredConstructor.newInstance();

        // 两个实例的hashcode不一样，说明通过反射已经拿到了第二个实例，单例模式被破坏了
        System.out.println(lazyMan.hashCode());
        System.out.println(lazyMan2.hashCode());

        // 解决方式是在构造方法中加一把锁，当实例不为空又来构造实例就抛异常
        /**
         * private LazyManMode() { synchronized (LazyManMode.class) { if (lazyMan2 != null) { throw new
         * RuntimeException("不要用反射获取实例"); } } }
         *
         * 但是使用了这种方式，如果两个实例都是用反射获取的，就无用了 LazyManMode lazyMan3 = declaredConstructor.newInstance(); LazyManMode lazyMan4
         * = declaredConstructor.newInstance(); 这两个实例还是能正常创建，且不是同一个实例
         *
         * 这种情况的解决方式： 在构造方法中加锁的时候，用一个额外的变量来控制，外面(反编译除外)不知道有这个变量
         *
         * private static boolean ylq = flase; private LazyManMode() { synchronized (LazyManMode.class) { if (ylq ==
         * false) { ylq = true; } else { throw new RuntimeException("不要用反射获取实例"); } } }
         *
         * 这样就保证了当用反射获取两次实例时，会报错
         *
         * 但是道高一尺魔高一丈！！ 还可以通过反射来修改变量ylq的值！！！ 在第二次创建实例前，把标志位ylq的值改为false 解决方法： 枚举单例
         *
         */

    }

}
