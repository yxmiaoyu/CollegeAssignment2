package javaclass.purchase;

import javaclass.base.CInput;
import javaclass.base.Goods;
import javaclass.base.ShoppingCar;
import javaclass.goods.InitGoods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Purchase {

    //商品总数据类型
    public Map m = new HashMap();
    //商品类型 电脑，衣服
    public List typelist = new ArrayList();
    //实际的商品列表
    //里面的每一项都是某种类型的商品集合
    public List goodslist = new ArrayList();
    //用户名与密码
    private String userName = "admin";
    private String password = "123456";
    private double money = 100000;

    private List shoppingCarsList = new ArrayList();

    public Purchase() {
        m = InitGoods.init();
        typelist = (List) m.get(InitGoods.TYPENAME);
        show("欢迎使用采购系统\n请按提示操作");
    }

    // 处理系统欢迎文字
    public void show(String s) {
        int l = s.length();
        if (l > 30) {
            l = 30;
        }
        s = "\n" + s + "\n";
        for (int i = 0; i < l * 2 - 1; i++) {
            s = "*" + s + "*";
        }
        System.out.println(s);
    }

    // 处理分割显示
    public void show() {
        String s = "";
        for (int i = 0; i < 30; i++) {
            s = "*" + s;
        }
        System.out.println(s);
    }

    public void dowith() {

        System.out.println("商品种类如下：");
        for (int i = 0; i < typelist.size(); i++) {
            //序号从1开始展示，实际数据从0开始展示
            System.out.println((i + 1) + "、" + typelist.get(i));
            //储存时候按照实际序号存储
            goodslist.add(i, (List) m.get(typelist.get(i)));
        }

        try {
            show();
            int type = CInput.readInt("请选择商品种类：") - 1;
            //参数是实际的商品类型序号
            show();
            selecttype(type);
            display(type);
        } catch (Exception e) {
            System.out.println("\n请输入正确的序号！！\n");
            dowith();
        }
    }


    //根据输入的商品类型，展示某种类具体的商品信息
    public void selecttype(int type) {
        //类型序号越界判断
        if (type > goodslist.size() - 1 || type < 0) {
            System.out.println("\n请输入正确的序号！！\n");
            dowith();
        } else {
            List list = new ArrayList();
            //获得具体某种商品的列表
            list = (List) goodslist.get(type);
            for (int i = 0; i < list.size(); i++) {
                //打印每一项商品的信息
                System.out.println("商品购买序号：" + (i + 1));
                System.out.println(list.get(i));
                show();
            }
        }
    }


    //挑选某种商品
    public void display(int type) {
        int s = CInput.readInt("请输入商品购买序号:") - 1;
        //开始购买商品
        //参数1：明确类型的某种商品的序号
        //参数2：商品的种类
        dowith(s, type);
    }


    //具体的购买商品
    public void dowith(int s, int type) {
        buy((List) goodslist.get(type), s, type);
    }


    //list是挑选好的那种类型的所有商品数据
    public void buy(List list, int i, int type) {
        int n = CInput.readInt("请输入购买数量:");
        while (n <= 0) {
            System.out.println("\n请输入大于0的整数！\n");
            n = CInput.readInt("请输入购买数量:");
            show();
        }
        Goods g = (Goods) list.get(i);
        System.out.println("购买商品详细信息如下：");
        show();
        System.out.println(list.get(i));
        System.out.println("总价格：" + (g.price * n) + ",总数量：" + n);
        System.out.println();
        show();
        //放入购物车
        ShoppingCar shoppingCar = new ShoppingCar(list.get(i), n, (g.price * n));
        shoppingCarsList.add(shoppingCar);

        System.out.println("采购成功，是否继续采购(Y/N)\n");
        String s = CInput.myReadingString();
        while (s.equals("y") == false && s.equals("Y") == false && s.equals("N")==false && s.equals("n")==false) {
            show("信息输入有误，请重新输入\n");
            s = CInput.myReadingString();

        }

        if (s.equalsIgnoreCase("y") || s.equals("Y")) {
            dowith();
        } else {
            show("打开购物车，开始购物结算,您的账户余额为 " + money);
            double count = 0;
            for (Object car : shoppingCarsList) {
                System.out.println(car.toString());
                ShoppingCar ss = (ShoppingCar) car;
                count += ss.getMoney();
                show();
            }
            show("您的购物车内商品总金额为：" + count);
            if (money >= count) {
                money = money - count;
                System.out.println("商品购买成功，您本次消费：" + count + " 元，账户余额为：" + money);
            } else {
                System.out.println("您的余额不足，请充值后在消费");
            }
            show("本次购物结束，系统退出");
            System.exit(0);


        }
    }

    //----------------------------------------------------------------------

    /**
     * 登录
     */
    public boolean login(String userName, String password) {
        if (this.userName.equals(userName) && this.password.equals(password)) {
            show("尊敬的: " + userName + " 用户，欢迎登陆");
            return true;
        } else {
            show("账号或密码输入错误，系统退出");
            System.exit(0);
        }
        return false;
    }

    /**
     * 查看商品类型列表
     */
    public void showGoodsStyle() {
        System.out.println("商品种类如下：");
        for (int i = 0; i < typelist.size(); i++) {
            System.out.println((i + 1) + "、" + typelist.get(i));
            goodslist.add(i, (List) m.get(typelist.get(i)));
        }

        try {
            show();
            int type = CInput.readInt("请选择商品种类：") - 1;
            selecttype(type);
            display(type);
        } catch (Exception e) {
            System.out.println("\n请输入正确的序号！！\n");
            dowith();
        }
    }

}
