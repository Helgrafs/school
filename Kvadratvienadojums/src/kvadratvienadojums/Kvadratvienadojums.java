package kvadratvienadojums;

import java.util.Scanner;

public class Kvadratvienadojums {

    public static void main(String[] args) {
        Scanner keyIn = new Scanner(System.in);
        System.out.println("Quadratic equation calculator");
        System.out.println("Enter variable a");
        double aVar = keyIn.nextDouble();
        System.out.println("Enter variable b");
        double bVar = keyIn.nextDouble();
        System.out.println("Enter variable c");
        double cVar = keyIn.nextInt();
        double firstRoot = (-1*bVar + Math.sqrt(Math.pow(bVar, 2)-4*aVar*cVar))/(2*aVar);
        double secondRoot = (-1*bVar - Math.sqrt(Math.pow(bVar, 2)-4*aVar*cVar))/(2*aVar);
        System.out.println("First root = " + (int)firstRoot +";");
        System.out.println("Second root = " + (int)secondRoot + ";");
        
    }
    
}
