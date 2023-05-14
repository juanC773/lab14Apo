package com.example.lab1414.model;

public class Amount {

    private int earns;
    private int expensives;


    public Amount(int earns, int expensives) {
        this.earns = earns;
        this.expensives = expensives;

    }


    public int getEarns() {
        return earns;
    }

    public void setEarns(int earns) {
        this.earns = earns;
    }

    public int getExpensives() {
        return expensives;
    }

    public void setExpensives(int expensives) {
        this.expensives = expensives;
    }
}