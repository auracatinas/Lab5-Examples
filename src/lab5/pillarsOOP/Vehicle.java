package lab5.pillarsOOP;

/**
 * @author flo
 * @since 06/12/2016.
 */
public abstract class Vehicle {
    private int id;
    public void moves() {
        System.out.println("Vehicle moves");
    }

    public abstract void start();

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.moves();
    }
}

class Car extends Vehicle {
    @Override
    public void moves() {
        start();
        System.out.println("Car moves");
        super.moves();
    }

    @Override
    public void start() {
        System.out.println("vehicle starts");
    }
}
