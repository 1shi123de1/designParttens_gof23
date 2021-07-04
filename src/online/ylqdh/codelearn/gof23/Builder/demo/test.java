package online.ylqdh.codelearn.gof23.Builder.demo;

/**
 * @Description: 测试类
 * @author: yeliqun
 * @date 2021-07-04
 **/
public class test {
    public static void main(String[] args) {
        Director director = new Director();
        Product build = director.build(new Worker());
        System.out.println(build.toString());
    }
}
