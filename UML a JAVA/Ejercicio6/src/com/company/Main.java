package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HashSet<Integer> cienVeces1 = new HashSet<>();

        for (int i = 1 ; i <= 100 ; i++) {
            cienVeces1.add(1);
        }

        System.out.println(cienVeces1);
    }
}
