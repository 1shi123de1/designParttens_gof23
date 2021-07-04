package online.ylqdh.codelearn.gof23.Factory.abstractFactory;

/**
 * @Description: 小米产品工厂
 * @author: yeliqun
 * @date 2021-07-04
 **/
public class XiaomiFactory implements IProductFactory {

    @Override
    public IPhoneProduct getIPhoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public IRouterProduct getIRouterProduct() {
        return new XiaomiRouter();
    }
}
