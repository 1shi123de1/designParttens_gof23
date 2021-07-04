package online.ylqdh.codelearn.gof23.Singleton;

/**
 * 饿汉式单例模式 先实例化一个单例
 */
public class HangryMode {

    // 私有的构造方法，外面不能自己生成实例
    private HangryMode() {}

    private final static HangryMode hangry = new HangryMode();

    public static HangryMode getInstance() {
        return hangry;
    }

    // 缺点: 一进来就生成实例,如果这个类有多余的内容也会自动加载，造成资源浪费
    private byte[] data1 = new byte[1024 * 1024];
    private byte[] data2 = new byte[1024 * 1024];
    private byte[] data3 = new byte[1024 * 1024];
    private byte[] data4 = new byte[1024 * 1024];
}
