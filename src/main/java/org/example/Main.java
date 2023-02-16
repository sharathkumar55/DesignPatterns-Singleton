package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //PaySlip paySlip = new PaySlip(10,20,30,20,70);
        PaySlip paySlip = new PayslipBuilder().setBasic(20).setDa(90).build();
        System.out.println(paySlip);
    }
}