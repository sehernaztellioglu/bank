package org.example;

public class Bank {


     int sayacIkiyuz;
     int sayacYuz;
     int sayacElli;
     int sayacYirmi;
     int sayacOn;
     int sayacBes;


     void bank(int x){


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


    }
}
