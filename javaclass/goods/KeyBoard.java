package javaclass.goods;

import javaclass.base.Goods;
import javaclass.base.Supply;


public class KeyBoard extends Goods {
    public static final String KEYBOARD = "键盘";
    public String name, size, colour;

    public KeyBoard(String name,double price, Supply supply , String size, String colour) {
        super(KEYBOARD, supply);
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
