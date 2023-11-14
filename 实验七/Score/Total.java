package Score;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Total {
    public static double getTotal(String s) {// 计算总分的函数
        Scanner sc = new Scanner(s);
        sc.useDelimiter("[^0123456789.]+");// 设置分隔符
        double total = 0;// 总分
        while (sc.hasNext()) {// 获取字符串直到为null
            try {
                double score = sc.nextDouble();
                total += score;
            } catch (InputMismatchException exp) {// 获取输入不匹配的错误
                String t = sc.next();
            }
        }
        return total;
    }
}