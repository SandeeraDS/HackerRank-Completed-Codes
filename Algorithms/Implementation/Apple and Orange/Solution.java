import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
       
        int countA=0,countB=0,distance;
        //apples
        for(int i=0;i<apples.length;i++){
            if(apples[i]>0){            
                distance=apples[i]+a;
                if((distance>=s) && (t>=distance)){
                    countA++;                
                }              
            }
        }
        //ornage
          for(int i=0;i<oranges.length;i++){
            if(oranges[i]<0){
                distance=oranges[i]+b;
                if((distance>=s) && (t>=distance)){
                    countB++;
                }            
            }
        }
        
        System.out.println(countA);
        System.out.println(countB);
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
}
