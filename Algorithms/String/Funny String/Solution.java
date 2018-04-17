import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String funnyString(String s){
      
        StringBuilder str = new StringBuilder(s);
        
        str.reverse();
        
        for(int i=1;i<s.length();i++){
            
           int first = Math.abs(s.charAt(i-1)-s.charAt(i));
           int second = Math.abs(str.charAt(i-1)-str.charAt(i));
            if(first!=second){
                return "Not Funny";
            }
        }
        return "Funny";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
