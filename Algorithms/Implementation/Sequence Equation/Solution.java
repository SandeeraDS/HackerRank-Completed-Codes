import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void permutationEquation(int[] p,int n) {
       
      ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            list.add(p[i]);
        }
        
        for(int i=1;i<=n;i++){
           
            int index=list.indexOf(i);
            int value = index+1;
            int answer = list.indexOf(value)+1;
            System.out.println(answer);
            
        }
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for(int p_i = 0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
         permutationEquation(p,n);
       // for (int i = 0; i < result.length; i++) {
          //  System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        //}
        System.out.println("");


        in.close();
    }
}
