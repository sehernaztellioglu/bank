package org.example;


public class Main{


    static void bank(int x){

        int sayacIkiyuz = 0;
        int sayacYuz = 0;
        int sayacElli = 0;
        int sayacYirmi = 0;
        int sayacOn = 0;
        int sayacBes = 0;



            sayacIkiyuz = x / 200;
            x = x%200;


            sayacYuz = x / 100;
            x = x%100;


            sayacElli = x / 50;
            x = x%50;


            sayacYirmi = x / 20;
            x = x%20;


            sayacOn = x / 10;
            x = x%10;


            sayacBes = x / 5;
            x = x%5;




        System.out.println("200: " + sayacIkiyuz);
        System.out.println("100: " + sayacYuz);
        System.out.println("50: " + sayacElli);
        System.out.println("20: " + sayacYirmi);
        System.out.println("10: " + sayacOn);
        System.out.println("5: " + sayacBes);
    }


    public static void main(String[] args) {
            bank(1285);



    }
}