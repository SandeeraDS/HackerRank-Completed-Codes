import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int jumpingOnClouds(int[] c) {
      
        int count =0;
        for(int i=0;i<c.length;i++){
            //System.out.println(i);
            if(i+2<c.length && c[i+2]==0){
                i+=1;
                count++;
            }
            else{
                count++;
            }
            
        }
        return count-1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c);
        System.out.println(result);
        in.close();
    }
}
