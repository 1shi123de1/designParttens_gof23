package online.ylqdh.codelearn.gof23.Adapter;

/**
 * @Description: 客户端，电脑要连接网线上网
 * @author: yeliqun
 * @date 2021-07-05
 **/
public class Computer {
    // 电脑要连接网线才能上网,否则computer类和Adaptee类没有任何关联; 这里插上适配器就可以了
    public void net(NetToUsb adapter) {
        adapter.handleRequest();
    }

    public static void main(String[] args) {
        // 电脑 适配器 网线
        Computer computer = new Computer(); // 电脑
        Adaptee adaptee = new Adaptee(); // 网线
        Adapter adapter = new Adapter(); // 适配器
        Adapter2 adapter2 = new Adapter2(adaptee); // 适配器2

        computer.net(adapter2);
    }
}
