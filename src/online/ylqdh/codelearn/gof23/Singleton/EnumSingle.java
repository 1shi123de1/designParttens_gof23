package online.ylqdh.codelearn.gof23.Singleton;

/**
 * @Description: 枚举单例模式
 *               枚举本身也是一个类
 *               这种单例模式，不能通过反射破解；
 *               注意： 枚举有一个有参的构造方法，需要用jad反编译看到
 *               默认是线程安全的
 * @author: yeliqun
 * @date 2021-06-27
 **/
public enum EnumSingle {
    INSTANCE;

    public EnumSingle getInstance() {
        return INSTANCE;
    }
}
