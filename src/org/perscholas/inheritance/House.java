package org.perscholas.inheritance;

public class House extends Doctor {
    public static void main(String[] args) {
        // walk();
    }

    @Override
    public void walk() {
        System.out.println("I have to use a cane");
    }

}
