package util;

import java.util.Scanner;

public class Validation {
 
    private static Scanner sc = new Scanner(System.in);
    
    public static int getAnInteger(String inputMsg, String errorMsg, int min, int max) {
        int n;

        while (true) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                if (n < min || n > max) 
                    throw new Exception();
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }
}
