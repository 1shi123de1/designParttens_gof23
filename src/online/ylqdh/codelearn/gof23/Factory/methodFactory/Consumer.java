package online.ylqdh.codelearn.gof23.Factory.methodFactory;

/**
 * @Description:  消费者，消费car
 * @author: yeliqun
 * @date 2021-07-04
 **/
public class Consumer {
    public static void main(String[] args) {
        // 方法工厂模式，通过各自不同的工厂获得实例，不经过统一的工厂
        Car car = new WulingCarFactory().getCar();
        Car car2 = new BaomaCarFactory().getCar();

        car.name();
        car2.name();

        // 这时要新增一个新的车，直接增加一个类实现car,一个类实现CarFactory即可
        Car car3 = new DazhongCarFactory().getCar();
        car3.name();
    }
}
