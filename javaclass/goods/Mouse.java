package javaclass.goods;

import javaclass.base.Goods;
import javaclass.base.Supply;


public class Mouse extends Goods {
    public static final String MOUSE = "鼠标";
    public String name, size, colour;
    public Mouse(String name,double price, Supply supply,  String size, String colour) {
        super(MOUSE, supply);
        super.price=price;
        this.name = name;
        this.size = size;
        this.colour = colour;
    }
    @Override
    public String toString() {
        return super.toString() + "\n产品名称：" + this.name + " 价格：" + this.price + "\n产品信息：\n" + "，颜色:"
                + this.colour + "，型号:" + this.size + super.supplydesc();
    }
}
