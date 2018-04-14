import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
       
        char[] x = s.toCharArray();
        int hour;
        
        if(x[0]=='1' && x[1]=='2' && x[8]=='P' ){
             return s.substring(0,8);
        }
        else if(x[8]=='P'){
             hour =Integer.parseInt(s.substring(0,2))+12;
            
            return Integer.toString(hour)+s.substring(2,8);
        }
        else if(x[0]=='1' && x[1]=='2' ){
            
            return "00"+s.substring(2,8);
        }
        else{
            return s.substring(0,8);
        }
        
      
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
