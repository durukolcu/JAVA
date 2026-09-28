import java.util.Map;

class StockViewer {

    private final InventorySnapshot stock;



    StockViewer(InventorySnapshot stock) {

        this.stock = stock;

    }



    void showWood() {

        System.out.println(

            "Viewer remembers WOOD-A: "

            + stock.available("WOOD-A")

        );

    }

}




public class exercise5b {

    public static void main(String[] args) {

        InventorySnapshot stock =

            new InventorySnapshot(

                Map.of("WOOD-A", 3000L)

            );



        StockViewer viewer =

            new StockViewer(stock);



        viewer.showWood();

        viewer.showWood();

    }

}