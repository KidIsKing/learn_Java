package zoo_methodichka;

public class Monkey extends Animal {
    public Monkey(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест банан");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит на дереве");
    }

    public void jump() {
        System.out.println(getName() + " прыгает по веткам");
    }
}