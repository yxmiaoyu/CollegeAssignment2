package javaclass.base;


import java.util.List;

public class ShoppingCar {
    //商品信息
    private Object good;
    //数量
    private int num;
    //总价
    private double money;

    public ShoppingCar(Object good, int num, double money) {
        this.good = good;
        this.num = num;
        this.money = money;
    }

    public Object getGood() {
        return good;
    }

    public void setGood(Object good) {
        this.good = good;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "ShoppingCar{" +
                "good=" + good +
                ", \n商品数量=" + num +
                ", 总金额=" + money +
                '}';
    }
}
