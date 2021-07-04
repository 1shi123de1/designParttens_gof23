package online.ylqdh.codelearn.gof23.Builder.demo;

/**
 * 抽象类，构建者 四个抽象方法,代表四个步骤
 */
public abstract class Builder {
    abstract void buildA();

    abstract void buildB();

    abstract void buildC();

    abstract void buildD();

    // 得到具体产品
    abstract Product getProduct();
}
