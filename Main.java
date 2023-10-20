package ASS2;

public class Main {

        public static void main(String[] args) {
            InventoryManagement inventorySystem = new InventoryManagement(30);
//int id, String name, double price, int quantity,int quantitySold, String catagory, String powerConsumption, String warranty
            Laptops MacBook = new Laptops("MacBook", 90000.00, 5, 1, "laptop", "900Mh",
                    "10 years","abc","a","b" );
//int id, String name, double price, int quantity,int quantitySold, String catagory, String material, String dimensions
            Product Bed = new Furniture( "Bed", 6999.99, 15, 5, "wood", "wood", "90*90 cm");
//int id, String name, double price, int quantity, int quantitySold, String catagory, String expirationDates, String nutritionalValues
            Product Lays= new Groceries( "lays", 50.00, 25,25, "Low fat", "19-12-23","protein");

            System.out.println("Adding products by Name:");
            inventorySystem.addProduct(MacBook);
            inventorySystem.addProduct(Lays);
            inventorySystem.addProduct(Bed);

            System.out.println("Displaying all products before removing a product");
            inventorySystem.displayList();

            System.out.println("Removing product:");
            inventorySystem.RemoveProduct(Bed);

            System.out.println("Displaying all products after removing a product");
            inventorySystem.displayList();


            System.out.println("Searching product by ID:");
            inventorySystem.searchProductById(1);
            inventorySystem.searchProductById(2);
            inventorySystem.searchProductById(3);

            System.out.println("Searching product by Name:");
            System.out.println(inventorySystem.searchProductByName ("MacBook"));

            System.out.println("Updating product price:");
            inventorySystem.updatePrice(1, 9999.99);

            System.out.println("Updating product quantity:");
            inventorySystem.updateQuantity(3, 50);
        }
}
