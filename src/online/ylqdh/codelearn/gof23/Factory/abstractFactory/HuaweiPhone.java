package online.ylqdh.codelearn.gof23.Factory.abstractFactory;

/**
 * @Description: 华为手机产品
 * @author: yeliqun
 * @date 2021-07-04
 **/
public class HuaweiPhone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("华为手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为手机关机");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void setting() {
        System.out.println("华为手机设置");
    }
}
