package github.lucasas.level3;

public class RaceMain {
    void main() {
        Driver driver1 = new Driver("Lucas", 69);
        Driver driver2 = new Driver("Cal", 20);
        Car car1 = new Car("Porsche", 70, driver1);
        Car car2 = new Car("Fiat", 30, driver2);
        car1.race(car2);
    }
}
