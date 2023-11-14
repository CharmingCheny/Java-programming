import java.util.Calendar;
import java.util.Scanner;

public class CountDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        args = new String[6];// 创建对象，存储日期
        for (int i = 0; i < 6; i++) {
            args[i] = sc.next();// 输入两次年月日
        }
        Calendar date1 = Calendar.getInstance();// 在getInstance方法内部实例化了Calendar对象并返回了
        date1.set(Calendar.YEAR, Integer.parseInt(args[0]));// 设置年
        date1.set(Calendar.MONTH, Integer.parseInt(args[1]));// 设置月
        date1.set(Calendar.DATE, Integer.parseInt(args[2]));// 设置日
        Calendar date2 = Calendar.getInstance();
        date2.set(Calendar.YEAR, Integer.parseInt(args[3]));// 设置年
        date2.set(Calendar.MONTH, Integer.parseInt(args[4]));// 设置月
        date2.set(Calendar.DATE, Integer.parseInt(args[5]));// 设置日
        long delta = Math.abs(date1.getTimeInMillis() - date2.getTimeInMillis());// 转换成微秒进行计算
        int days = (int) (delta / 1000 / 60 / 60 / 24);// 换算成具体天数
        System.out.println("从" + date1.get(Calendar.YEAR) + "-" + date1.get(Calendar.MONTH) + "-"
                + date1.get(Calendar.DATE) + "到" + date2.get(Calendar.YEAR) + "-" + date2.get(Calendar.MONTH) + "-"
                + date2.get(Calendar.DATE) + "总共间隔：" + days + "天");// 打印间隔天数
    }
}
