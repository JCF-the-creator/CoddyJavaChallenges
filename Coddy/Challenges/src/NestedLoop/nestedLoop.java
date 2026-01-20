package NestedLoop;

import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("This program make a pattern using *");
        System.out.println();

        while (true) {

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
            
                    System.out.println();
                    System.out.println("----------------------");
                    System.out.println("close program? enter \"N\" to close, press another key to repeat program ");
                    String closeProgram = scanner.next();
                    
                    if (closeProgram.equalsIgnoreCase("N")) {
                        break;
                    }
                    System.out.println("----------------------");
        }
        scanner.close();
    }
}
