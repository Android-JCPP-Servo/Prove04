package stewart;

public class HelloFromAnne extends HelloFromAndersen{
    public HelloFromAnne() {
        welcome = "Hello Anderson, my name is Anne.";
    }

    @Override
    public String displayMessage()
    {
        return welcome;
    }
}
