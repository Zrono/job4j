package ru.job4j.oop;

public class Pacient {
    private String name;
    private String surname;
    private String education;
    private String birthday;
    private Diagnose diagnose;

    public Pacient(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        this.diagnose = diagnose;
    }

    public String getName() {
        return name;

    }

    public String getSurname() {
        return surname;

    }

    public String getEducation() {

        return education;
    }

    public String getBirthday() {
        return birthday;

    }

    public Diagnose getDiagnose() {

        return diagnose;
    }


}
