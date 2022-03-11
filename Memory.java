public class Memory {
    private String manufacture;
    private int capacity;
    private String memory_type;

    public Memory() {
    }

    ;

    public Memory(String manufacture, int capacity, String memory_type) {
        this.manufacture = manufacture;
        this.capacity = capacity;
        this.memory_type = memory_type;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getMemory_type() {
        return memory_type;
    }

    public void setMemory_type(String memory_type) {
        this.memory_type = memory_type;
    }

    //выдаём информацию о Memory
    public static String memoryInfo(Memory memory) {
        return ("Memory: " +
                "Memory manufacture: " + memory.getManufacture() + "; " +
                "Capacity: " + memory.getCapacity() + "; " +
                "Memory Type: " + memory.getMemory_type());
    }
}
