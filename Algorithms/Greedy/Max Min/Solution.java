import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void angryChildren(int k, int[] ar) {
       
        ArrayList<Integer> x = new ArrayList<Integer>();//dont use a treeSet. beacouse this inputs has dublicate values;
       
       
        for(int y:ar){
            x.add(y);
        }
        Collections.sort(x);
    int[] arr = new int[ar.length];
      int a=0;
        for(int l:x){
            arr[a++]=l;
        }
      
        
        int sum=Integer.MAX_VALUE;
       
        for(int i=0;i<arr.length-k+1;i++){  
            if(arr[i+k-1]-arr[i]<sum){
                sum=arr[i+k-1]-arr[i];
            }
        }
        
       
        
        System.out.println(sum);
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
       angryChildren(k, arr);
      
    }
}
