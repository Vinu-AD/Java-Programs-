package oops.abstraction.abstractclass;

abstract class Notification {
    public abstract void send(String msg) ;
}

class SMSNotification extends  Notification {
    @Override
    public void send(String msg) {
        System.out.println("Message : " + msg);
    }
}

class EmailNotification extends  Notification {
    @Override
    public void send(String msg) {
        System.out.println("Message : " + msg);
    }
}

class WhatsAppNotification extends  Notification {
    @Override
    public void send(String msg) {
        System.out.println("Message : " + msg);
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        Notification sms = new SMSNotification();
        sms.send("SMS");

        Notification email = new EmailNotification();
        email.send("Email");

        Notification whatsapp = new WhatsAppNotification();
        whatsapp.send("WhatsApp");

    }
}
