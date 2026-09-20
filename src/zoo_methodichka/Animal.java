package zoo_methodichka;

/**
 * Абстрактный класс хранит общее состояние и общее поведение животных.
 * Создать new Animal() нельзя: это только шаблон для наследников.
 */
public abstract class Animal implements LivingBeing {
    private static int animalCount;
    private final String name;
    private int age;
    private double weight;

    protected Animal(String name, int age, double weight) {
        this.name = name;
        setAge(age);
        setWeight(weight);
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Вес должен быть больше нуля");
        }
        this.weight = weight;
    }

    /** Каждый наследник ест по-своему. */
    public abstract void eat();

    /** Каждый наследник спит по-своему. */
    public abstract void sleep();

    public void showInfo() {
        System.out.printf("%s: возраст %d, вес %.1f кг%n", name, age, weight);
    }

    @Override
    public void be() {
        System.out.println(name + " существует как живое существо");
    }
}