public class GraphicCard {
    private String manufacture;
    private int video_memory_capacity;
    private int video_chip_serial_number;

    public GraphicCard() {
    }

    ;

    public GraphicCard(String manufacture, int video_memory_capacity, int video_chip_serial_number) {
        this.manufacture = manufacture;
        this.video_memory_capacity = video_memory_capacity;
        this.video_chip_serial_number = video_chip_serial_number;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getVideo_memory_capacity() {
        return video_memory_capacity;
    }

    public void setVideo_memory_capacity(int video_memory_capacity) {
        this.video_memory_capacity = video_memory_capacity;
    }

    public int getVideo_chip_serial_number() {
        return video_chip_serial_number;
    }

    public void setVideo_chip_serial_number(int video_chip_serial_number) {
        this.video_chip_serial_number = video_chip_serial_number;
    }

    //выдаём информацию о Graphic Card
    public static String graphicCardInfo(GraphicCard graphicCard) {
        return ("Graphic card: " +
                "Graphic card manufacture: " + graphicCard.getManufacture() + "; " +
                "Memory capacity: " + graphicCard.getVideo_memory_capacity() + "; " +
                "Serial number: " + graphicCard.getVideo_chip_serial_number());
    }
}
