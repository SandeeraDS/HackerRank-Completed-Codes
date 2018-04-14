import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] serviceLane(int[][] cases,int[] width,int t) {
      int[] result = new int[t];
      int k=0;
        
        for(int i=0;i<t;i++){
            int min=Integer.MAX_VALUE;
            for(int j=cases[i][0];j<=cases[i][1];j++){
                if(width[j]<min){
                    min=width[j];
                }
            }
            result[k++]=min;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] width = new int[n];
        for(int width_i = 0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        int[][] cases = new int[t][2];
        for(int cases_i = 0; cases_i < t; cases_i++){
            for(int cases_j = 0; cases_j < 2; cases_j++){
                cases[cases_i][cases_j] = in.nextInt();
            }
        }
        int[] result = serviceLane(cases, width,t);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
