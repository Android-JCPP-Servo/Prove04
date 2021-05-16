package stewart;

public class HelloFromDustin extends HelloFromAndersen{
    public HelloFromDustin() {
        welcome = "Hello Andersen, my name is Dustin.";
    }

    @Override
    public String displayMessage() {
        return welcome;
    }
}


