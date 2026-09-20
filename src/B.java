public class B {
    private final int bPriv = 100;  // final - константа. Определили значение - зассэтыли
    int bDef = 5;
    public int bPub = 6;
    protected int bProt;

    // method для изменения значения поля в других классах, т.к. поле private
    public int getbPrivate() {  // геттэр
        return bPriv;
    }

    // public void setbPrivate(int bPriv) {  // сеттэр. void - метод ничего не возвращает
    //     // bPriv = bPriv;  // Ошибка: нельзя изменить значение final поля
    // }
    // public void setbPrivate(int bPriv) {
    //     this.bPriv = bPriv;
    // }
    public void setbPrivate(int bPrivParam) {
        bPriv = bPrivParam;
    }

    // Одинаковые имена методов, но разные типы параметров (перегрузка методов)
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b) {
        return a + b;
    }
}
