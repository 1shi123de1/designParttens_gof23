package online.ylqdh.codelearn.gof23.Factory.abstractFactory;

/**
 * @Description: 小米手机产品
 * @author: yeliqun
 * @date 2021-07-04
 **/
public class XiaomiPhone implements IPhoneProduct{
    @Override
    public void start() {
        System.out.println("小米手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void setting() {
        System.out.println("小米手机设置");
    }
}
