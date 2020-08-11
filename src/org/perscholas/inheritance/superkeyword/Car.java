package org.perscholas.inheritance.superkeyword;

/* sub class Car extending vehicle */
class Car extends Vehicle {
    int maxSpeed = 180;

    void display() {
        /* print maxSpeed of base class (vehicle) */
        System.out.println("Maximum Speed: " + maxSpeed);
    }
}
