package zoo_methodichka;

/**
 * Интерфейс описывает способность, а не конкретный вид объекта.
 * Любой класс, который implements LivingBeing, обязан реализовать be().
 */
public interface LivingBeing {
    void be();
}