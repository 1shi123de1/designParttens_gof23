package online.ylqdh.codelearn.gof23.FlyWeight;

/**
 * @Description:
 * @author: yeliqun
 * @date 2021-07-17
 **/
public class Client {
    public static void main(String[] args) {
        FlyWeightFactory fwf = new FlyWeightFactory();
        FlyWeight a1 = fwf.getFlyWeight("a");
        FlyWeight a2 = fwf.getFlyWeight("a");
        FlyWeight a3 = fwf.getFlyWeight("a");
        fwf.getFlyWeight("bbb");
        fwf.getFlyWeight("bbb");

        a1.operate(new UnShareElement("a"));

    }
}
