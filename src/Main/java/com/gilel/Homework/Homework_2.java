package com.gilel.Homework;

public class Homework_2 {
    public static void main(String[] args) {
       byte num_1 = 1;
       short num_2 = 2;
       float num_3 = 3.0F;
       int int_num_3 = (int) num_3;
       byte num_4 = 4;

       char point = '.';
       char coor_symb = '\u00B0';
       String coor_name_north = "North: ";
       String coor_name_west = "West: ";

       String obj_name_1 = " Burj Khalifa";
       String obj_name_2 = " Palm Jumeirah";
       String obj_name_3 = " Dubai, JLT, Cluster J, Bonnington Tower";
       String obj_name_4 = " Palm Jebel Ali";

       double coor_north_obj_1 = 25.197139;
       float coor_west_obj_1 = 55.274111F;
       double coor_north_obj_2 = 25.107778;
       float coor_west_obj_2 = 55.1375F;
       double coor_north_obj_3 = 25.0674995;
       float coor_west_obj_3 = 55.1420026F;
       double coor_north_obj_4 = 25.005972;
       float coor_west_obj_4 = 55.988289F;

         System.out.println(num_1 + "" + point + obj_name_1);
         System.out.println(coor_name_north + coor_north_obj_1 + coor_symb);
         System.out.println(coor_name_west + coor_west_obj_1 + coor_symb);

         System.out.print(num_2);
         System.out.print(point);
         System.out.println(obj_name_2);
         System.out.print(coor_name_north);
         System.out.print(coor_north_obj_2);
         System.out.println(coor_symb);
         System.out.print(coor_name_west);
         System.out.print(coor_west_obj_2);
         System.out.println(coor_symb);

         System.out.print(int_num_3);
         System.out.print(point);
         System.out.println(obj_name_3);
         System.out.println(coor_name_north + coor_north_obj_3 + coor_symb);
         System.out.println(coor_name_west + coor_west_obj_3 + coor_symb);

        System.out.println(num_4 + "" + point + obj_name_4);
        System.out.println(coor_name_north + coor_north_obj_4 + coor_symb);
        System.out.println(coor_name_west + coor_west_obj_4 + coor_symb);
    }
}
