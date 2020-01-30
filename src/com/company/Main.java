package com.company;

public class Main {

    public static void main(String[] args) {

        ITelephone paulsPhone;
        paulsPhone=new DeskPhone(123456);
        paulsPhone.powerOn();
        paulsPhone.callPhone(123456);
        paulsPhone.anser();


    }
}
