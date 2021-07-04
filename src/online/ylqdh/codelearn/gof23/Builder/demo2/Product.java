package online.ylqdh.codelearn.gof23.Builder.demo2;

/**
 * @Description: 产品实体类
 * @author: yeliqun
 * @date 2021-07-04
 **/
public class Product {
    private String builderA = "汉堡";
    private String builderB = "可乐";
    private String builderC = "薯条";
    private String builderD = "甜点";

    @Override
    public String toString() {
        return "Product{" + "builderA='" + builderA + '\'' + ", builderB='" + builderB + '\'' + ", builderC='"
            + builderC + '\'' + ", builderD='" + builderD + '\'' + '}';
    }

    public String getBuilderA() {
        return builderA;
    }

    public void setBuilderA(String builderA) {
        this.builderA = builderA;
    }

    public String getBuilderB() {
        return builderB;
    }

    public void setBuilderB(String builderB) {
        this.builderB = builderB;
    }

    public String getBuilderC() {
        return builderC;
    }

    public void setBuilderC(String builderC) {
        this.builderC = builderC;
    }

    public String getBuilderD() {
        return builderD;
    }

    public void setBuilderD(String builderD) {
        this.builderD = builderD;
    }
}
