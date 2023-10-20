package ASS2;

public class Seating extends Furniture{
    private String material;
    private String dimensions;
    private String loadCapacity;

    public Seating( String name, double price, int quantity,int quantitySold, String catagory, String material, String dimensions, String material1, String dimensions1, String loadCapacity) {
        super(name, price, quantity,quantitySold,catagory, material, dimensions);
        this.material = material1;
        this.dimensions = dimensions1;
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getDimensions() {
        return dimensions;
    }

    @Override
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString()+"Seating{" +
                "material='" + material + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", loadCapacity='" + loadCapacity + '\'' +
                '}';
    }
}
