package github.lucasas.level3;

public class Car {
    private final String brand;
    private final int baseSpeed;
    private final Driver driver;

    public Car(String brand, int baseSpeed, Driver driver) {
        this.brand = brand;
        this.baseSpeed = baseSpeed;
        this.driver = driver;
    }

    public void race(Car other) {
        Car winnerCar = this.getEffectiveSpeed() >= other.getEffectiveSpeed() ? this : other;
        System.out.println("Vinderen er " + winnerCar.brand + " med køreren " + winnerCar.driver.getName());
    }

    private int getEffectiveSpeed() {
        return baseSpeed * driver.getSkill();
    }
}
