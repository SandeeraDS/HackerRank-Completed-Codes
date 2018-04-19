import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static boolean check(int i,String s){
                 
        s=s.substring(0,i)+s.substring(i+1);
         
        StringBuilder str =new StringBuilder(s);
        
        str.reverse();
        
        if(s.equals(str.toString()))
            return true;
        else
            return false;
        
    }
    
    
    static int palindromeIndex(String s){
       
        StringBuilder str =new StringBuilder(s);
         
        str.reverse();
    
       
            for(int i=0;i<s.length()/2;i++){
                if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                       if(check(i,s)){
                           return i;
                       }
                        if(check(s.length()-1-i,s)){
                           return s.length()-1-i;
                       }
                   }
                }
            
           return -1;
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }
}
