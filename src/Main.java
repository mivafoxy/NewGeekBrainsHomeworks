public class Main
{
    public static void main(String[] args)
    {
        // 4. Создать массив из 5 сотрудников.
        Employee[] employees = {
            new Employee(
                "Ivanov Ivan Ivanovich",
                "Programmer",
                "sampleOne@mail.ru",
                "+7-999-999-99-99",
                100000,
                46),
            new Employee(
                "Tulkin Evgeny Borisovich",
                "Administrator",
                "sampleTwo@mail.ru",
                "+7-999-888-77-66",
                80000,
                25),
            new Employee(
                "Lubotkina Alexandra Viktorovna",
                "Secretary",
                "sampleThree@mail.ru",
                "+7-989-111-22-33",
                50000,
                34),
            new Employee(
                "Bulatova Anastasia Krasotkina",
                "Programmer",
                "sampleFour@mail.ru",
                "+7-999-222-33-44",
                150000,
                33),
            new Employee(
                "Ivanov Evgeniy Evgenievich",
                "IT-administrator",
                "sampleFour@mail.ru",
                "+7-444-222-33-00",
                130000,
                44)
        };

        // 5. С помощью цикла
        // вывести информацию
        // только о сотрудниках старше 40 лет.
        int minAge = 40;
        for (Employee employee : employees)
        {
            if (employee.age > minAge)
            {
                employee.printInfo();
                System.out.println();
            }
        }
    }
}
