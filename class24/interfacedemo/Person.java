package com.company.class24.interfacedemo;

public interface Person {
    void eat();
    void sleep();
}
interface Employee{
    void work();
}
interface SyntaxEmployees extends Employee,Person{
    void teach();
}
class SDETInstructor implements SyntaxEmployees{
int age;
    @Override
    public void eat() {
        System.out.println("Syntax Employees eating");
    }

    @Override
    public void sleep() {
        System.out.println("Syntax Employee sleeping");
    }

    @Override
    public void work() {
        System.out.println("Creating new repls");
    }

    @Override
    public void teach() {
        System.out.println("Syntax employee Teach IT");
    }
}