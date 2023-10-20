package ASS2;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private int quantitySold;
    private String catagory;

    private static int counter =0;

    public Product(String name, double price, int quantity,int quantitySold, String catagory) {
        this.id = ++counter;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.catagory = catagory;
        this.quantitySold= quantitySold;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public void updateQuantity(int newQuantity){
        if (newQuantity >= 0) {
        this.quantity= newQuantity;}
        else {
            System.out.println("Invalid value");
        }
    }

    public void updatePrice(double newPrice){
        if (newPrice >= 0){
            this.price= newPrice;
        }
        else{
            System.out.println("Invalid value");
        }

    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", quantitySold=" + quantitySold +
                ", catagory='" + catagory + '\'' +
                '}';
    }
}
