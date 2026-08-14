package com.corejavaproject.generics;

public class Informatiom<N,A> implements Data<N,A> {
    private N name;
    private A age;

    public Informatiom(N name, A age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public N getName() {
        return this.name;
    }

    @Override
    public A getAge() {
        return this.age;
    }
}
