package com.company;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    @Override
    public void powerOn() {
        System.out.println("No action taken, Deskphone does not have a powerbutton.");

    }

    @Override
    public void dail(int phoneNumber) {
        System.out.println("Now ringing" + phoneNumber + "on deskphone.");

    }

    @Override
    public void anser() {
        if (isRinging){
            System.out.println("Answering the deskphone");
            isRinging=false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber==myNumber){
            isRinging =true;
            System.out.println("Ring, Ring...");
        }
        else{
            isRinging=false;
        }
        return isRinging;
    }

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
