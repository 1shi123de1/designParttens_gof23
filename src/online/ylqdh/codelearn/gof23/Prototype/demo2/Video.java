package online.ylqdh.codelearn.gof23.Prototype.demo2;

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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();

        // 实现深克隆的操作
        // (序列化、反序列化也可以实现深克隆)
        Video v = (Video) obj;
        v.date = (Date) this.date.clone();  // 将属性也进行克隆,

        return obj;
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
