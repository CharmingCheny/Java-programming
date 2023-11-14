package Company;

public class YearWorker extends Employee {
    int year = 1;// 初始化
    double yearSalary = 2000.56;// 初始化

    public double earnings() {// 重写方法
        return year * yearSalary;
    }

}
