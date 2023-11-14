package Bank;

public class Bank {
    int year, savedMoney;// 成员变量：存的年数，存的钱数目
    double interest;// 利息

    public double computerInterest() {
        interest = year * 0.035 * savedMoney;// 算年利率
        return interest;
    }
}
