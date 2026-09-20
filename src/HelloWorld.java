import pack.A;

public class HelloWorld {
    public static void main(String[] args) {
        // Объекты и классы, ключевые слова
        // System.out.println("Hello World");
        // System.out.println(123);

        // Типы данных
        // char ch = 'f';
        // String word = "fkjglng daw w!";
        // int x = 5;
        // byte b = 127;
        // short s = 1454;
        // long l = 456641318L;
        // boolean bool = true;
        // double d = 4423.5423423D;  // Можно не писать в конце D
        // float f = 43.567F;

        // Строка
        // String word = "fkjglng daw w!";

        // if-else, switch
        // if (true) {
        //     System.out.println("true");
        // }else {
        //     System.out.println("false");
        // }

        // boolean b = 100 > 200;
        // if (b) {
        //     System.out.println("true");
        // }else {
        //     System.out.println("false");
        // }

        // if (1==0) {
        //     System.out.println("true");
        // }else {
        //     System.out.println("false");
        // }

        // while loop
        // int i = 1;
        // while (i < 10) {
        //     // System.out.printf("while, %s", i);
        //     System.out.println(i + "- while");
        //     i += 1;
        // }

        // do while loop
        // Даже если условие неверное и цикл не запуститься, то в что в do выполнится
        // do {
        //     System.out.println("str from do");
        // } while (false);

        // for loop (fori + tab)
        // for (int i = 0; i < 10; i++) {
        //     System.out.println(i);
        // }

        // arrays (sout + tab)
        // int a = 5;
        // int[] array = new int[3];  // Массив из 3х целых чисел
        // array[0] = 1;
        // array[1] = 2;
        // array[2] = 3;
        // System.out.println(array[2]);

        // for (int i = 0; i < array.length; i++) {
        //     System.out.println(array[i]);
        // }

        // String[] array2 = new String[4];  // Массив из 3х строк
        // array2[0] = "hello";
        // array2[1] = "i";
        // array2[2] = "am";
        // array2[3] = "learning";

        // for (int i = 0; i < array2.length; i++) {
        //     System.out.println(array2[i]);
        // }

        // access modifiers (public, private, protected)
        // public - доступен из любого места
        // private - доступен только внутри класса
        // protected - доступен внутри класса и его наследников
        // default - доступен только внутри пакета

        // OOP
        // A a = new A();  // Конструктор по умолчанию
        // a.aPub = 5;  // Доступ к public полю
        // // a.aDef = 10;  // Ошибка: доступ к default полю
        // // a.aPriv = 15;  // Ошибка: доступ к private полю
        // // a.aProt = 20;  // Ошибка: доступ к protected полю

        // B b = new B();  // Конструктор по умолчанию
        // b.bPub = 5;  // Доступ к public полю
        // b.bDef = 10;  // Доступ к default полю
        // // b.bPriv = 15;  // Ошибка: доступ к private полю
        // b.bProt = 20;  // Доступ к protected полю

        // System.out.println(b.getbPrivate());  // Доступ к private полю через метод

        // b.bPub = 50;  // Замена не константного значения
        // System.out.println(b.bPub);
        // // b.setbPrivate(100);  // Попытка изменить значение final поля

        // B b = new B();
        // int sum = b.add(5, 10);
        // System.out.println("Sum: " + sum);
        // double sumDouble = b.add(5.5, 10.5);
        // System.out.println("Sum (double): " + sumDouble);

        // Наследование
    }
}
