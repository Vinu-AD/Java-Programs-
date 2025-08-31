package multithreadingtasks;

class TicketNotFoundException extends RuntimeException {
    TicketNotFoundException(String msg) {
        super(msg);
    }
}
class InvalidValueException extends RuntimeException {
    InvalidValueException(String msg) {
        super(msg);
    }
}

class Theatre extends Thread {
    static int ticket = 50;
    String name;
    int ticketCount;

    Theatre(String name, int ticketCount) {
        this.name = name;
        this.ticketCount = ticketCount;
    }

    @Override
    public void run() {
        synchronized (Theatre.class) {
            if(ticketCount < 1) throw new InvalidValueException("Provide value greater than 0");
            if (ticket >= ticketCount) {
                ticket -= ticketCount;
                System.out.println(name + " booked " + ticketCount + " tickets");
                System.out.println("Remaining ticket: " + ticket);
                System.out.println();
            } else
                throw new TicketNotFoundException("House full");
        }
    }
}

public class Ticket {  // table 4

    public static void main(String[] args) {
        Theatre person1 = new Theatre("Person1", 16);
        Theatre person2 = new Theatre("Person2",8);
        Theatre person3 = new Theatre("Person3",12);
        Theatre person4 = new Theatre("Person4",3);
        Theatre person5 = new Theatre("Person5",11);

        person1.start();
        person2.start();
        person3.start();
        person4.start();
        person5.start();
    }
}