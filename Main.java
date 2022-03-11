public class Main {
    public static void main(String[] args) {
        //создаём Instance классов

        AudioCard aud1 = new AudioCard("Beatbox", "TSMC");
        Cpu cpu1 = new Cpu("AMD", 2.222d);
        GraphicCard graphicCard1 = new GraphicCard("Nvidea", 2048, 1396);
        Memory memory1 = new Memory("Killsfire", 4096, "LLC");
        Client client1 = new Client("Tom", "Vachovsky");
        Client client2 = new Client("John", "Michailovich", "Koltyn");
        Computer computer1 = new Computer("IBM", "JS412", "modern", "laptop", memory1, graphicCard1, aud1, cpu1);
        Letter letter1 = new Letter(Computer.computerInfo(computer1));
        //Отправляем изначальную конфигурацию
        Letter.send(letter1, client1, client2);
        //изменяем конфигурацию Computer
        computer1.setManufacture("Dell");
        computer1.setModel("KRT45967");
        cpu1.setCpu_manufacture("Intel");
        memory1.setCapacity(1024);
        aud1.setManufacture("Alien Heath");
        //Изменяем текст письма
        letter1.setLetter_text(Computer.computerInfo(computer1));
        //Отправляем обратное письмо с необходимыми комплектующими
        Letter.send(letter1, client2, client1);
    }
}
