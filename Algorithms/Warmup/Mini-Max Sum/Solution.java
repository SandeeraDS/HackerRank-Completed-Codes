import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
      int mark=1,j; long max=0,min=0,sum;
        
        for(j=0;j<5;j++){
            sum=0;
            for(int i =1;i<=5;i++){

                if(mark==i){
                    continue;
                }
                else{
                    sum+=arr[i-1];
                }

            }
            
            if((min>sum)||(j==0)){
                min=sum;
            }
            if(max<sum||(j==0)){
                max=sum;
            }
            mark++;
           
        }
        
        System.out.println(min+" "+max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
