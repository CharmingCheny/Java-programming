import java.util.Scanner;

public class Date {
    public static int Leap(int year) {// 判断是否为闰年的函数
        if (year < 0) {// 首先判断年份是否合法
            return -1;
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {// 闰年
            return 1;
        } else {// 平年
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("按如下格式输入日期：(****/**/**)");// 输入提示
        String str = sc.nextLine();
        String[] date_str = str.split("/");// 按照分隔符/进行分割
        int[] date = new int[3];
        for (int i = 0; i < 3; i++) {// 用数组分别存入年月日
            date[i] = Number.parseInt(date_str[i]);
        }
        int sign;// 年份的标识符
        sign = Leap(date[0]);
        if (sign == -1) {// 年份不合法
            System.out.println(str + "不是日期");
        } else {// 年份合法
            if (date[1] < 1 || date[1] > 12) {// 月份不合法
                System.out.println(str + "不是日期");
            } else {// 月份合法
                if (date[1] == 1 || date[1] == 3 || date[1] == 5 || date[1] == 7 || date[1] == 8 || date[1] == 10
                        || date[1] == 12) {// 判断是不是大月
                    if (date[2] > 31 || date[2] < 1) {// 大月的话日子不能超过31或者小于1
                        System.out.println(str + "不是日期");
                    } else {
                        System.out.println(str + "是合法日期");
                    }
                } else if (date[1] == 4 || date[1] == 6 || date[1] == 9 || date[1] == 11) {// 小月
                    if (date[2] > 30 || date[2] < 1) {// 小月的话日子不能超过30或者小于1
                        System.out.println(str + "不是日期");
                    } else {
                        System.out.println(str + "是合法日期");
                    }
                } else {// 2月
                    if (sign == 0) {// 平年
                        if (date[2] > 28 || date[2] < 1) {// 平年2月的日子不能超过28或者小于1
                            System.out.println(str + "不是日期");
                        } else {
                            System.out.println(str + "是合法日期");
                        }
                    } else {// 闰年
                        if (date[2] > 29 || date[2] < 1) {// 闰年2月的日子不能超过29或者小于1
                            System.out.println(str + "不是日期");
                        } else {
                            System.out.println(str + "是合法日期");
                        }
                    }

                }
            }
        }
    }
}