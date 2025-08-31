package oops.polymorphism;

// task 1 30-06-2025

//Create a Ride class with a method fair() and calculateFare(double distance).
//Create subclasses: RapidoBike, OlaAuto, and UberCar that override the calculateFare method
// to compute fare based on distance.

class Ride {
    double distance;
    void distance(double distance) {
        this.distance = distance;
//        this.calculateFare(distance);
    }
    public void calculateFare() {

    }
}
class RapidoBike extends  Ride {
    @Override
    public void calculateFare() {
        System.out.println("User travelling - Rapido Bike");
        System.out.println("Fare for distance: " + this.distance + " is: " + this.distance * 10);
    }

}
class OlaAuto extends  Ride {
    @Override
    public void calculateFare() {
        System.out.println("User travelling - Ola Auto");
        System.out.println("Fare for distance: " + this.distance + " is: " + this.distance * 10);
    }
}
class UberCar extends  Ride {
    @Override
    public void calculateFare() {
        System.out.println("User travelling - Uber Car");
        System.out.println("Fare for distance: " + this.distance + " is: " + this.distance * 10);
    }
}
public class Customer {
    public static void main(String[] args) {
        Ride obj = new RapidoBike();
        obj.distance(20);
        obj.calculateFare();

        Ride obj2 = new OlaAuto();
        obj2.distance(20);
        obj2.calculateFare();

        Ride obj3 = new UberCar();
        obj3.distance(30);
        obj3.calculateFare();
    }
}