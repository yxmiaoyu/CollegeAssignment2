package javaclass.goods;

import javaclass.base.Supply;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class InitGoods {
    public static final String TYPENAME = "商品类型";

    public static Map init() {
        //总数居
        Map m = new HashMap();
        //商品类型
        List typelist = new ArrayList();

        // 初始化computer数据
        List computerlist = new ArrayList();
        Supply computers1 = new Supply("联想天晴东方专卖店", "中国北京市", "010-87654321");
        Supply computers2 = new Supply("hp兴荣和专卖店", "中国辽宁大连市", "0411-81669801");
        Computer computer11 = new Computer("Lenovo/联想 YOGA710 -14ISK", 5699.00, computers1, "英特尔 酷睿 i5-7200U", "4G",
                "固态256G", "银色");
        Computer computer12 = new Computer("Lenovo/联想 YOGA 5 Pro yoga910", 9999.00, computers1, "英特尔 酷睿 i5-7200U", "8G",
                "固态512G", "酒红色");
        Computer computer21 = new Computer("HP/惠普 暗影精灵Ⅱ Pro", 5399.00, computers2, " 英特尔 酷睿 i5-7300HQ", "8G", "机械1TB",
                "黑色");
        Computer computer22 = new Computer("HP/惠普 Spectre Pro X360", 9399.00, computers2, "英特尔 酷睿 i5-7200U", "8G",
                "固态256G", "月光银");
        computerlist.add(computer11);
        computerlist.add(computer12);
        computerlist.add(computer21);
        computerlist.add(computer22);
        //添加类型 电脑
        typelist.add(Computer.COMPUTER);
        m.put(Computer.COMPUTER, computerlist);


        // 初始化衣服数据
        List clothinglist = new ArrayList();
        Supply clothings1 = new Supply("阿迪达斯东城专卖店", "中国北京市", "010-87654321");
        Supply clothings2 = new Supply("耐克西城专卖店", "中国辽宁大连市", "0411-81669801");
        Clothing clothing11 = new Clothing("2017运动套装", 810, clothings1, "男装", "L-2XL", "黑色、白色");
        Clothing clothing12 = new Clothing("2017情侣套装", 990, clothings1, "情侣装", "（L-3XL & M-2XL）", "橘色、灰色");
        Clothing clothing21 = new Clothing("2017夏春运动休闲圆领短袖T恤", 480, clothings2, "男装", "（M-4XL）", "暗红色、黑色、深蓝色");
        Clothing clothing22 = new Clothing("2017夏季速干体恤半袖上衣运动T恤", 320, clothings2, "女装", "（S-3XL）", "橘色、绿色、玫红色");
        clothinglist.add(clothing11);
        clothinglist.add(clothing12);
        clothinglist.add(clothing21);
        clothinglist.add(clothing22);
        typelist.add(Clothing.CLOTHING);
        m.put(Clothing.CLOTHING, clothinglist);


        // 初始化键盘数据
        List keyBoardList = new ArrayList();
        Supply keyBoard1 = new Supply("小米专卖店", "中国北京市", "010-87654321");
        Supply keyBoard2 = new Supply("苹果专卖店", "中国大连市", "0411-81669801");
        KeyBoard keyBoard11 = new KeyBoard("小米键盘 A", 810, keyBoard1, " A - 1 ", "黑色、白色");
        KeyBoard keyBoard12 = new KeyBoard("小米键盘 B", 990, keyBoard1, " A - 2 ", "橘色、灰色");
        KeyBoard keyBoard21 = new KeyBoard("苹果键盘 A", 480, keyBoard2, " B - 1 ", "暗红色、黑色、深蓝色");
        KeyBoard keyBoard22 = new KeyBoard("苹果键盘 B", 320, keyBoard2, " B - 2 ", "橘色、绿色、玫红色");
        keyBoardList.add(keyBoard11);
        keyBoardList.add(keyBoard12);
        keyBoardList.add(keyBoard21);
        keyBoardList.add(keyBoard22);
        typelist.add(KeyBoard.KEYBOARD);
        m.put(KeyBoard.KEYBOARD, keyBoardList);


        // 初始化鼠标数据
        List mouseList = new ArrayList();
        Supply mouse1 = new Supply("雷蛇专卖店", "中国北京市", "010-87654321");
        Supply mouse2 = new Supply("拼多多专卖店", "中国大连市", "0411-81669801");
        Mouse mouse11 = new Mouse("雷蛇 A", 810, mouse1, "200A", "黑色、白色");
        Mouse mouse12 = new Mouse("雷蛇 B", 990, mouse1, "200B", "橘色、灰色");
        Mouse mouse21 = new Mouse("苹果 A", 480, mouse2, "pddA", "暗红色、黑色、深蓝色");
        Mouse mouse22 = new Mouse("苹果 B", 320, mouse2, "pddB", "橘色、绿色、玫红色");
        mouseList.add(mouse11);
        mouseList.add(mouse12);
        mouseList.add(mouse21);
        mouseList.add(mouse22);
        typelist.add(Mouse.MOUSE);
        m.put(Mouse.MOUSE, mouseList);


        m.put(TYPENAME, typelist);
        return m;
    }

}
