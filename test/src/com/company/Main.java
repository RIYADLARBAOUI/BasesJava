package com.company;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.StringBuilder;


public class Main{
    public static void main(String[] args){

    }



}

/* 5.1
public static void add2Integers(){
        int number1, number2, sum;

        // Put up prompting messages and read inputs as "int"
        Scanner in = new Scanner(System.in);  // Scan the keyboard for input
        System.out.print("Enter first integer: ");  // No newline for prompting message
        number1 = in.nextInt();                     // Read next input as "int"
        System.out.println(number1);
        System.out.print("Enter second integer: ");
        number2 = in.nextInt();
        System.out.println(number2);
        in.close();  // Close Scanner

        // Compute sum
        sum = number1 + number2;

        // Display result
        System.out.println("The sum is: " + sum);   // Print with newline
        }
 */


/* 5.2
public static void SumProductMaxAndMin(){
        int number;
        ArrayList<Integer> tableauEntier = new ArrayList<> ();
        Scanner in = new Scanner(System.in);
        for(int i = 0 ; i < 3 ; ++i){
            System.out.print("Enter"+(char)i+"integer: ");
            number = in.nextInt();
            tableauEntier.add(number);
        }
        int sum=0, product=1,min=tableauEntier.get(0),max=0;
        for(int item : tableauEntier){
            sum+=item;
            product*=item;
        }
        System.out.println("La somme des 3 elements entree est:"+sum);
        System.out.println("Le produits des 3 elements entree est:"+product);
        for(int i = 0 ; i < tableauEntier.size();++i) {
            if (min>tableauEntier.get(i)) {
                min = tableauEntier.get(i);
            }
        }
        System.out.println("Le minimum des 3 elements entree est:"+min);
        for(int item : tableauEntier) {
            if (max<item) {
                max = item;
            }
        }
        System.out.println("Le maximum des 3 elements entree est:"+max);
}
 */


/*5.3
 public static void circleComputation(){
        double radius, diameter, circumference, area;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius:");
        radius = in.nextDouble();
        System.out.println(radius);
        in.close();
        diameter = (double)2.0 * (double)radius;
        area = (double)Math.PI * (double)radius * (double)radius;
        circumference = (double)2.0 * (double)Math.PI * (double)radius;
        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("area is: %.2f%n", area);
        System.out.printf("circumference is: %.2f%n",circumference);
    }
 *//////////////

/*5.3 sphereComputations
public static void sphereCOmputation(){
        double radius, surfaceArea, volume;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius:");
        radius = in.nextDouble();
        System.out.println(radius);
        in.close();

        volume = 4*(double)Math.PI * (double)radius * (double)radius;
        surfaceArea = (double)4/3 * (double)Math.PI * (double)radius * (double)radius * (double)radius;
        System.out.printf("volume is: %.2f%n", volume);
        System.out.printf("surfaceArea is: %.2f%n", surfaceArea);
    }
 */
/*5.3 cylinderComputatiosn

public static void cylinderComputation(){
        double radius, surfaceArea, volume,baseArea,height;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius:");
        radius = in.nextDouble();
        System.out.println(radius);
        System.out.println("Enter the height:");
        height= in.nextDouble();
        System.out.println(height);
        in.close();

        baseArea = (double)Math.PI * (double) radius * (double) radius;
        surfaceArea = (double)2.0 * (double)Math.PI * (double)radius + (double)2.0 * (double)baseArea;
        volume = (double)baseArea * (double) height;
        System.out.printf("volume is: %.2f%n", volume);
        System.out.printf("Surfacearea is: %.2f%n", surfaceArea);
        System.out.printf("baseArea is: %.2f%n", baseArea);
    }
 */

 /*5.4
 public static void swap2Integers(){
        int number1 ,temp = 0 ,  number2;
        Scanner in = new Scanner(System.in);  // Scan the keyboard for input
        System.out.print("Enter first integer: ");  // No newline for prompting message
        number1 = in.nextInt();
        System.out.println(number1);
        System.out.print("Enter second integer: ");  // No newline for prompting message
        number2 = in.nextInt();
        System.out.println(number2);
        in.close();
        temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println(number1);
        System.out.println(number2);

    }
 */
