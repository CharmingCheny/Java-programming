package Bank;

public class Test2 {
    public static void main(String[] args) {
        int money = 10000;// 存钱1w
        ConstructionBank cb = new ConstructionBank();
        BankOfDalian db = new BankOfDalian();
        cb.savedMoney = money;// 给父类变量值
        cb.year = 5.216;// 子类变量值
        double interest1 = cb.computerInterest();
        db.savedMoney = money;
        db.year = 5.216;
        double interest2 = db.computerInterest();
        double delta = Math.abs(interest1 - interest2);// 为了防止出现负数用绝对值
        System.out.println(String.format("%d元存在建设银行%d年零%d天的利息：%f", money, (int) cb.year, cb.day, interest1));
        System.out.println(String.format("%d元存在大连银行%d年零%d天的利息：%f", money, (int) db.year, db.day, interest2));
        System.out.println("两个银行利息相差" + delta + "元");
    }
}
