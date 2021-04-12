public class AnimalFactory
{
    // 4. * Добавить подсчет созданных котов, собак и животных.
    private int animalsCount;
    private int dogsCount;
    private int catsCount;

    public AnimalFactory()
    {
        animalsCount = 0;
        dogsCount = 0;
        catsCount = 0;
    }

    public Cat newCat(int maxRunLimit)
    {
        Cat cat = new Cat(maxRunLimit);

        animalsCount++;
        catsCount++;

        return cat;
    }

    public Dog newDog(int maxRunLimit, int maxSwimLimit)
    {
        Dog dog = new Dog(maxRunLimit, maxSwimLimit);

        animalsCount++;
        dogsCount++;

        return dog;
    }

    public int getAnimalsCount()
    {
        return animalsCount;
    }

    public int getDogsCount()
    {
        return dogsCount;
    }

    public int getCatsCount()
    {
        return catsCount;
    }
}
