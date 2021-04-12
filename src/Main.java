public class Main
{
    public static void main(String[] args)
    {
        AnimalFactory factory = new AnimalFactory();

        Cat cat = factory.newCat(200);
        Dog dog = factory.newDog(500, 10);

        cat.runOn(150);
        cat.swimOn(5);

        dog.runOn(550);
        dog.swimOn(9);

        System.out.println("Животных создано всего: " + factory.getAnimalsCount());
        System.out.println("Собак создано всего: " + factory.getDogsCount());
        System.out.println("Кошек создано всего: " + factory.getCatsCount());
    }
}
