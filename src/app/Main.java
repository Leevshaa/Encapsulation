package app;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.start();

        Employee employee1InCar = new Employee("Юрченко Віталій Віталійович", "Банківський спеціаліст",
                "banking@gmail.com", 9379992, 27);

        System.out.println("\nВодій автомобіля " + employee1InCar.getFullName() + "\nКоротка інформація про водія: \n" +
                "\tПозиція в компанії - " + employee1InCar.getPosition() + "\n\tЕлектронна пошта - " +
                employee1InCar.getEmail() + "\n\tНомер телефону - " + employee1InCar.getPhone() + "\n\tВік - " +
                employee1InCar.getAge());
    }
}
