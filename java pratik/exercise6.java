class ErpManager {

    void updateStock() {
        System.out.println("Stock updated");
    }

    void calculateMaterialNeeds() {
        System.out.println("Material needs calculated");
    }

    void createInvoice() {
        System.out.println("Invoice created");
    }
}

public class exercise6 {

    public static void main(String[] args) {
        ErpManager erp = new ErpManager();

        erp.updateStock();
        erp.calculateMaterialNeeds();
        erp.createInvoice();
    }
}