package br.com.mdsdev.lambda;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {
    private String name;
    private int age;
    private String emailAddress;
    private Sex gender;

    public void printMe() {
        System.out.println(this.toString());
    }

    public static List<Person> generateDefaultList() {
        final List<Person> people = new ArrayList<>();

        people.add(Person.builder()
                .name("Shabbir")
                .age(20)
                .gender(Sex.MALE)
                .emailAddress("shabbir@gmail.com")
                .build()
        );

        people.add(Person.builder()
                .name("Nikhil")
                .age(21)
                .gender(Sex.MALE)
                .emailAddress("nikhil@gmail.com")
                .build()
        );

        people.add(Person.builder()
                .name("Shivam")
                .age(19)
                .gender(Sex.MALE)
                .emailAddress("shivam@gmail.com")
                .build()
        );

        return people;
    }

}