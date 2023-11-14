package Company;

public class WeekWorker extends Employee {

    int week = 30;// 初始化
    double weekSalary = 1000.25;// 初始化

    public double earnings() {// 重写方法
        return week * weekSalary;
    }

}
