package stewart;

public class HelloFromAndersen {
    public String welcome;
    public String displayMessage() {
        welcome = "Hello, my name is Andersen.";
        return welcome;
    }
    public static void main(String[] args) {
        HelloFromAndersen hfa = new HelloFromAndersen();
        String message = hfa.displayMessage();
        System.out.println(message);

        //  Display HelloFromDustin
        HelloFromDustin hfd = new HelloFromDustin();
        System.out.println(hfd.displayMessage());
    }
}
