package online.ylqdh.codelearn.gof23.FlyWeight;

/**
 * @Description: 巷元抽象类或者接口
 * @author: yeliqun
 * @date 2021-07-17
 **/
public class ConcreteFlyWeight implements FlyWeight{
    private String key;

    /**
     * 构造方法
     * @param key
     */
    public ConcreteFlyWeight(String key) {
        this.key = key;
    }

    /**
     * 非共享元素
     * @param element
     */
    @Override
    public void operate(UnShareElement element) {
        System.out.println(element.getInfo());
    }

}
