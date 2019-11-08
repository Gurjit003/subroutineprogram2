/*
 * Gurjit Singh
 * Monday November 4th - 2019
 * This program displays the second subroutines' program
 */

package subroutineprogram2;

import java.util.Scanner;

public class Subroutineprogram2  {   

    static final double PI = 3.14159265359;

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);    
        
        double num1, num2, num3;  // Variable declaration
        int option = 0;
        final String DATE = "October 31st - 2019";
        
        do {
            System.out.println("Menu:");
            System.out.println("");
            System.out.println("1. To calculate the sum of two numbers");
            System.out.println("2. To calculate the product of two numbers");
            System.out.println("3. To calculate the perimeter of a triangle");
            System.out.println("4. To calculate the area of a triangle");
            System.out.println("5. To calculate the volume of a square based pyramid");
            System.out.println("6. To calculate the radius of a circle");
            System.out.println("7. To calculate the diameter of a circle");
            System.out.println("8. To calculate the circumference of a circle");
            System.out.println("9. To calculate the average speed");
            System.out.println("10. To calculate the midpoint of a length");
            System.out.println("11. To exit the program");
            System.out.println("");
            
            option = input.nextInt(); // Receives input from the user
            
            if (option==1){
                System.out.println("Enter the first number:");
                num1 = input.nextInt();
                System.out.println("Enter the second number:");
                num2 = input.nextInt();
                System.out.println("The sum is " + addAndOut(num1,num2)); // Outputs the sum
                System.out.println("");
            }
            else if (option==2) {
                System.out.println("Enter the first number:");
                num1 = input.nextInt();
                System.out.println("Enter the second number:");
                num2 = input.nextInt(); 
                System.out.println("The product is " + multAndOut(num1,num2) ); // Outputs the product
                System.out.println("");
            }
            else if (option==3) {
                System.out.println("Enter the length of the first side:");
                num1 = input.nextInt();
                System.out.println("Enter the length of the second side:");
                num2 = input.nextInt(); 
                System.out.println("Enter the length of the third side:");
                num3 = input.nextInt(); 
                System.out.println("The perimeter is " + perimeterAndOut(num1,num2,num3) ); // Outputs the perimeter
                System.out.println("");
            }
            else if (option==4) {
                System.out.println("Enter the length of the base:");
                num1 = input.nextInt();
                System.out.println("Enter the height:");
                num2 = input.nextInt(); 
                System.out.println("The area is " + areaAndOut(num1,num2) ); // Outputs the area
                System.out.println("");
            }
            else if (option==5) {
                System.out.println("Enter the length of the base:");
                num1 = input.nextInt();
                System.out.println("Enter the height:");
                num2 = input.nextInt(); 
                System.out.println("The volume is " + volumeAndOut(num1,num2) ); // Outputs the volume
                System.out.println("");
            }
            else if (option==6) {
                System.out.println("Enter the length of the diameter:");
                num1 = input.nextInt();
                System.out.println("The radius is " + radiusAndOut(num1) ); // Outputs the radius
                System.out.println("");
            }
            else if (option==7) {
                System.out.println("Enter the length of the radius:");
                num1 = input.nextInt();
                System.out.println("The diameter is " + diameterAndOut(num1) ); // Outputs the diameter
                System.out.println("");
            }
            else if (option==8) {
                System.out.println("Enter the length of the diameter:");
                num1 = input.nextInt();
                System.out.println("The circumference is " + circumferenceAndOut(num1) ); // Outputs the circumference
                System.out.println("");
            }
            else if (option==9) {
                System.out.println("Enter the distance traveled in kilometers:");
                num1 = input.nextInt();
                System.out.println("Enter the amount of time spent travelling in hours:");
                num2 = input.nextInt();
                System.out.println("The averagespeed is " + speedAndOut(num1, num2) ); // Outputs the average speed
                System.out.println("");
            }
            else if (option==10) {
                System.out.println("Enter a length:");
                num1 = input.nextInt();
                System.out.println("The midpoint of the length is " + midpointAndOut(num1) ); // Outputs the midpoint of a length
                System.out.println("");
            }
        } while(option!=11);
            System.out.println("You have chosen to exit, goodbye!");
            System.out.println("Date: " + DATE);
            System.out.println("");
    } 
    /**
     * Outputs the sum
     * @param n1
     * @param n2
     * @return 
     */
    public static double addAndOut (double n1, double n2){ 
        double sum = n1 + n2;
        
        return sum;
    }
    /**
     * Outputs the product
     * @param n1
     * @param n2
     * @return 
     */ 
    public static double multAndOut (double n1, double n2){ 
        double product = n1 * n2;
        
        return product;
    }
    /**
     * Outputs the perimeter
     * @param n1
     * @param n2
     * @param n3
     * @return 
     */
    public static double perimeterAndOut (double n1, double n2, double n3){ 
        double perimeter = n1 + n2 + n3;
        
        return perimeter;
    }
    /**
     * Outputs the area
     * @param n1
     * @param n2
     * @return 
     */
    public static double areaAndOut (double n1, double n2){ 
        double area = (n1 * n2) / 2;
        
        return area;
    }
    /**
     * Outputs the volume
     * @param n1
     * @param n2
     * @return 
     */
    public static double volumeAndOut (double n1, double n2){ 
        double volume = ((n1 * n1) * n2) / 3;
        
        return volume;
    }
    /**
     * Outputs the radius
     * @param n1
     * @return 
     */
    public static double radiusAndOut (double n1){ 
        double radius = n1 / 2;
        
        return radius;
    }
    /**
     * Outputs the diameter
     * @param n1
     * @return 
     */
    public static double diameterAndOut (double n1){ 
        double diameter = n1 * 2;
        
        return diameter;
    }
    /**
     * Outputs the circumference
     * @param n1
     * @return 
     */
    public static double circumferenceAndOut (double n1){ 
        double circumference = PI * n1;
        
        return circumference;
    }
    /**
     * Outputs the average speed
     * @param n1
     * @return 
     */
    public static double speedAndOut (double n1, double n2){ 
        double speed = n1 / n2;
        
        return speed;
    }
    /**
     * Outputs the midpoint of a length
     * @param n1
     * @return 
     */
    public static double midpointAndOut (double n1){ 
        double midpoint = n1 / 2;
        
        return midpoint;
    }
}
