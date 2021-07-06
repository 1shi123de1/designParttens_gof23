package online.ylqdh.codelearn.gof23.Bridge;

/**
 * @Description: 客户端类，使用到的地方
 * @author: yeliqun
 * @date 2021-07-06
 **/
public class Client {
    public static void main(String[] args) {

        // 苹果品牌台式机
        Computer computer = new Desktop(new Apple());
        computer.cinfo();

        // 苹果品牌笔记本
        Computer computer1 = new Laptop(new Apple());
        computer1.cinfo();

        // 联想品牌台式机
        Computer computer2 = new Desktop(new Lenovo());
        computer2.cinfo();

        // 联想品牌笔记本
        Computer computer3 = new Laptop(new Lenovo());
        computer3.cinfo();
    }
}
