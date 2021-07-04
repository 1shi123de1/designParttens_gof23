package online.ylqdh.codelearn.gof23.Builder.demo;

/**
 * @Description: 工人负责填充产品的内容
 * @author: yeliqun
 * @date 2021-07-04
 **/
public class Worker extends Builder{

    private Product product = null;
    public Worker() {
        product = new Product();
    }

    @Override
    void buildA() {
        product.setBuilderA("地基");
        System.out.println("地基");
    }

    @Override
    void buildB() {
        product.setBuilderB("钢筋工程");
        System.out.println("钢筋工程");
    }

    @Override
    void buildC() {
        product.setBuilderC("水电");
        System.out.println("水电");
    }

    @Override
    void buildD() {
        product.setBuilderD("粉刷");
        System.out.println("粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
