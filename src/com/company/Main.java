package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 1;
        boolean found = false;

        while (!found) {
            int value = n*n*n - 1000*n*n;       
            if (value > 100000) {
                found = true;
                System.out.println("n: " + n);
                System.out.println("expr: " + value);
            }
            else
                n++; //n++ just epic way of saying n = n + 1

        }
    }
}
