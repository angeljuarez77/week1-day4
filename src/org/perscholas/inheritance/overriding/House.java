package org.perscholas.inheritance.overriding;

public class House extends Human {
    @Override
    public void walk() {
        System.out.println("I need to use a cane");
    }
}
