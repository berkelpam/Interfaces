package com.company;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn=false;

    @Override
    public void powerOn() {
        isOn=true;
        System.out.println("Mobile phone turned on.");

    }

    @Override
    public void dail(int phoneNumber) {
        if (isOn){
        System.out.println("Now ringing" + phoneNumber + "on mobile phone.");}
        else
        {
            System.out.println("Phone is switched off.");
        }

    }

    @Override
    public void anser() {

            if (isRinging) {
                System.out.println("Answering the mobile phone");
                isRinging = false;
            }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber==myNumber && isOn){
            isRinging =true;
            System.out.println("Melody playing");
        }
        else{
            isRinging=false;
            System.out.println("Mobile phone not on or number different.");
        }
        return isRinging;
    }

    public  MobilePhone (int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
