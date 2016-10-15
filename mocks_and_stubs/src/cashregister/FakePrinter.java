package cashregister;

public class FakePrinter extends Printer{
    public void print(String printThis) {
        this.printThis=printThis;
    }

    public String printMessage() {
        System.out.println(printThis);
        return printThis;
    }
}
