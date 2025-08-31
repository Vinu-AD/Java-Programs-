package innerclasses;

class Laptop {
    static String model = "HP";
    String processor = "Ryzen 5";

    static class Battery {
        int mah = 20000; // we can have this, but we can't access it without object
        static int chargeTime = 2;

        static void details() {
            System.out.println("Batter details.......");
            Laptop.Battery lap = new Laptop.Battery();
            System.out.println("mah: " + lap.mah); // cannot access not-static without object

            System.out.println("Charge Time: " + chargeTime);
            System.out.println("Model: " + model);

//            System.out.println("Processor: " + processor); // cannot access non-static field from static
            System.out.println("--------------------");
        }

        void nonStaticMethod() {
            System.out.println("We can have non static methods also" +
                    "but we cannot access it until object creation.");
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {

        System.out.println(Laptop.model);

        Laptop lap = new Laptop();
        System.out.println(lap.processor);

        Laptop.Battery.details(); // inner class static method

        Laptop.Battery battery = new Laptop.Battery();
        System.out.println(battery.mah);
//        Laptop.Battery.mah;
    }
}
