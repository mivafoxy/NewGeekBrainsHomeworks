// 1. Создать классы Собака и Кот с наследованием от класса Животное.
public class Cat extends Animal
{
    public Cat(float maxRunDistance)
    {
        super(maxRunDistance, Integer.MIN_VALUE);
    }

    @Override
    public void swimOn(float requiredDistance)
    {
        System.out.println("Кошки плавать не умеют!\n");
    }
}
