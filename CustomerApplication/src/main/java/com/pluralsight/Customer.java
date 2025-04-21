package com.pluralsight;

public class Customer {
    private int id;
    private String name;
    private float outSandingBalance;

    public Customer(int id, String name, float outSandingBalance) {
        this.id = id;
        this.name = name;
        this.outSandingBalance = outSandingBalance;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getOutSandingBalance() {
        return outSandingBalance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", outSandingBalance=" + outSandingBalance +
                '}';
    }
}
