public class Cpu {
    private String cpu_manufacture;
    private double cpu_frequency;

    public Cpu() {
    }

    ;

    public Cpu(String cpu_manufacture, double cpu_frequency) {
        this.cpu_manufacture = cpu_manufacture;
        this.cpu_frequency = cpu_frequency;
    }

    public String getCpu_manufacture() {
        return cpu_manufacture;
    }

    public void setCpu_manufacture(String cpu_manufacture) {
        this.cpu_manufacture = cpu_manufacture;
    }

    public double getCpu_frequency() {
        return cpu_frequency;
    }

    public void setCpu_frequency(double cpu_frequency) {
        this.cpu_frequency = cpu_frequency;
    }

    //Выдаём информацию о CPU
    public static String cpuInfo(Cpu cpu) {
        return ("Cpu: " + "Cpu manufacture: " +
                cpu.getCpu_manufacture() + "; " +
                "Cpu frequency: " +
                cpu.getCpu_frequency());
    }
}
