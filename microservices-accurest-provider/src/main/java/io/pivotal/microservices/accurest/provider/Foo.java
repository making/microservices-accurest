package io.pivotal.microservices.accurest.provider;

public class Foo {

    private int value;

    public Foo(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}