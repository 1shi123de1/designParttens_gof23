package online.ylqdh.codelearn.gof23.FlyWeight;

import java.util.HashMap;

/**
 * @Description: 享元工厂类
 * @author: yeliqun
 * @date 2021-07-17
 **/
public class FlyWeightFactory {
    HashMap<String, FlyWeight> flyWeightHash = new HashMap<>();

    /**
     * 加了类似缓存的功能，使得flyweith的key是唯一的;而UnShareElement的实例没有加缓存的功能,所以不是唯一的
     * @param key
     * @return
     */
    public FlyWeight getFlyWeight(String key) {
        if (flyWeightHash.containsKey(key)) {
            System.out.println("已有 " + key + ", 直接返回");
        } else {
            System.out.println("第一次调用 " + key);
            flyWeightHash.put(key, new ConcreteFlyWeight(key));
        }
        return flyWeightHash.get(key);
    }
}
