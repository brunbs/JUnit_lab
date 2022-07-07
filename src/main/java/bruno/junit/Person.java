package bruno.junit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Person {

    private String name;
    private LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birthdate;
    }

    public void setBirth(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int getAge() {
        return (int) ChronoUnit.YEARS.between(this.birthdate, LocalDate.now());
    }

    public boolean isOfAge() {
        return (this.getAge() >= 18);
    }
}
