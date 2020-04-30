package javatraining.oletsky.oop.basicpracticum.beforerefactoring;

public class Demonstration {
    public static void main(String[] args) {
        Person p1 = new Person("Ivanov", 102, "Paris, Monmartr");
        Person p2 = new Person("Petrova", 25, "SAS Radisson");
        p1.sayHello();
        p2.sayHello();
        System.out.println(p1.fio+" is "+p1.age+" years old");

    }
}
