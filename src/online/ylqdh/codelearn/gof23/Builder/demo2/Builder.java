package online.ylqdh.codelearn.gof23.Builder.demo2;

/**
 * @Description: 建造者
 * @author: yeliqun
 * @date 2021-07-04
 **/
public abstract class Builder {
    abstract Builder builderA(String msg); // 汉堡

    abstract Builder builderB(String msg); // 可乐

    abstract Builder builderC(String msg); // 薯条

    abstract Builder builderD(String msg); // 甜点

    abstract Product getProduct();
}
