package online.ylqdh.codelearn.gof23.Factory.abstractFactory;

/**
 * @Description: 消费者，消费小米或者华为产品
 * @author: yeliqun
 * @date 2021-07-04
 **/
public class ConsumerClient {
    public static void main(String[] args) {
        System.out.println("----------小米产品---------------");
        XiaomiFactory xiaomiFactory = new XiaomiFactory(); // 小米工厂实例
        IPhoneProduct xiaomiPhone = xiaomiFactory.getIPhoneProduct();
        xiaomiPhone.call();
        xiaomiPhone.start();
        xiaomiPhone.shutdown();
        xiaomiPhone.setting();

        IRouterProduct xiaomiRouter = xiaomiFactory.getIRouterProduct();
        xiaomiRouter.start();
        xiaomiRouter.shutdown();
        xiaomiRouter.wifi();
        xiaomiRouter.setting();

        System.out.println("---------华为产品-----------------");
        HuaweiFactory huaweiFactory = new HuaweiFactory();

        IPhoneProduct huaweiPhone = huaweiFactory.getIPhoneProduct();
        huaweiPhone.call();
        huaweiPhone.setting();
        huaweiPhone.start();
        huaweiPhone.shutdown();

        IRouterProduct huaweiRouter = huaweiFactory.getIRouterProduct();
        huaweiRouter.start();
        huaweiRouter.shutdown();
        huaweiRouter.wifi();
        huaweiRouter.setting();
    }
}
