package ASS2;

public class MobilePhone extends ElectronicProducts{
    private String operatingSytem;
    private String storageCapacity;
    private String cameraResolution;

    public MobilePhone(String name, double price, int quantity,int quantitySold,  String catagory, String powerConsumption, String warranty, String operatingSytem, String storageCapacity, String cameraResolution) {
        super( name, price, quantity, quantitySold,catagory, powerConsumption, warranty);
        this.operatingSytem = operatingSytem;
        this.storageCapacity = storageCapacity;
        this.cameraResolution = cameraResolution;
    }

    public String getOperatingSytem() {
        return operatingSytem;
    }

    public void setOperatingSytem(String operatingSytem) {
        this.operatingSytem = operatingSytem;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(String cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return super.toString()+"MobilePhone{" +
                "operatingSytem='" + operatingSytem + '\'' +
                ", storageCapacity='" + storageCapacity + '\'' +
                ", cameraResolution='" + cameraResolution + '\'' +
                '}';
    }
}
