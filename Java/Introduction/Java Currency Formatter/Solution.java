import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        String us = NumberFormat.getCurrencyInstance().format(payment);
        
        Locale ind = new Locale("en","IN");
       // Locale ch = new Locale("c","C");
        Locale fr = new Locale("FR","FR");
        
        String india = NumberFormat.getCurrencyInstance(ind).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(fr).format(payment);
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
