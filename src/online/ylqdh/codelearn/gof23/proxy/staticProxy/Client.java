package online.ylqdh.codelearn.gof23.proxy.staticProxy;

/**
 * @Description: 客户端，租客
 * @author: yeliqun
 * @date 2021-07-10
 **/
public class Client {
    public static void main(String[] args) {
        Host host = new Host();

        Agent proxy = new Agent(host);

        proxy.rent();
    }
}
