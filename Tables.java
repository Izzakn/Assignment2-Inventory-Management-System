package ASS2;

public class Tables extends Furniture{
    private String material;
    private String dimensions;

    public Tables( String name, double price, int quantity,int quantitySold, String catagory, String material, String dimensions, String material1, String dimensions1) {
        super(name, price, quantity, quantitySold, catagory, material, dimensions);
        this.material = material1;
        this.dimensions = dimensions1;

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

    @Override
    public String toString() {
        return super.toString()+"Tables{" +
                "material='" + material + '\'' +
                ", dimensions='" + dimensions + '\'' +
                '}';
    }
}
