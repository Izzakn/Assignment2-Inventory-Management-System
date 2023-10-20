package ASS2;

public class Laptops extends ElectronicProducts{
    private String processorType;
    private String ramSize;
    private String ramSizeDimensions;

    public Laptops( String name, double price, int quantity, int quantitySold, String catagory, String powerConsumption, String warranty, String processorType, String ramSize, String ramSizeDimensions) {
        super( name, price, quantity, quantitySold, catagory, powerConsumption, warranty);
        this.processorType = processorType;
        this.ramSize = ramSize;
        this.ramSizeDimensions = ramSizeDimensions;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public String getRamSize() {
        return ramSize;
    }

    public void setRamSize(String ramSize) {
        this.ramSize = ramSize;
    }

    public String getRamSizeDimensions() {
        return ramSizeDimensions;
    }

    public void setRamSizeDimensions(String ramSizeDimensions) {
        this.ramSizeDimensions = ramSizeDimensions;
    }

    @Override
    public String toString() {
        return super.toString()+"Laptops{" +
                "processorType='" + processorType + '\'' +
                ", ramSize='" + ramSize + '\'' +
                ", ramSizeDimensions='" + ramSizeDimensions + '\'' +
                '}';
    }
}
