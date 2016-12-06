package lab5.pillarsOOP;

/**
 * @author flo
 * @since 06/12/2016.
 */
public class Vehicle {
    private int id;
    public void moves() {
        System.out.println("Vehicle moves");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.moves();
    }
}

class Car extends Vehicle {
    @Override
    public void moves() {
        System.out.println("Car moves");
        super.moves();
    }
}
