package br.com.mdsdev.lambda;

import lombok.NonNull;

import java.util.List;
import java.util.function.Predicate;

public class MainLambda {

    public static void main(String[] args) {
        final List<Person> people = Person.generateDefaultList();

        printPersonOlderThan(people, 20);
        printPersonWithinAgeRange(people, 19, 20);

        printPeople(people, new CheckPersonEligibleForSelectiveSearch());

        // Here with anonymous class, without implementing the interface externally
        printPeople(people, new CheckPerson() {
            @Override
            public boolean test(Person person) {
                return person.getGender() == Sex.MALE &&
                        person.getAge() >= 18 &&
                        person.getAge() <= 25;
            }
        });

        printPeople(people, p -> p.getGender() == Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);

        printPeopleWithPredicate(people, p -> p.getGender() == Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);
    }

    public static void printPersonOlderThan(@NonNull List<Person> people, int age) {
        for (final Person person : people) {
            if (person.getAge() >= age) person.printMe();
        }
    }

    public static void printPersonWithinAgeRange(@NonNull List<Person> people, int fromAge, int toAge) {
        for (final Person person : people) {
            final int age = person.getAge();
            if (age >= fromAge && age <= toAge) person.printMe();
        }
    }

    public static void printPeople(@NonNull List<Person> people, CheckPerson tester) {
        for (final Person person : people) {
            if (tester.test(person)) person.printMe();
        }
    }

    public static void printPeopleWithPredicate(@NonNull List<Person> people, Predicate<Person> tester) {
        for (final Person person : people) {
            if (tester.test(person)) person.printMe();
        }
    }

}
