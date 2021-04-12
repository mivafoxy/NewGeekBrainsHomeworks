// 1. Создать классы Собака и Кот с наследованием от класса Животное.
public class Animal
{
    // 3. У каждого животного есть ограничения на действия
    // (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
    private float maxRunDistance;
    private float maxSwimDistance;

    public Animal(float maxRunDistance, float maxSwimDistance)
    {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    // 2. Все животные могут бежать и плыть.
    // В качестве параметра каждому методу передается длина препятствия.
    // Результатом выполнения действия будет печать в консоль.
    public void runOn(float requiredDistance)
    {
        if (requiredDistance > maxRunDistance)
        {
            System.out.println("Не может пробежать " + requiredDistance);
            System.out.println("Максимум возможностей: " + maxRunDistance);
        }
        else
        {
            System.out.println("Расстояние для бега " + requiredDistance + " преодолено.");
        }

        System.out.println();
    }

    // 2. Все животные могут бежать и плыть.
    // В качестве параметра каждому методу передается длина препятствия.
    // Результатом выполнения действия будет печать в консоль.
    public void swimOn(float requiredDistance)
    {
        if (requiredDistance > maxSwimDistance)
        {
            System.out.println("Не может проплыть " + requiredDistance);
            System.out.println("Максимум возможностей: " + maxRunDistance);
        }
        else
        {
            System.out.println("Расстояние для заплыва " + requiredDistance + " преодолено.");
        }

        System.out.println();
    }
}
