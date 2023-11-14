package Computer;
public class PC {
    CPU cpu; // 定义CPU型变量
    HardDisk HD;// 定义HardDisk型变量

    public void setCPU(CPU c) {
        cpu = c;// 形式参数c赋值给成员变量cpu
    }

    public void setHardDisk(HardDisk h) {
        HD = h;// 形式参数h赋值给成员变量HD
    }

    public void show() { // 打印方法
        System.out.println("CPU的速度为:" + cpu.getSpeed());// 打印CPU的速度
        System.out.println("硬盘的容量为:" + HD.getAmount());// 打印硬盘的容量
    }
}
