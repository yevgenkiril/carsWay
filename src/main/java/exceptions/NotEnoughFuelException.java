package exceptions;

public class NotEnoughFuelException extends Exception{
    @Override
    public String getMessage() {
        return "Not enough fuel for this road";
    }
}
