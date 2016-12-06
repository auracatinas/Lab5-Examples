package lab5.pillarsOOP;

/**
 * @author flo
 * @since 06/12/2016.
 */
public abstract class Vehicle implements Movable {
    private int id;
    public void moves() {
        System.out.println("Vehicle moves");
    }

    public abstract void start();

    public Position getPosition() {
        return new Position();
    }

//    @Override
    public String tozString() {
        return "This is a Vehicle with id " + id;
    }

    @Override
    public int hashCode() {
        return 5;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.moves();
        Movable movable = car;
        Vehicle v = car;
        Object o = car;
//        o.moves();
        System.out.println("Objects to String");
        o.toString();
        movable.moves();
        System.out.println("Vehicle toString");
        v.toString();
        v.moves();
        System.out.println(car.toString());
    }
}

interface Movable {
    void moves();
    Position getPosition();
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
