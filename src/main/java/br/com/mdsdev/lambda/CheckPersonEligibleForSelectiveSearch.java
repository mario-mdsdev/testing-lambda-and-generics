package br.com.mdsdev.lambda;

public class CheckPersonEligibleForSelectiveSearch implements CheckPerson {

    @Override
    public boolean test(Person person) {
        return person.getGender() == Sex.MALE &&
                person.getAge() >= 18 &&
                person.getAge() <= 25;
    }

}
