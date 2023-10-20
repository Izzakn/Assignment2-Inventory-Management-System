package ASS2;

public class InventoryManagement {
    private Product[] productlist;
    int size = 0;

    public InventoryManagement(Product[] productlist) {
        this.productlist = productlist;
        int size = 0;

    }

    public InventoryManagement(int capacity) {
        this.productlist = new Product[capacity];
    }

    public void addProduct(Product product) {
        if (size < productlist.length) {
            productlist[size] = product;
            System.out.println("Product added.");
            size++;
        } else {
            System.out.println("Cannot add more products.");
        }
    }
    public void displayList(){
        for(Product product : productlist)
            if(product !=null)
                System.out.println(product);
    }

    public void searchProductById(int id) {
        for (int i = 0; i < size; i++) {

            if (productlist[i] != null && productlist[i].getId() == id) {
                System.out.println(productlist[i]);
            }
        }
    }

    public Product searchProductByName(String productName) {
        for (int i = 0; i < size; i++) {
            if (productlist[i].getName().equals(productName)) {
                return productlist[i];
            }
        }
        return null;
    }
    public void RemoveProduct(Object o)
    {
        Product p = (Product) o;
        for(int i = 0; i < productlist.length; i++)
        {
            if(productlist[i] != null && productlist[i].equals(p))
            {
                for(int j = i; j < productlist.length - 1 ; j++)
                {
                    productlist[j] = productlist[j + 1];
                }
                productlist[productlist.length - 1] = null;
                System.out.println("Product Removed.");
                break;
            }
        }
    }

    public void updatePrice(int productId, double newPrice) {
        for (int i = 0; i < size; i++) {

            if (productlist[i] != null && productlist[i].getId() == productId) {
                productlist[i].setPrice(newPrice);
                System.out.println("price updated");
                break;
            } else {
                System.out.println("Product not found.");
            }
        }
    }
        public void updateQuantity(int productId, int newQuantity){
            for (int i = 0; i < size; i++) {

                if (productlist[i] != null && productlist[i].getId() == productId) {
                    productlist[i].setQuantity(newQuantity);
                    System.out.println("quantity updated");
                    break;
                } else {
                    System.out.println("Product not found.");
                }
            }
        }
}
