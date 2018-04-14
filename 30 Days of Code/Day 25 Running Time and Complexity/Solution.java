import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        s.nextLine();
        while(x-->0){
            BigInteger num = new BigInteger(s.nextLine());
           
            if(num.isProbablePrime(1)){
                 System.out.println("Prime");
            }
            else{
                 System.out.println("Not prime");
            }
        }
    }
}