package javatraining.oletsky.oop.basicpracticum.beforerefactoring;

/**
 * @author O.Oletsky
 * A basic example for introducing classes
 * Without encapsulation etc.
 */
public class Person {
    String fio;
    int age;
    String address;

    public Person(String fio, int age, String address) {
        this.fio = fio;
        this.age = age;
        this.address = address;
    }

    void sayHello() {
        System.out.println(this.fio+" says: Hello");
    }
}
