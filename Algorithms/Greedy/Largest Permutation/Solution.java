import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] largestPermutation(int k, int[] arr) {
        
        int swap =0,temp,pos=0;
        
        for(int i=0;i<arr.length-1;i++){
            
            if(swap<k){
                swap++;
                int max=Integer.MIN_VALUE;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]>max){
                        max=arr[j];
                        pos=j;
                    }
                }
                if(arr[i]<max){
                    temp=arr[i];
                    arr[i]=arr[pos];
                    arr[pos]=temp;
                }
            }
            
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = largestPermutation(k, arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
