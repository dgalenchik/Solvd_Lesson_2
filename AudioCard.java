public class AudioCard {
    private String manufacture;
    private String audioChipManufacture;

    public AudioCard() {
    }


    public AudioCard(String manufacture, String audioChipManufacture) {
        this.manufacture = manufacture;
        this.audioChipManufacture = audioChipManufacture;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getAudioChipManufacture() {
        return audioChipManufacture;
    }

    public void setAudioChipManufacture(String audioChipManufacture) {
        this.audioChipManufacture = audioChipManufacture;
    }

    //выдаём информацию об Audiocard
    public String audioCardInfo() {
        return ("AudioCard: " +
                "Manufacture: " + getManufacture() + "; " +
                "Audio chip manufacture: " + getAudioChipManufacture());
    }
}
