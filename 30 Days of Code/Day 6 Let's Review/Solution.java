import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void devide(String[] words){
        
        for(int i=0;i<words.length;i++){
            
            char[] dWord = words[i].toCharArray();
            
            for(int j=0;j<words[i].length();j+=2){
                System.out.print(dWord[j]);
            }
            
            System.out.print(" ");
            
             for(int j=1;j<words[i].length();j+=2){
                System.out.print(dWord[j]);
            }
             System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
            
            int t = scan.nextByte();
        String[] words = new String[t];
        
        for(int i=0;i<t;i++){
            words[i]=scan.next();
        }
        scan.close();
        
        devide(words);
        
    }
}