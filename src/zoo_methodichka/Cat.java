package zoo_methodichka;

public class Cat extends Animal {
    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест рыбу");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит на диване");
    }

    public void meow() {
        System.out.println(getName() + " говорит: мяу!");
    }
}