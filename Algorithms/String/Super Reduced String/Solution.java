import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
       
        //String result="";
        for(int i =1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
              
                s=s.substring(0,i-1)+s.substring(i+1);
                i=0;
            }
            else{
               // result+=String.valueOf(s.charAt(i-1));
            }
        }
        
        if(s.isEmpty()){
            return "Empty String";
        }
        else{
            return s;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
