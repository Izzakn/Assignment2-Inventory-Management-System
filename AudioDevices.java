package ASS2;

public class AudioDevices extends ElectronicProducts{
    private String frequencyRange;
    private String audioType;

    public AudioDevices( String name, double price, int quantity,int quantitySold,  String catagory, String powerConsumption, String warranty, String frequencyRange, String audioType) {
        super( name, price, quantity, quantitySold, catagory, powerConsumption, warranty);
        this.frequencyRange = frequencyRange;
        this.audioType = audioType;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public String getAudioType() {
        return audioType;
    }

    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }

    @Override
    public String toString() {
        return super.toString()+"AudioDevices{" +
                "frequencyRange='" + frequencyRange + '\'' +
                ", audioType='" + audioType + '\'' +
                '}';
    }
}
