package javaclass.test;


import javaclass.base.CInput;
import javaclass.purchase.Purchase;


public class Test {
    public static void main(String[] args) {

        //系统初始化
        Purchase purchase = new Purchase();

        //购物功能。商品展示功能。结算功能
        //这些再加上老师那个原功能就行


        boolean judge = false;
        while (judge == false) {
            /*登录*/
            purchase.show("请输入用户名：");
            String userName = CInput.myReadingString();
            purchase.show("请输入密码");
            String password = CInput.myReadingString();
            judge = purchase.login(userName, password);
            if (judge) {
                purchase.dowith();
            } else {
                System.out.println("用户信息输入错误，请重新输入哦");
            }
        }


        //查看商品列表/商品类型展示


    }
}
