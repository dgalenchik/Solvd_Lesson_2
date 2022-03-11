public class AudioCard {
    private String manufacture;
    private String audio_chip_manufacture;

    public AudioCard() {
    }

    ;

    public AudioCard(String manufacture, String audio_chip_manufacture) {
        this.manufacture = manufacture;
        this.audio_chip_manufacture = audio_chip_manufacture;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getAudio_chip_manufacture() {
        return audio_chip_manufacture;
    }

    public void setAudio_chip_manufacture(String audio_chip_manufacture) {
        this.audio_chip_manufacture = audio_chip_manufacture;
    }

    //выдаём информацию об Audiocard
    public static String audioCardInfo(AudioCard audioCard) {
        return ("AudioCard: " +
                "Manufacture: " + audioCard.getManufacture() + "; " +
                "Audio chip manufacture: " + audioCard.getAudio_chip_manufacture());
    }
}
