public class MethodDemo {

    // Method 1: greet method with no parameters
    public static void greet() {
        System.out.println("Hello from the greet method!");
    }

    // Method 2: printMessage method that takes a String parameter
    public static void printMessage(String message) {
        System.out.println(message); // Prints the message passed to the method
    }

    public static void main(String[] args) {
        // Calling the greet method
        greet();

        // Calling the printMessage method with a specific message
        printMessage("This is my message!");
    }
}
