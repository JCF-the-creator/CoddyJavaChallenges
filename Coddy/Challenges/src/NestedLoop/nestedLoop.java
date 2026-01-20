package NestedLoop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("This program make a pattern using *");
        System.out.println();

        while (true) {
            try{
                System.out.println();
                System.out.println("Enter the length: ");
                int width = scanner.nextInt();
                System.out.println();
                System.out.println("Enter the height: ");
                int height = scanner.nextInt();

                if(height == 0 || width == 0){
                    System.out.println();
                    System.out.println("No pattern with 0 values");
                    System.out.println();
                } else {
                    System.out.println();
                    System.out.println("Pattern: ");
                    System.out.println();
                    for(int y = 0; y<height;y++){
                        for(int x = 0; x<width;x++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                
            }catch(InputMismatchException e){
                    System.out.println();
                    System.out.println("Error: Numbers only");
                    System.out.println();
            }   
                
                String closeProgram = "";
                while (true) {
                    

                    System.out.println();
                    System.out.println("----------------------");
                    System.out.println("Continue? Y/N");
                    closeProgram = scanner2.next();
        
                    if (closeProgram.equalsIgnoreCase("n")) {
                        break;
                    }
                    if (closeProgram.equalsIgnoreCase("y")) {
                        break;
                    }
                    System.out.println();
                    System.out.println("Invalid Input");
                }
                
                
                if (closeProgram.equalsIgnoreCase("n")) {
                    System.out.println("closing program...");
                    break;
                }
        }
        scanner.close();
        scanner2.close();
    }
}
