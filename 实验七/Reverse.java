package 实验七;

import java.io.*;

public class Reverse {
    public static void main(String[] args) {
        RandomAccessFile inAndOut = null;
        try {
            inAndOut = new RandomAccessFile("text1.txt", "r");
            long num = inAndOut.length() / 3;// 长度计算
            String str = null;
            StringBuilder sb = new StringBuilder();// new一个可变的字符序列
            while (--num != 0) {// 逐个添加到序列
                if ((str = inAndOut.readLine()) != null) {// 不打印空字符
                    sb.append(str);
                    sb.append("\n");
                }

            }
            inAndOut.close();
            System.out.println(sb.reverse());// 可变字符串倒叙输出

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
