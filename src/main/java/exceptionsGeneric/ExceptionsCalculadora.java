package exceptionsGeneric;

public class ExceptionsCalculadora extends   RuntimeException {
    private static final String  DESCRIPTION = "CALCULADORA ERROR";

    public ExceptionsCalculadora(String details) {
        super(DESCRIPTION + ". " + details);

    }
}
