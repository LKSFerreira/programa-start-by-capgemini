/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Invoice inv = new Invoice(1, "Mousepad", 10, 20);

        System.out.println("Valor total: " + inv.getInvoiceAmount());

    }
}