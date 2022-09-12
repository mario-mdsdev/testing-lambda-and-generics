package br.com.mdsdev.generics;

import java.util.ArrayList;
import java.util.List;

public class MainGeneric {

    public static void main(String[] args) {
        final IntegerCounter integerCounter = new IntegerCounter(1);
        integerCounter.print();
        final DoubleCounter doubleCounter = new DoubleCounter(1.0);
        doubleCounter.print();

        final Counter<Integer> iCounter = new Counter<>(1);
        iCounter.print();
        final Counter<Double> dCounter = new Counter<>(1.0);
        dCounter.print();

        print(2.0);
        print("Mário");

        print(1, 2);
        print("MdS", "Dev");

        System.out.println(printAndReturn(55.0, 45.0));

        final List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(22);

        printList(integers);
    }

    // --> Generics can be used in method scope as well
    private static <T> void print(T t) {
        System.out.println(t);
    }

    private static <T, U> void print(T t, U u) {
        System.out.println(t);
        System.out.println(u);
    }

    private static <T, U> T printAndReturn(T t, U u) {
        System.out.println(t);
        System.out.println(u);
        return t;
    }

    // --> Defining bound
    private static void printList(List<? extends Number> list) {
        System.out.println(list);
    }

}
