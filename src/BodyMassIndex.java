/**
 * @class: BodyMassIndex
 * @author: Jan Kaltenegger
 * @version: 1.0
 * Course: ITEC 2140 - 04
 * Written: February 09, 2023
 *
 * Description: This class calculates and interprets your BMI by the
 * given height and weight.
 *
 * UNFINISHED DUE TO ERROR IN ASSIGNMENT DESCRIPTION
 */

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your weight in pounds: ");
        double weight = in.nextDouble();

        System.out.println("Please enter your height in inches: ");
        double height = in.nextDouble();

        double bodyMassIndex = weight / (height * height);

        //ADD BMI INTERPRETATION ONCE ASSIGNMENT UPDATED
    }
}
