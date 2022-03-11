public class Letter {
    private String letter_text;

    public Letter() {
    }

    ;

    public Letter(String message) {
        this.letter_text = message;
    }

    ;

    public String getLetter_text() {
        return letter_text;
    }

    public void setLetter_text(String letter_text) {
        this.letter_text = letter_text;
    }

    //создаём метод send
    public static void send(Letter letter, Client client1, Client client2) {
        System.out.println("Dear, " + client2.getFirst_name() + " " + client2.getSurname() + ". The following configuration has sent from: " + client1.getFirst_name() + " " + client1.getSurname());
        System.out.println(letter.getLetter_text());
    }
}
