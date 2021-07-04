package online.ylqdh.codelearn.gof23.Factory.abstractFactory;

/**
 * @Description: 小米路由器产品，实现了IRouterProduct接口
 * @author: yeliqun
 * @date 2021-07-04
 **/
public class XiaomiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("小米路由器开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米路由器关机");
    }

    @Override
    public void wifi() {
        System.out.println("小米路由器WiFi功能");
    }

    @Override
    public void setting() {
        System.out.println("小米路由器设置");
    }
}
