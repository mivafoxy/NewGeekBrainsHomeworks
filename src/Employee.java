// 1. Создать класс "Сотрудник" с полями:
// ФИО,
// должность,
// email,
// телефон,
// зарплата,
// возраст.
public class Employee
{
    String fullName;
    String position;
    String email;
    String phoneNumber;
    float salary;
    int age;

    // 2. Конструктор класса должен
    // заполнять эти поля при создании объекта.
    Employee(String fullName,
             String position,
             String email,
             String phoneNumber,
             float salary,
             int age)
    {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // 3. Внутри класса «Сотрудник» написать метод,
    // который выводит информацию об объекте в консоль.
    void printInfo()
    {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("e-mail: " + email);
        System.out.println("Тел.: " + phoneNumber);
        System.out.println("ЗП: " + salary);
        System.out.println("Возраст: " + age);
    }


}
