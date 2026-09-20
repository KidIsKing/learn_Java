package zoo_methodichka;

public class Dog extends Animal {
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест корм");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит в будке");
    }

    public void bark() {
        System.out.println(getName() + " говорит: гав-гав!");
    }
}