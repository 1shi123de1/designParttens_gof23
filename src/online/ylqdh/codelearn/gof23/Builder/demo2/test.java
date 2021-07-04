package online.ylqdh.codelearn.gof23.Builder.demo2;

/**
 * @Description: 测试类，这里没有具体的指挥了
 * @author: yeliqun
 * @date 2021-07-04
 **/
public class test {
    public static void main(String[] args) {
        Worker worker = new Worker();

        // 不设置，用的默认值
        Product product = worker.getProduct();
        System.out.println(product.toString());

        // 链式编程，
        // 按照自定义，设置喜好值;
        // 因为builderA/builderB/builderC/builderD方法返回的都是builder对象，所以可以再接着调用其他的builder方法
        Product product1 = worker.builderA("全家桶").builderB("雪碧").getProduct();
        System.out.println(product1.toString());
    }
}
