import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);
        
        try{
            long x = s.nextInt();
            long y = s.nextInt();
            System.out.println(x/y);
        }
         catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}