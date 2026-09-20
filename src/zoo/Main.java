package zoo;

public class Main {
    public static void main(String[] args) {
        // Dog dog = new Dog();
        // dog.age = 15;
        // dog.weight = 20;
        // dog.eat();
        // dog.sleep();
        // System.out.println("Dog age: " + dog.age + ", weight: " + dog.weight);

        // Cat cat = new Cat();
        // cat.eat();
        // cat.sleep();

        // Monkey monkey = new Monkey();
        // monkey.eat();
        // monkey.sleep();
        
        Dog dog = new Dog();
        dog.age = 15;
        dog.weight = 20;
        dog.eat();
        dog.sleep();
        dog.back();  // Неабстрактный метод используется только если в конструкторе указан наследник
        System.out.println("Dog age: " + dog.age + ", weight: " + dog.weight);

        // Используем полиморфизм. Создаем объект родителя, но ссылаемся на объект наследника
        Animal cat = new Cat();
        cat.eat();
        cat.sleep();

        Animal monkey = new Monkey();
        monkey.eat();
        monkey.sleep();
    }
}
