package zoo;

public class Monkey extends Animal {  // implements, если интерфейс
    // Обязательно переопределяем все абстрактные методы родителя
    @Override
    public void eat() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Monkey is sleeping");
    }
    
    public void jump() {
        System.out.println("Monkey is jumping");
    }
}
