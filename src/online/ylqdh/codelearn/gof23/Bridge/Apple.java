package online.ylqdh.codelearn.gof23.Bridge;

/**
 * @Description: 苹果品牌, 实现Brand接口
 * @author: yeliqun
 * @date 2021-07-06
 **/
public class Apple implements Brand {
    @Override
    public void info() {
        System.out.print("苹果品牌-");
    }
}
