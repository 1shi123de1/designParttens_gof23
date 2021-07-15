package online.ylqdh.codelearn.gof23.facade;

/**
 * @Description: 客户端，不直接调用子系统，调用facade
 * @author: yeliqun
 * @date 2021-07-16
 **/
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.open();
        facade.close();
    }
}
