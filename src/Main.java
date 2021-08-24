/*
1. Расширить задачу про котов и тарелки с едой.



5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.

 */

public class Main
{
    public static void main(String[] args)
    {
        Person host = new Person();

        Cat[] cats = {
            new Cat(4, "Дуся", host),
            new Cat(5, "Мурзик", host),
            new Cat(10, "Мышкин", host)
        };

        Plate plate = new Plate(0);

        plate.showInfo();

        // for (тип_данных имя_переменной : массив/коллекция)
        for (Cat cat : cats)
        {
            cat.eat(plate);
            plate.showInfo();
        }

        for (Cat cat : cats)
        {
            cat.eat(plate);
            plate.showInfo();
        }
    }
}
