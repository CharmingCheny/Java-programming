package Company;

public class Test3 {
    public static void main(String[] args) {
        Employee e[] = new Employee[3];// Employee变量
        e[0] = new YearWorker();
        e[1] = new MonthWorker();
        e[2] = new WeekWorker();
        Company com = new Company(e);
        double sum;
        sum = e[0].earnings() + e[1].earnings() + e[2].earnings();// 三个相加就是总和
        System.out.println("总工资为:" + sum);

    }
}
