package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        int numberThree;
        int meanNumber;

        Avg numAvg = new Avg();


        Scanner keyboard50 = new Scanner(System.in);
        System.out.println("Enter Three numbers: " );
        numberOne = keyboard50.nextInt();
        System.out.println("Another one!");
        numberTwo = keyboard50.nextInt();
        System.out.println("Another one!");
        numberThree = keyboard50.nextInt();
        System.out.println("how many numbers did you enter? ");
        meanNumber = keyboard50.nextInt();

        numAvg.setNumberOne(numberOne);
        numAvg.setNumberTwo(numberTwo);
        numAvg.setNumberThree(numberThree);
        numAvg.setMeanNum(meanNumber);

        double result = numAvg.avg();
        System.out.println(result);
      //System.out.println("Test one is " + quickMaths());
//        System.out.println("Test two is " + divideThis());
//        System.out.println("Test three is " + strarray());
       //System.out.println("Test Four is " + lengthofString());




    } // Main Method end



    public static int quickMaths() {

        Scanner keyboard = new Scanner(System.in);
        int valOne;
        int valtwo;
        int valSum;
        System.out.println("Enter two numbers to add plz. Enter your first ");
        valOne = keyboard.nextInt();
        System.out.println("Enter another number");
        valtwo = keyboard.nextInt();

        valSum = valOne + valtwo;
        System.out.println("The sum is " + valSum);
        return valSum;

    }//Quick Maths End

    public static int divideThis() {
        Scanner keyboard = new Scanner(System.in);
        int divMeOne;
        int divMeTwo;
        int divRes;
        System.out.println("enter two numbers to divide");
        divMeOne = keyboard.nextInt();
        System.out.println("Enter another number");
        divMeTwo = keyboard.nextInt();

        divRes = divMeOne / divMeTwo;
        return divRes;
    }// End divideThis

    public static ArrayList<String> strarray(){
        String adStr;
        ArrayList<String> arrayStr = new ArrayList<String>();
        Scanner keybo = new Scanner(System.in);




        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a letter");
            adStr = keybo.nextLine();
            arrayStr.add(adStr);
        }
        String emptystr ="";
        Collections.sort(arrayStr);

        for (int j =0;j<5;j++){
            arrayStr.get(j);
            emptystr = emptystr +arrayStr.get(j);

        }

        System.out.println(emptystr);

        return arrayStr;

    }// End of the method

public static String lengthofString(){
        Scanner newKey = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String saveWord = newKey.nextLine();
        System.out.println(saveWord.length());
        String returnThis = " ";
        returnThis = returnThis + saveWord.length();

        return returnThis;

   }//End






} //MAIN Class end
