package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.charAt(0)+ "." + lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        double addingVat = originalPrice + (originalPrice * vatRate) / 100;
        return Math.round((addingVat * 100)/100);
    }

    public String reverse(String sentence) {
        if (sentence == null){
            return null;
        }
        StringBuilder output = new StringBuilder(sentence).reverse();
        return output.toString();
    }

    public int countLinuxUsers(List<User> users) {
        int countLinux = 0;
        for (User myOs : users){
            if (myOs.getType().equals("Linux")){
                countLinux += 1;
            }
        }
        return countLinux;
    }
}
