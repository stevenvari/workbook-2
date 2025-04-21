package com.pluralsight;

public class statistics {
    public static void main(String[] args) {
        int[] scores = {45, 55, 57, 59, 60, 71, 75, 81, 90, 100};

        int sum = 0;
        int high = scores[0];
        int low = scores[0];

        for (int score : scores) {
            sum += score;
            if (score > high) {
                high = score;
            }
            if (score < low) {
                low = score;
            }
        }


        double average = (double) sum / scores.length;

        System.out.println("the average score is: " + average);
        System.out.println("the high score is: " + high);
        System.out.println("the low score is: " + low);
    }






}
