package com.gilel.Homework;

public class Homework_5 {
    public static void main(String[] args) {
        String side1 = "Li";
        String side2 = "Min";
    //    String warrior_type1 = "Warrior";    //just for understanding warrior types
    //    String warrior_type2 = "Archer";     //just for understanding warrior types
    //    String warrior_type3 = "Rider";      //just for understanding warrior types

        double warrior_type1_quantity_side1 = 860;
        double warrior_type2_quantity_side1 = 860;
        double warrior_type3_quantity_side1 = 860;
        double coeff_for_side2 = 1.5;
        double warrior_type1_quantity_side2 = warrior_type1_quantity_side1 * coeff_for_side2;
        double warrior_type2_quantity_side2 = warrior_type2_quantity_side1 * coeff_for_side2;
        double warrior_type3_quantity_side2 = warrior_type3_quantity_side1 * coeff_for_side2;
        double warrior_type1_attack_side1 = 13;
        double warrior_type2_attack_side1 = 24;
        double warrior_type3_attack_side1 = 46;
        double warrior_type1_attack_side2 = 9;
        double warrior_type2_attack_side2 = 35;
        double warrior_type3_attack_side2 = 12;

        double general_attack_side1 = (warrior_type1_quantity_side1 * warrior_type1_attack_side1) + (warrior_type2_quantity_side1 * warrior_type2_attack_side1) + (warrior_type3_quantity_side1 * warrior_type3_attack_side1);
        double general_attack_side2 = (warrior_type1_quantity_side2 * warrior_type1_attack_side2) + (warrior_type2_quantity_side2 * warrior_type2_attack_side2) + (warrior_type3_quantity_side2 * warrior_type3_attack_side2);

        System.out.println("General attack for " + side1 + ": " + general_attack_side1);
        System.out.println("General attack for " + side2 + ": " + general_attack_side2);
    }
}
