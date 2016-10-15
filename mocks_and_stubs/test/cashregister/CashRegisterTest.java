package cashregister;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertEquals;

public class CashRegisterTest {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    FakePrinter printer;
    FakePurchase purchase;

    @Before
    public void setUp() throws Exception {

        printer = new FakePrinter();

    }

    @Test
    public void shouldPrintNullPurchase() {
        CashRegister cashRegister = new CashRegister(printer);
        cashRegister.process(null);
        assertEquals(outContent.toString(), "");
    }

    @Test
    public void shouldPrintPurchaseMessage() {
        CashRegister cashRegister = new CashRegister(printer);
        Item[] item = {new Item("hh", 1.5)};
        Purchase purchase = new Purchase(item);
        cashRegister.process(purchase);
        assertEquals(printer.printMessage(), purchase.asString());
    }

    @Test
    public void shouldPrintForPurchaseItem() {
        CashRegister cashRegister = new CashRegister(printer);

        String message ="hello";
        purchase = new FakePurchase(message);


        cashRegister.process(purchase);
        assertEquals(message, printer.printMessage());
    }


}
