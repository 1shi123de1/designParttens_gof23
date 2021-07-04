package online.ylqdh.codelearn.gof23.Builder.demo2;

/**
 * @Description: 工人，负责具体的建造
 * @author: yeliqun
 * @date 2021-07-04
 **/
public class Worker extends Builder{

    private Product product;
    public Worker() {
        product = new Product();
    }

    @Override
    Builder builderA(String msg) {
        product.setBuilderA(msg);
        return this;
    }

    @Override
    Builder builderB(String msg) {
        product.setBuilderB(msg);
        return this;
    }

    @Override
    Builder builderC(String msg) {
        product.setBuilderC(msg);
        return this;
    }

    @Override
    Builder builderD(String msg) {
        product.setBuilderD(msg);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
