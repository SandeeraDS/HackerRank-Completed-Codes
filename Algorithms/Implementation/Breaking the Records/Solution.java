import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] breakingRecords(int[] score) {
       
        int[] result = new int[2];
        int high=score[0],low=score[0],hCount=0,lCount=0;
        
        for(int num : score){
            if(num>high){
                high=num;
                hCount++;
            }
            else if(num<low){
                low=num;
                lCount++;
            }
        }
        
        result[0]=hCount;
        result[1]=lCount;
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
