import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static boolean check(int i,String s){
        
        if(i==0)
            s=s.substring(1);
        else if(i+1!=s.length())
             s=s.substring(0,i)+s.substring(i+1);
        else
            s=s.substring(0,s.length()-1);
        
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
    
        if(s.equals(str.toString()))
            return -1;
        else{
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=str.charAt(i)){
                       if(check(i,s)){
                           return i;
                       }
                   }
                }
            }
           return -100;
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
