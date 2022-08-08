import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        InvoiceItem invoiceItem1 = new InvoiceItem("CocaCola", "10");
        InvoiceItem invoiceItem2 = new InvoiceItem("Papas", "5");

        List<InvoiceItem> invoiceList = new ArrayList<>();
        invoiceList.add(invoiceItem1);
        invoiceList.add(invoiceItem2);

        Invoice invoice = new Invoice("XML-1010", 15.0, true, invoiceList);


        System.out.println(new Gson().toJson(invoice));



    }
}
