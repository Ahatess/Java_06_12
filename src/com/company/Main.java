package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //Parašyti metodą kurio parametras būtų sveikų skaičių masyvas. Metodas turi
        //grąžinti didžiausią masyvo skaičių.
        Main objektas=new Main();

        System.out.println("Nurodykite masyvo dydį");
        Scanner sc = new Scanner(System.in);
        int dydis = sc.nextInt();
        int[] mas = new int[dydis];
        for (int i = 0; i < mas.length; i++) {
            try {
                System.out.println("Iveskite sveikaji " + i + " masyvo skaiciu");
                mas[i] = sc.nextInt();
            } catch (Exception klaida) {
                System.out.println("Ivestas skaicius nera sveikasis");
            }

        }System.out.println("Didziausias skaicius: " + didziausiasSkaicius(mas));

    }
    public static int didziausiasSkaicius(int mas[]){
        int didziausias= mas[0];
        for (int i=0; i<mas.length; i++){
            if(didziausias<mas[i]){
                didziausias= mas[i];
            }
        }return didziausias;


    }
}
