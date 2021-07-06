package online.ylqdh.codelearn.gof23.Bridge;

/**
 * @Description: 电脑，想跟品牌结合
 * @author: yeliqun
 * @date 2021-07-06
 **/
public abstract class Computer {

    // 组合，把品牌组合进电脑中;又是用构造方法,把品牌对象放进构造方法中
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    void cinfo() {
        brand.info(); // 电脑品牌
    }
}

class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    void cinfo() {
        super.cinfo();
        System.out.println("台式机");
    }
}

class Laptop extends Computer {

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    void cinfo() {
        brand.info();
        System.out.println("笔记本");
    }
}