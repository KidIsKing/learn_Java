// Интерфейс. Родительский класс для всех животных в зоопарке
package zoo;

// public interface Animal {  // Всё под капотом (методы публичные и абстрактные)
// void eat();
// void sleep();
// }

// Нельзя создать объект и должен быть абстрактный метод
public abstract class Animal {
    public int age;
    public int weight;

    public abstract void eat();  // Абстрактный метод - метод без тела. Реализовано будет в наследниках
    public abstract void sleep(); // Не может находиться в неабстрактном классе

}