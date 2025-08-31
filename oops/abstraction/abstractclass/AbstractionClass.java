package oops.abstraction.abstractclass;

/*
Abstraction hides the how and show's the what.
abstract - keyword / modifier / non-access modifier
how to assign the value for abstract class instance variables?
we can assign the value by using subclass constructor
how to assign the value for abstract class static variables?
we can assign the value by using abstract class name

by using abstract class we can achieve 0 - 100 % abstraction
by using interface we can achieve 100 % abstraction (only abstract method)
 */

//class Vehicle {//non-abstract class
abstract class Vehicle {//abstract class
    String vName;
    double vPrice;

    static int regNumber = 123;
    final int id = 321;
    public static void m1(){}
    final static void m2() {}
    final void m3(){}
    // final abstract void m4(); // final abstract is not possible

    public Vehicle() {
    }
    public Vehicle(String vName, double vPrice) {
        this.vName = vName;
        this.vPrice = vPrice;
    }
    public static void engine() {//static method
    }
    public void ride() {//instance method
    }
    public void start(){}
    public abstract void stop();//without block / body / implementation etc...
    //abstract method should be declared(not given implementations) only
}
class Bike extends Vehicle{
    public Bike() {
    }
    public Bike(String vName, double vPrice) {
        super(vName, vPrice);
    }
    @Override
    public void start(){
        System.out.println(this.vName);
        System.out.println(super.vName);
    }
    @Override
    public void stop(){}//give implementation
}

public class AbstractionClass {
    public static void main(String[] args) {
        System.out.println("Print...");//abstraction
        Bike bike = new Bike();
//      Vehicle vehicle = new Vehicle();//we cannot create object for abstract class
        Vehicle b = new Bike("Rx-100",123456);
        System.out.println(b.vName);
        System.out.println(b.vPrice);
        b.start();
    }
}