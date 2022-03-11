public class Computer {
    private String manufacture;
    private String model;
    private String design;
    private String form;
    private Memory memory;
    private GraphicCard graphicCard;
    private AudioCard audioCard;
    private Cpu cpu;

    public Computer() {
    }

    ;

    public Computer(String manufacture, String model, String design, String form, Memory memory, GraphicCard graphicCard, AudioCard audioCard, Cpu cpu) {
        this.manufacture = manufacture;
        this.model = model;
        this.design = design;
        this.form = form;
        this.memory = memory;
        this.graphicCard = graphicCard;
        this.audioCard = audioCard;
        this.cpu = cpu;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public AudioCard getAudioCard() {
        return audioCard;
    }

    public void setAudioCard(AudioCard audioCard) {
        this.audioCard = audioCard;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    //выдаём информацию о Computer
    public static String computerInfo(Computer computer) {
        return ("Computer: " +
                "Manufacture: " + computer.getManufacture() + "; " +
                "Model: " + computer.getModel() + "; " +
                "Design: " + computer.design + "; " +
                "Form: " + computer.getForm() + " " +
                Memory.memoryInfo(computer.memory) + "; " +
                GraphicCard.graphicCardInfo(computer.graphicCard) + "; " +
                AudioCard.audioCardInfo(computer.audioCard) + "; " +
                Cpu.cpuInfo(computer.cpu));
    }


}

