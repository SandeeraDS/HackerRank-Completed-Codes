import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
       int count = 0;
        for(int i = 0;i<n;i++){
            
            if(ar[i]>0){
                int temp=ar[i];
                for(int j=i+1;j<n;j++){
                    if(temp==ar[j]){
                         //System.out.println(temp);
                        count++;
                        ar[i]=ar[j]=-1;
                        break;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
