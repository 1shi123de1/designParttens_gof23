package online.ylqdh.codelearn.gof23.Factory.simpleFactory;

/**
 * @Description:  car简单工厂类
 * @author: yeliqun
 * @date 2021-07-04
 **/
public class CarFactory {
    //
    //

    /**
     * 静态工厂
     * 当有新的类时，需要修改getCar方法，违反了开闭原则，对扩展开放，对修改关闭
     * @param car
     * @return
     */
    public static Car getCar(String car) {
        if (car.equals("五菱宏光")) {
            return new Wuling();
        } else if (car.equals("宝马")) {
            return new Baoma();
        } else {
            return null;
        }
    }
}
