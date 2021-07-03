package online.ylqdh.codelearn.gof23.Factory.methodFactory;

/**
 * @Description:
 * @author: yeliqun
 * @date 2021-07-04
 **/
public class DazhongCarFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Dazhong();
    }
}
