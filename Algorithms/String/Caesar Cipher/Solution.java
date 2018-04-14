import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String caesarCipher(String s, int k) {
      
      k=k%26;
        
        char[] characters = s.trim().toCharArray();
        
        for(int i=0;i<characters.length;i++){
            
            if(characters[i]>='A' && characters[i]<='Z'){
               
                if(characters[i]+k>'Z'){
                    
                    characters[i]=(char) (('A'-1)+(k-('Z'-characters[i])));
                }
                else{
                    characters[i]+=k;
                }
                
            }
            else if(characters[i]>='a' && characters[i]<='z'){
              
                if(characters[i]+k>'z'){
                    
                    characters[i]=(char) (('a'-1)+(k-('z'-characters[i])));
                }
                else{
                    characters[i]+=k;
                }
            }
          
            
        }
        
        String result = new String(characters);
        
        return result;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String result = caesarCipher(s, k);
        System.out.println(result);
        in.close();
    }
}
