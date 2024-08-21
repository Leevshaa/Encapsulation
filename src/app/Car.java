package app;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("------------------------------\n" +
                "Автомобіль працює справно");
    }

    private void startElectricity() {
        System.out.println("\nЕлектрика працює справно");
    }

    private void startCommand() {
        System.out.println("Команда запуску двигуна ✓");
    }

    private void startFuelSystem() {
        System.out.println("Паливна система працює справно");
    }
}
