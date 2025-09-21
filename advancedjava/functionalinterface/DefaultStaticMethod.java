package advancedjava.functionalinterface;

interface Company {
    void project();

    default void salaryPayment() {
        System.out.println("Minimum 30k");
    }

    public static void gst() {
        System.out.println("18% from salary");
    }
}

class MyCompany implements Company {
    @Override
    public void project() {
        System.out.println("Java Fullstack Projects - My Company");
    }

    @Override
    public void salaryPayment() {
        Company.super.salaryPayment();
    }
}

class NewCompany {
    public void call() {
        Company company = () -> System.out.println("Backend - New company");
        company.project();
    }
}

public class DefaultStaticMethod {
    public static void main(String[] args) {
        MyCompany cmp = new MyCompany();
        cmp.project();
        cmp.salaryPayment();
        Company.gst();

        NewCompany nc = new NewCompany();
        nc.call();

//        cmp.gst();
//        nc.gst();
        Company.gst();
    }
}
