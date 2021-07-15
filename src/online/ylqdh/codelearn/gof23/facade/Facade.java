package online.ylqdh.codelearn.gof23.facade;

/**
 * @Description: 门面类，用来承接两个子系统;外面直接调用facade，不感知子系统
 * @author: yeliqun
 * @date 2021-07-16
 **/
public class Facade {
    SubSystem1 subSystem1 = new SubSystem1();
    SubSystem2 subSystem2 = new SubSystem2();

    /**
     * 方法1. 直接调用子系统的方法1
     */
    public void open() {
        subSystem1.open();
        subSystem2.open();
    }

    /**
     * 方法2. 直接调用子系统的方法2
     */
    public void close() {
        subSystem1.close();
        subSystem2.close();
    }
}
