import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void extraLongFactorials(int n) {
       
         BigInteger facto = new BigInteger(String.valueOf(1));
        
        for(int i = n;i>0;i--){
            facto = facto.multiply(new BigInteger(String.valueOf(i)));
            
        }
       System.out.println(facto);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        extraLongFactorials(n);
        in.close();
    }
}
