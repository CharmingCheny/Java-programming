public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU();// 创建CPU对象cpu
        cpu.setSpeed(2200);// 设置cpu的speed值
        HardDisk disk = new HardDisk();// 创建HardDisk对象disk
        disk.setAmount(200);// 设置disk的amount值
        PC pc = new PC();// 创建PC对象pc
        pc.setCPU(cpu);// 调用PC类中的成员方法setCPU
        pc.setHardDisk(disk);// 调用PC类中的成员方法setHardDisk
        pc.show();// 调用PC类中的成员方法show

    }

}
