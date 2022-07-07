package bruno.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.List;

public class PersonTest {


    @Test
    void shouldCalculateAgeCorrectly() {
        Person marco = new Person("Marco", LocalDate.of(2000, 1,1 ));
        Assertions.assertEquals(22, marco.getAge());

    }

    @Test
    void shouldReturnIfOfAge() {
        Person bruno = new Person("Bruno", LocalDate.of(2020, 7, 1));
        Assertions.assertFalse(bruno.isOfAge());

        Person cassia = new Person("Cassia", LocalDate.of(1991, 7, 5));
        Assertions.assertTrue(cassia.isOfAge());

        List<Person> people = List.of(new Person("João", LocalDate.now()), new Person("Júlia", LocalDate.now()));

        Assertions.assertAll("people",
                () -> Assertions.assertFalse(people.get(0).isOfAge()),
                () -> Assertions.assertFalse(people.get(1).isOfAge())
        );
    }

}
