package com.techreturners.exercise005;

import java.util.Arrays;

public class Exercise005 {

    private static final int ALPHABET_COUNT = 26;

    public boolean isPangram(String input) {
        if (input == null) {
            return false;
        }
        Boolean[] alphabetMarker = new Boolean[ALPHABET_COUNT];
        Arrays.fill(alphabetMarker, false);
        int alphabetIndex = 0;
        input = input.toUpperCase();
        for (int i = 0; i < input.length(); i++) {
            if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
                alphabetIndex = input.charAt(i) - 'A';
                alphabetMarker[alphabetIndex] = true;
            }
        }
        for (boolean index : alphabetMarker) {
            if (!index) {
                return false;
            }
        }
        return true;

    }

}
