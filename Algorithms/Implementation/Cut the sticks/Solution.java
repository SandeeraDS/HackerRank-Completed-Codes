import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void cutTheSticks(int[] arr) {

        while(true){
             int count=0;
            int min =Integer.MAX_VALUE;

            for(int y:arr){
                if(y<min && y!=0){
                    min=y;
                }
            }
           
            if(min==Integer.MAX_VALUE){
                return;
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=min){
                    count++;
                    arr[i]=arr[i]-min;
                }
            }
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        cutTheSticks(arr);
        in.close();
    }
}
