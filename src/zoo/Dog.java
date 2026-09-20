package zoo;

// public class Dog implements Animal, Entity {  // Если Animal тоже интерфейс, то можно указывать несколько классов интерфейсов, но с абстрактными классами так нельзя
// public class Dog extends Pet1 implements Animal, Entity {
public class Dog implements Animal, Entity {  // Определяем родителя
    @Override  // Переопределение родительского метода
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    public void be() {
        System.out.println("Dog is being");
    }
}
