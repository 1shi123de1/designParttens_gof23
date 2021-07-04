package online.ylqdh.codelearn.gof23.Factory.abstractFactory;

/**
 * @Description: 华为产品工厂
 * @author: yeliqun
 * @date 2021-07-04
 **/
public class HuaweiFactory implements IProductFactory{

    @Override
    public IPhoneProduct getIPhoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct getIRouterProduct() {
        return new HuaweiRouter();
    }
}
