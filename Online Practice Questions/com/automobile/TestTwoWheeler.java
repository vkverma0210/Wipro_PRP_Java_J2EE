package com.automobile;

import com.automobile.TwoWheeler.Hero;
import com.automobile.TwoWheeler.Honda;

public class TestTwoWheeler {
    public static void main(String[] args) {
        Hero hero = new Hero("Hero Splendor", "DL2SAW2345", "Ram", 78);
        System.out.println(hero.getModelName());
        System.out.println(hero.getOwnerName());
        System.out.println(hero.getRegistrationNumber());
        System.out.println(hero.getSpeed() + "kmph");
        hero.radio();

        System.out.println();

        Honda honda = new Honda("Honda CBZ", "DL2SAW2349", "Vinay", 278);
        System.out.println(honda.getModelName());
        System.out.println(honda.getOwnerName());
        System.out.println(honda.getRegistrationNumber());
        System.out.println(honda.getSpeed() + "kmph");
        honda.cdPlayer();

        System.out.println();

    }
}
