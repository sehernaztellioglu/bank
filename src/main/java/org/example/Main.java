package org.example;

import java.sql.SQLOutput;

public class Main{


    static void bank(int x){
        
        int sayacIkiyuz = 0;
        int sayacYuz = 0;
        int sayacElli = 0;
        int sayacYirmi = 0;
        int sayacOn = 0;
        int sayacBes = 0;



        while (true) {


            if (x >= 200) {
                x = x - 200;
                sayacIkiyuz++;

            }

            if(200 > x && x >= 100){
                x = x - 100;
                sayacYuz++;

            }

            if(100 > x && x >= 50){
                x = x - 50;
                sayacElli++;

            }

            if(50 > x && x >= 20){
                x = x - 20;
                sayacYirmi++;

            }

            if(20 > x && x >= 10){
                x = x - 10;
                sayacOn++;

            }

            if(10 > x && x >= 5){
                x = x - 5;
                sayacBes++;
                break;

            }
        }
        System.out.println("200: " + sayacIkiyuz);
        System.out.println("100: " + sayacYuz);
        System.out.println("50: " + sayacElli);
        System.out.println("20: " + sayacYirmi);
        System.out.println("10: " + sayacOn);
        System.out.println("5: " + sayacBes);
    }


    public static void main(){
            bank(1205);



    }
}