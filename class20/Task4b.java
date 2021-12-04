package com.company.class20;

public class Task4b {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    private void method(){
        System.out.println("void method");
    }

    private int method(int num){
        System.out.println("int method");
        return num;
    }
    private double method(String str){
        System.out.println("str method");
        return 5.56;
    }

    public static void main(String[] args) {
        Task4b task4B =new Task4b();
        task4B.method("10");
        // main();

        //Break till 2:10
    }
    public static void main() {
        Task4b task4B =new Task4b();
        task4B.method("10");
    }
}
