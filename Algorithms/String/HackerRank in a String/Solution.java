import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String hackerrankInString(String s) {
      
        String check ="hackerrank";
      
        
        int length=0;
        
        for(int i=0;i<s.length();i++){
            
            if(length<check.length() && check.charAt(length)==s.charAt(i)){
                length++;
            }
            
            if(length==check.length()){
                return "YES";
            }
        }
        return "NO";
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = hackerrankInString(s);
            System.out.println(result);
        }
        in.close();
    }
}
