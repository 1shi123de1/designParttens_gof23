package online.ylqdh.codelearn.gof23.Factory.abstractFactory;

public interface IProductFactory {
    // 生产手机
    IPhoneProduct getIPhoneProduct();

    // 生产路由器
    IRouterProduct getIRouterProduct();
}
