package com.example.lab10;


public class Function2 extends Function {

    @Override
    public double fnValue(double x) {
        return Math.sin(x);
    }

    public String toString() {
        return "sin(x)";
    }

}