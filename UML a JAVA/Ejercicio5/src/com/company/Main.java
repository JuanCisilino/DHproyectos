package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> cienPrimerosPositivos = new ArrayList<>();

        for (int i = 1 ; i<= 100 ; i++) {
            cienPrimerosPositivos.add(i);
        }

        System.out.println(cienPrimerosPositivos);
    }
}
