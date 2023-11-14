package Bank;

public class BankOfDalian extends Bank {
    double year;// 隐藏父类year重新定义
    int day;// 存储的天数

    public double computerInterest() {
        super.year = (int) year;// 这样就可以使父类的year存储整数部分
        double y = -super.year + year;// 原来的数-整数部分就是小数部分
        day = (int) (y * 1000);// 计算实际的天数
        double interest1 = super.computerInterest();// 调用父类方法计算年利
        double interest2 = day * 0.00037 * savedMoney;// 计算日利
        return interest1 + interest2;// 二者相加就是总共的钱
    }
}
