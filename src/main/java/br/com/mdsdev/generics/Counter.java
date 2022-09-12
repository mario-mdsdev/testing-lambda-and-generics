package br.com.mdsdev.generics;

import java.io.Serializable;

public class Counter <T extends Number & Serializable> {

    private T t;

    public Counter(T t) {
        this.t = t;
    }

    public void print() {
        System.out.println(t);
    }

}
