package innerclasses;

class Car {
    String model = "BMW";
    double price = 5000000;

    void move() {
        System.out.println("Car moving...");
    }

    class Engine {
        Car car = new Car();
        private int mileage = 20;
        String fuel = "Diesel";

        // static fields are allowing
        static int a = 10;
        static String fuelType = "Diesel"; // can have static

        static void method() {
            // static method
            System.out.println("static method");
        }

        void carDetails() {
//            System.out.println("Model: " + car.model);  // if class is static create object and access it
//            System.out.println("Price: " + car.price);
            System.out.println("Model: " + model);
            System.out.println("Price: " + price);
            System.out.println("Mileage: " + mileage);
            System.out.println("Fuel: " + fuel);
        }
        void start() {
            System.out.println("Engine started...");
//            car.move();
            move();
        }

        void stop() {
            System.out.println("Engine stopped...");
        }

    }
}

public class NonStaticInnerClass {
    public static void main(String[] args) {
//        Car car = new Car();
//        Car.Engine engine = car.new Engine();  // one way to create object

        Car.Engine engine = new Car().new Engine();

        System.out.println(engine.fuel);
        engine.carDetails();
        engine.start();
        engine.stop();
        System.out.println(engine.getClass());

//        System.out.println(Car.Engine.fuelType); static field
//        Car.Engine.method();


/*        Car.Engine engine = new Car.Engine(); // if static
        Car car = new Car();
        Car.Engine eng = new Car.Engine();
        System.out.println(eng.fuel);
        System.out.println(engine.mileage); // not have access (private)*/
    }
}
