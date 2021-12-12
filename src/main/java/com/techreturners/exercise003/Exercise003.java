package com.techreturners.exercise003;

public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {
        String[] flavours = iceCreamFlavours();
        for(int i=0; i< flavours.length; i++) {
            if(flavours[i].equals(iceCreamFlavour))
                return i;
        }
        throw new UnsupportedOperationException("Ice cream flavour not found");
    }

    String[] iceCreamFlavours() {
        return new String[]{"Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"};
    }

}
