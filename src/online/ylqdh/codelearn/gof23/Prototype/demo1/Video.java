package online.ylqdh.codelearn.gof23.Prototype.demo1;

import java.util.Date;

/**
 * @Description: 原型类
 *               实现类对象的可克隆： 1. 实现一个接口 Cloneable;  2. 重写一个方法 clone
 * @author: yeliqun
 * @date 2021-07-05
 **/
public class Video implements Cloneable{
    private String tile;
    private Date date;

    /**
     *  这里没有重写自己的方法，只继承了父类的写法，是浅克隆的模式
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Video() {}

    public Video(String tile, Date date) {
        this.tile = tile;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Video{" +
                "tile='" + tile + '\'' +
                ", date=" + date +
                '}';
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
