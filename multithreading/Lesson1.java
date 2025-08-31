package multithreading;

class Theatre {
    int ticket = 0;
    public void earn() {
        ticket++;
    }
}

class City extends Thread {
    Theatre theatre;
    String name;
    public City(Theatre theatre, String name) {
        this.theatre = theatre;
        this.name = name;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 2000; i++)
            theatre.earn();
    }
}

class Town extends Thread {
    Theatre theatre;
    String name;
    public Town(Theatre theatre, String name) {
        this.theatre = theatre;
        this.name = name;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 1000; i++)
            theatre.earn();
    }
}

public class Lesson1 {
    public static void main(String[] args) {
        Theatre theatre = new Theatre();
        City city = new City(theatre, "City");
        Town town = new Town(theatre, "Town");
        System.out.println(theatre.ticket);
        city.start();
        town.start();
        try {
            city.join();
            town.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(theatre.ticket);
    }
}