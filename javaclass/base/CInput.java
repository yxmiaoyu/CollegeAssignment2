package javaclass.base;

import java.util.Scanner;

public class CInput {
    public static Scanner sc = new Scanner(System.in);

    public static String readString(String s) {
        System.out.print(s);
        return readString();
    }

    public static String readString() {
        String temp = sc.next();
        if (temp.equalsIgnoreCase("quit")) {
            System.out.println("谢谢使用，再见~");
            System.exit(0);
        }
        return temp;
    }

    public static int readInt(String s) {
        String a = readString(s);
        try {
            Integer.parseInt(a);
            return Integer.parseInt(a);
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

    public static int readInt() {
        String a = readString();
        try {
            Integer.parseInt(a);
            return Integer.parseInt(a);
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

    public static double readDouble(String s) {
        String a = readString(s);
        try {
            Double.parseDouble(a);
            return Double.parseDouble(a);
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

    public static int readDouble() {
        String a = readString();
        try {
            Integer.parseInt(a);
            return Integer.parseInt(a);
        } catch (NumberFormatException ex) {
            return 0;
        }
    }


    //增加自定义的循环判定方法
    //系统输入字符串合理性检查
    public static String myReadingString() {
        //获取输入
        String s = sc.next();
        while (s == null && s.equals("") == true) {
            //校验失败
            System.out.println("输入失败，请重新输入数据");
            s = sc.next();
        }
        return s;
    }
}
