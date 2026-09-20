package zoo_methodichka;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. Создание объектов ===");
        Dog dog = new Dog("Бобик", 5, 18.5);
        Cat cat = new Cat("Мурка", 3, 4.2);
        Monkey monkey = new Monkey("Чита", 7, 32.0);

        dog.showInfo();
        cat.showInfo();
        monkey.showInfo();

        System.out.println("\n=== 2. String ===");
        stringExamples(dog.getName());

        System.out.println("\n=== 3. switch ===");
        switchExamples("собака");

        System.out.println("\n=== 4. static ===");
        System.out.println("Животных создано: " + Animal.getAnimalCount());
        System.out.println("Описание: " + buildDescription(dog));

        System.out.println("\n=== 5. Методы конкретных классов ===");
        dog.bark();
        cat.meow();
        monkey.jump();

        System.out.println("\n=== 6. Одинаковые методы у наследников ===");
        dog.eat();
        dog.sleep();
        cat.eat();
        cat.sleep();
        monkey.eat();
        monkey.sleep();

        System.out.println("\n=== 7. Полиморфизм ===");
        Animal firstAnimal = new Dog("Рекс", 2, 12.0);
        Animal secondAnimal = new Cat("Барсик", 4, 5.0);
        Animal thirdAnimal = new Monkey("Коко", 6, 28.0);

        Animal[] animals = {firstAnimal, secondAnimal, thirdAnimal};
        for (Animal animal : animals) {
            // Переменная имеет тип Animal, но вызывается версия метода объекта.
            animal.eat();
            animal.sleep();
            animal.be();
        }

        System.out.println("\n=== 8. Интерфейс ===");
        LivingBeing being = dog;
        being.be();

        System.out.println("\n=== 9. Инкапсуляция ===");
        dog.setWeight(19.0);
        System.out.println("Новый вес Бобика: " + dog.getWeight());
        // dog.weight = -10; // Так нельзя: поле private, изменение проходит через setWeight().

        System.out.println("\n=== 10. Приведение типа ===");
        Animal animal = new Dog("Шарик", 1, 8.0);
        if (animal instanceof Dog dogFromAnimal) {
            dogFromAnimal.bark();
        }
    }

    private static void stringExamples(String name) {
        String first = new String("Java");
        String second = "Java";

        System.out.println("Имя: " + name);
        System.out.println("Длина слова Java: " + second.length());
        System.out.println("Первый символ: " + second.charAt(0));
        System.out.println("Верхний регистр: " + second.toUpperCase());
        System.out.println("Есть буква v: " + second.contains("v"));
        System.out.println("equals сравнивает текст: " + first.equals(second));
        System.out.println("== сравнивает ссылки: " + (first == second));

        // String неизменяем: методы возвращают новую строку.
        String changed = second.replace("Java", "Java 21");
        System.out.println("Новая строка: " + changed);
        System.out.println("Старая строка: " + second);
    }

    private static void switchExamples(String animalType) {
        String sound = switch (animalType) {
            case "собака" -> "гав-гав";
            case "кошка" -> "мяу";
            case "обезьяна" -> "у-у-а-а";
            default -> "неизвестный звук";
        };
        System.out.println(animalType + " говорит: " + sound);

        int menuNumber = 2;
        switch (menuNumber) {
            case 1:
                System.out.println("Выбрано: создать животное");
                break;
            case 2:
                System.out.println("Выбрано: показать животных");
                break;
            default:
                System.out.println("Такого пункта нет");
        }
    }

    private static String buildDescription(Animal animal) {
        return animal.getName() + ", " + animal.getAge() + " лет";
    }
}