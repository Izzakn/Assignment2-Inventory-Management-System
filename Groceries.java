package ASS2;

public class Groceries extends Product{
    String expirationDates;
    String nutritionalValues;

    public Groceries( String name, double price, int quantity, int quantitySold, String catagory, String expirationDates, String nutritionalValues) {
        super( name, price, quantity, quantitySold,  catagory);
        this.expirationDates = expirationDates;
        this.nutritionalValues = nutritionalValues;
    }

    public String getExpirationDates() {
        return expirationDates;
    }

    public void setExpirationDates(String expirationDates) {
        this.expirationDates = expirationDates;
    }

    public String getNutritionalValues() {
        return nutritionalValues;
    }

    public void setNutritionalValues(String nutritionalValues) {
        this.nutritionalValues = nutritionalValues;
    }

    @Override
    public String toString() {
        return super.toString()+"Groceries{" +
                "expirationDates='" + expirationDates + '\'' +
                ", nutritionalValues='" + nutritionalValues + '\'' +
                '}';
    }
}
