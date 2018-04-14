import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int diagonalDifference(int[][] a,int n) {
       
        int primary=0,secondary=0;
        for(int i=0;i<n;i++){
            primary+=a[i][i];
        }
        
        for(int j=0;j<n;j++){
           secondary+=a[j][n-1-j];
           // System.out.println(secondary);
        }
        
        
        return Math.abs(primary-secondary);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a,n);
        System.out.println(result);
        in.close();
    }
}
