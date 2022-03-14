public class Main {
    public static void main(String[] args) {
        //создаём Instance классов

        AudioCard audioCard = new AudioCard("Beatbox", "TSMC");
        Cpu cpu = new Cpu("AMD", 2.222d);
        GraphicCard graphicCard = new GraphicCard("Nvidea", 2048, 1396);
        Memory memory = new Memory("Killsfire", 4096, "LLC");
        Client firstClient = new Client("Tom", "Vachovsky");
        Client secondClient = new Client("John", "Michailovich", "Koltyn");
        Computer computer = new Computer("IBM", "JS412", "modern", "laptop", memory, graphicCard, audioCard, cpu);
        Letter letter = new Letter(computer.computerInfo());
        //Отправляем изначальную конфигурацию
        computer.send(letter, firstClient, secondClient);
        //изменяем конфигурацию Computer
        computer.setManufacture("Dell");
        computer.setModel("KRT45967");
        cpu.setCpuManufacture("Intel");
        memory.setCapacity(1024);
        audioCard.setManufacture("Alien Heath");
        //Изменяем текст письма
        letter.setLetterText(computer.computerInfo());
        //Отправляем обратное письмо с необходимыми комплектующими
        computer.send(letter, secondClient, firstClient);
    }
}
