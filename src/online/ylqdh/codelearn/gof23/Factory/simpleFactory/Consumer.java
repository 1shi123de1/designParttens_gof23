package online.ylqdh.codelearn.gof23.Factory.simpleFactory;

/**
 * @Description:  消费者，消费car
 * @author: yeliqun
 * @date 2021-07-04
 **/
public class Consumer {
    public static void main(String[] args) {
        // 最直接的方式，通过接口new对象
        Car car = new Wuling();
        Car car2 = new Baoma();

        car.name();
        car2.name();

        // 2. 通过简单工厂
        Car car3 = CarFactory.getCar("五菱宏光");
        Car car4 = CarFactory.getCar("宝马");

        car3.name();
        car4.name();
    }
}
