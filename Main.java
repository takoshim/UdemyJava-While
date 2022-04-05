package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
//        int count = 5;
//        while(count != 5) {
//            System.out.println("Count value is " + count);
//            ++count;
//        }
//
//        System.out.println("For loop ********************");
//        for(int i= 3; i!=7; ++i) {
//            System.out.println(i);
//        }
//
//        System.out.println("Do While******************** ");
//        count = 10;
//        do {
//            System.out.println("Loop for " + count);
//            ++count;
//        } while (count<=10);
//
//        System.out.println("While true loop ********************");
//        count = 1;
//        while(true) {
//            if(count == 5)
//                break;
//            System.out.println("Looping. Count is " + count);
//            ++count;
//        }

        int number = 4;
        int finishNumber = 20;
        int counter = 0;

        System.out.println("From " + number + " to " + finishNumber);
        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            ++counter;
            if(counter >= 5)
                break;
        }
        System.out.println("Number of even number (max 5): " + counter);
    }

    /********************************
     * isEvenNumber
     * @param n
     * @return
     *******************************/
    public static boolean isEvenNumber(int n) {
        if(n % 2 == 0)
            return true;
        else
            return false;
    }
}
