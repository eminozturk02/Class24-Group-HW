package com.company.class24.interfacedemo3;

public interface Interface {
    default void method1(){
        System.out.println("I am a default method in INterface");
    }
    static void method2(){
        System.out.println("I am a ststic method in Interface");
    }
}
class Test implements Interface{

}
class Main{
    public static void main(String[] args) {
        Interface.method2();
        //Interface.method1(); not allowed for default methods
        Interface I1=new Test();
        I1.method1();
        new Test().method1();

    }
}