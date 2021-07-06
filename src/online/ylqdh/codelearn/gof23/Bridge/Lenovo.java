package online.ylqdh.codelearn.gof23.Bridge;

/**
 * @Description: 联想品牌,实现Brand接口
 * @author: yeliqun
 * @date 2021-07-06
 **/
public class Lenovo implements Brand {
    @Override
    public void info() {
        System.out.print("联想品牌-");
    }
}
