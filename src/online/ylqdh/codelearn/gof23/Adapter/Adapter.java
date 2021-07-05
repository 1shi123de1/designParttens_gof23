package online.ylqdh.codelearn.gof23.Adapter;

/**
 * @Description: 真正的适配器, 需要连接USB,连接网线
 *               1. 继承 -- 类适配器，单继承的只能适配一个
 * @author: yeliqun
 * @date 2021-07-05
 **/
public class Adapter extends Adaptee implements NetToUsb{
    @Override
    public void handleRequest() {
        super.request();
    }
}
