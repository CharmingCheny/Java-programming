import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s1, s2;
        s1 = sc.nextLine();// 输入一个字符串
        s2 = s1.replaceAll("[a-zA-z]+", "");// 只保留数字，其中第一个“”中内容换成第二个“”中内容
        System.out.println("原来字符串：" + s1 + "\n" + "现在字符串：" + s2);
    }
}
