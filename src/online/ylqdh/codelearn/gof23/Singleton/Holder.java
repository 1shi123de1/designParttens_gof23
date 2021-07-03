package online.ylqdh.codelearn.gof23.Singleton;

/**
 * @Description: 通过静态内部类的方式获得单例
 *               这种方式在多线程下也是不安全的
 * @author: yeliqun
 * @date 2021-06-27
 **/
public class Holder {
    private Holder() {}

    public static Holder getInstance() {
        return InnerHolderClass.holder;
    }

    public static class InnerHolderClass {
        private static final Holder holder = new Holder();
    }
}
