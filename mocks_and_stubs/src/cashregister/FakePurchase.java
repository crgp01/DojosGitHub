package cashregister;

public class FakePurchase extends Purchase{
    private String stringToPrint;


    public FakePurchase(String stringToPrint) {
        super(null);

        this.stringToPrint = stringToPrint;
    }

    @Override
    public String asString() {
        return stringToPrint;
    }
}
