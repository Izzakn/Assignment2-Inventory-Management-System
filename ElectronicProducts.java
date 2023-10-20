package ASS2;

public class ElectronicProducts extends Product{
    private String powerConsumption;
    private String warranty;

    public ElectronicProducts( String name, double price, int quantity,int quantitySold, String catagory, String powerConsumption, String warranty) {
        super( name, price, quantity, quantitySold, catagory);
        this.powerConsumption = powerConsumption;
        this.warranty = warranty;
    }

    public String getPower() {
        return powerConsumption;
    }

    public void setPower(String power) {
        this.powerConsumption = power;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return super.toString()+"ElectronicProducts{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", warranty='" + warranty + '\'' +
                '}';
    }
}