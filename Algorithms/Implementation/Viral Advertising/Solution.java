import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int viralAdvertising(int n) {
        
        int liked=0;
        int share =5;
       while(n-->0){
           
          liked+=(int)Math.floor(share/2);
          // System.out.println(liked);
          share = (int)Math.floor(share/2)*3;
           //System.out.println(share);
       }
        return liked;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        in.close();
    }
}
