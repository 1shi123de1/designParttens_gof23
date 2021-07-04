package online.ylqdh.codelearn.gof23.Builder.demo;

/**
 * @Description: 产品实体类，要实现的东西
 * @author: yeliqun
 * @date 2021-07-04
 **/
public class Product {
    private String builderA;
    private String builderB;
    private String builderC;
    private String builderD;

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
