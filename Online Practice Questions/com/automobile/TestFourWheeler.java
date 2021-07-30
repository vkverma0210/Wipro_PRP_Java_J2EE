package com.automobile;

import com.automobile.FourWheeler.Ford;
import com.automobile.FourWheeler.Logan;

public class TestFourWheeler {
    public static void main(String[] args) {
        Logan logan = new Logan("Mahindra Lagon", "DL2SAW2345", "Ram", 178);
        System.out.println(logan.getModelName());
        System.out.println(logan.getOwnerName());
        System.out.println(logan.getRegistrationNumber());
        System.out.println(logan.getSpeed() + "kmph");
        logan.gps();

        System.out.println();

        Ford ford = new Ford("Ford Endeavour", "DL2SAW9999", "Akash", 278);
        System.out.println(ford.getModelName());
        System.out.println(ford.getOwnerName());
        System.out.println(ford.getRegistrationNumber());
        System.out.println(ford.getSpeed() + "kmph");
        ford.tempControl();

        System.out.println();

    }
}
