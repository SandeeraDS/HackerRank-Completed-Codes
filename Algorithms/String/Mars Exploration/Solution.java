import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int marsExploration(String s) {
      
        int count=0;
    String test="SOS";
        
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)!=test.charAt(i%3))
                count++;
        }
        
        return (count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }
}
