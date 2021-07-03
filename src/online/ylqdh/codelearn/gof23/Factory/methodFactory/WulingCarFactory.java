package online.ylqdh.codelearn.gof23.Factory.methodFactory;

/**
 * @Description:Wuling工厂类
 * @author: yeliqun
 * @date 2021-07-04
 **/
public class WulingCarFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Wuling();
    }
}
