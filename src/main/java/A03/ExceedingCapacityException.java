package A03;

public class ExceedingCapacityException extends RuntimeException {
    public ExceedingCapacityException() {

        super("Capacity Exceeded");
    }

}