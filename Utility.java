package com.company;

public class Utility {
    // Data or State Information

    private String myName;
    private int myInt;
    private double myDouble;
    private boolean myBoolean;

    // Access Methods


    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyDouble(double myDouble) {
        this.myDouble = myDouble;
    }

    public double getMyDouble() {
        return myDouble;
    }

    public boolean setMyBoolean(boolean myBoolean) {
        this.myBoolean = myBoolean;
        return myBoolean;
    }

    public boolean isMyBoolean() {
        return myBoolean;
    }

    public void  display() {
        System.out.println("My name:" + getMyName());
        System.out.println("My int:" + getMyInt());
        System.out.println("My double:" + getMyDouble());
    }
}
