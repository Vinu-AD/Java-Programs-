package basics;

public class Car {

    String name = "Mahindra";
    String model = "3XO";
    double price = 1500000.0;
    byte noOfSeats = 5;
    char fuel = 'P';
    float discount = 10000.0f;

    public static void main(String[] args) {

        Car car = new Car();

        System.out.println("Car Name: " + car.name);
        System.out.println("Car Model: " + car.model);
        System.out.println("Car Price: " + car.price);
        System.out.println("Discount: " + car.discount);
        System.out.println("Number of Seats: " + car.noOfSeats);
        System.out.println("Fuel Type petrol(P)/diesel(D): " + car.fuel);
    }
}
