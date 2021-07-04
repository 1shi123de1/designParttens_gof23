package online.ylqdh.codelearn.gof23.Builder.demo;

/**
 * @Description: 指挥，负责拼凑产品
 * @author: yeliqun
 * @date 2021-07-04
 **/
public class Director {
    // 指挥工人按照顺序建造
    public Product build(Builder builder) {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();

        return builder.getProduct();
    }
}
