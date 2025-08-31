package exceptionhandling;

public class FinallyCheck {
    public static void recurse() {
        recurse();
    }

    public static void main(String[] args) {
        try {
            System.exit(0); // finally will not be executed
//            recurse();  // finally will not be executed if memory exhausted or JVM crash
                          // otherwise finally block will be executed
//            int[] arr = new int[Integer.MAX_VALUE]; // finally will not be executed if memory exhausted or JVM crash
                          // otherwise finally block will be executed
        }
//        catch (Throwable t) {
//            System.out.println("Caught: " + t);
//        }
        finally {
            System.out.println("Finally block executing");
        }
        System.out.println("End...");
    }
}

