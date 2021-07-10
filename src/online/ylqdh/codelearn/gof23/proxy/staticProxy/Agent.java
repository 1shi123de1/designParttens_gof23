package online.ylqdh.codelearn.gof23.proxy.staticProxy;

/**
 * @Description: 中介
 * @author: yeliqun
 * @date 2021-07-10
 **/
public class Agent {
    Host host = null;

    public Agent() {}

    public Agent(Host host) {
        this.host = host;
    }

    // 中介出租房子
    public void rent() {
        seeHouse();
        contract();
        host.rent();
        fee();
    }

    // 中介收中介费
    public void fee() {
        System.out.println("收取中介费");
    }

    // 签订合同
    public void contract() {
        System.out.println("和中介签合同");
    }

    // 中介带去看房
    public void seeHouse() {
        System.out.println("中介带你去看房");
    }
}
