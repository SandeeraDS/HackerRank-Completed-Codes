import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int sum=0,max=0;
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
               // if(i+2<6 && j+2<6){
                    sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                  // System.out.println(sum); 
                //}
                if(max<sum ||( i == 0 && j == 0)){
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }
}
