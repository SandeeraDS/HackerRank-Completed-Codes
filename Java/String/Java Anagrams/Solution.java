import java.io.*;
import java.util.*;

public class Solution {   

 static boolean isAnagram(String a, String b) {
        
        a=a.toUpperCase();
        b=b.toUpperCase();
        
        boolean result=true;
        //System.out.println(a);
       // System.out.println(b);
        
        for(int i=65;i<91;i++){
            
            char c = (char)i;
            
            int countA=0,countB=0; 
             
            countA=getCount(a,c);
            countB=getCount(b,c);
            
            if(!(Integer.compare(countA,countB)==0)){
                
               // System.out.println("aaa");
                return false;
                              
            }
            
            
        }
        
        
        return result;
                
    }

    static int getCount(String word,char c){
        
        int count=0;
        
        for(int i=0;i<word.length();i++){
            
            if(word.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}