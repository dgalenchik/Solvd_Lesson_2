public class Client {
    private String first_name;
    private String patronymic_name;
    private String surname;

    public Client() {
    }

    ;

    public Client(String first_name, String surname) {
        this.first_name = first_name;
        this.surname = surname;
    }

    public Client(String first_name, String patronymic_name, String surname) {
        this.first_name = first_name;
        this.patronymic_name = patronymic_name;
        this.surname = surname;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getPatronymic_name() {
        return patronymic_name;
    }

    public void setPatronymic_name(String second_name) {
        this.patronymic_name = patronymic_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
