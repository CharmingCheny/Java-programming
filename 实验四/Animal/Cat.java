package Animal;

public class Cat implements Animal {// Animal的子类Cat

    public void cry() { // 重写方法cry
        System.out.println("miao miao miao!");
    }

    public void getAnimalName() {// 重写方法getAnimalName
        System.out.println("这是猫");
    }

}
