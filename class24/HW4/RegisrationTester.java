package com.company.class24.HW4;

public class RegisrationTester {
    public static void main(String[] args) {

        Registration reg = new Registration();
        reg.setEmail("yahoo");
        System.out.println(reg.getEmail("yahoo"));
        reg.setUserName("eminozturk02");
        System.out.println(reg.getUserName());
        reg.setPassword("456789@#$%");
        System.out.println(reg.getPassword());

    }
}
