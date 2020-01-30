package com.company;

public interface ITelephone {
    void powerOn();
    void dail (int phoneNumber);
    void anser();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}
