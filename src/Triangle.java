/**
 * @class: Triangle
 * @author: Jan Kaltenegger
 * @version: 1.0
 * Course: ITEC 2140 - 04
 * Written: February 09, 2023
 *
 * Description: This class calculates the circumference of a triangle only if the sum of any 2 of the triangle's edges
 * is greater than the remaining one.
 */

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);


        System.out.println("Enter the length of the first edge of the triangle: ");
        int edge1 = in.nextInt();

        System.out.println("Enter the length of the second edge of the triangle: ");
        int edge2 = in.nextInt();

        System.out.println("Enter the length of the last edge of the triangle: ");
        int edge3 = in.nextInt();


        if ((edge1 + edge2 > edge3) && (edge3 + edge1 > edge2) && (edge2 + edge3 > edge1)){ //Evaluates whether all edges are more or less equal.
            System.out.println(edge1 + edge2 + edge3);
        }
        else {
            System.out.println("Invalid input");
        }


    }
}
