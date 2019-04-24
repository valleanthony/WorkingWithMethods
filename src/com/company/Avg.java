package com.company;



public class Avg {
    int numberOne;
    int numberTwo;
    int numberThree;
    int meanNum;

    public Avg() {
    }

    public Avg(int numberOne, int numberTwo, int numberThree, int meanNum) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
        this.meanNum = meanNum;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public int getNumberThree() {
        return numberThree;
    }

    public void setNumberThree(int numberThree) {
        this.numberThree = numberThree;
    }

    public int getMeanNum() {
        return meanNum;
    }

    public void setMeanNum(int meanNum) {
        this.meanNum = meanNum;
    }


    public double avg(){

        double avgOfthis= 0.0;

        avgOfthis = (numberOne + numberTwo + numberThree)/meanNum;

        return avgOfthis;
    }
}
