import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long repeatedString(String s, long n) {
      
        long countA =0;
        
        //get number of a's in the word
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                countA++;
            }
        }
        
        // if not contain a's
        if(countA==0){
            return 0;
        }
        //num of words contain in the n;
        long full=n/s.length();
      
       //number of a's in the all full words
        long numA=full*countA;
        
        //get remain
        int mod =(int) (n%s.length());
       
        if(mod==0){
            return numA;
        }
        
        countA=0;
        
        s=s.substring(0,mod);
        // get number of a's in remaining part
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                countA++;
            }
        }
        
        return countA+numA;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        in.close();
    }
}
