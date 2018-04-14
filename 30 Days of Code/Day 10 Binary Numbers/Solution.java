import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0,ones=0;
        
        while(n>0){
            
            int remainder=n%2;
            if(remainder==1){
                ones++;
            }
            else{
                if(max<ones){
                    max=ones;
                }
                ones=0;
            }
           n=n/2; 
        }
        if(max<ones){
            max=ones;
        }
        System.out.println(max);
    }
}
