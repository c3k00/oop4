import java.time.LocalDate;

public class Teacher {

    private int id;
    private String firstName;
    private String secondName;
    private String patronymic;
    private String dateOfBirth;

    public Teacher(int id , String firstName, String secondName, String patronymic, String dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }
    public String getName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public void setName(String name) {
        this.firstName = name;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public LocalDate getDateOfBirth() {
        return LocalDate.parse(dateOfBirth);
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = String.valueOf(dateOfBirth);
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "\nPerson " +
                "firstName: " + firstName + '\'' +
                " secondName: " + secondName + '\'' +
                " patronymic: " + patronymic + '\'' +
                " dateOfBirth: " + dateOfBirth +
                ' ';
    }
}