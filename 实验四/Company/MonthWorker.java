package Company;

public class MonthWorker extends Employee {
    int month = 40;// 初始化
    double monthSalary = 1025.01;// 初始化

    public double earnings() {// 重写方法
        return month * monthSalary;
    }

}
