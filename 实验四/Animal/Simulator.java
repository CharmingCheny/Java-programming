package Animal;

public class Simulator {
    Animal animal;// 成员变量

    public void playSound(Animal animal) {
        this.animal = animal;
        animal.cry();// 调用cry方法
        animal.getAnimalName();// 调用getAnimalName方法
    }
}
