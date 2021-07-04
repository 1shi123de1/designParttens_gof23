package online.ylqdh.codelearn.gof23.Prototype.demo2;

import java.util.Date;

/**
 * @Description: 测试类，测试克隆
 * @author: yeliqun
 * @date 2021-07-05
 **/
public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video v1 = new Video("克隆", date);

        Video v2 = (Video)v1.clone(); // 克隆对象

        // 可以看到v2的属性和v1一样，是从v1克隆出来的，而且hashcode不一样
        System.out.println("v1 --> " + v1 + "\t v1.hashcode: " + v1.hashCode());
        System.out.println("v2 --> " + v2 + "\t v2.hashcode: " + v2.hashCode());

        System.out.println("=================================");

        // date对象改变了,但是v2的对象没有跟着改变，说明v2的属性也克隆了自己的一份，是深克隆
        date.setTime(100);
        System.out.println("v1 --> " + v1 + "\t v1.hashcode: " + v1.hashCode());
        System.out.println("v2 --> " + v2 + "\t v2.hashcode: " + v2.hashCode());
    }
}
