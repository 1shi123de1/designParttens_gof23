package online.ylqdh.codelearn.gof23.proxy.staticProxy;

/**
 * @Description: houseOwner
 * @author: yeliqun
 * @date 2021-07-10
 **/
public class Host implements Rent{


    @Override
    public void rent() {
        System.out.println("房东出租房子");
    }
}
