import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      
        Scanner s =  new Scanner(System.in);
        
        int size = s.nextInt();
        
        int[] arr =new int[size];
        
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int n = size;
        while(n>0){
           // int sum=0;
            for(int i=0;i<size;i++){
                int sum=0;
                if(i+n<=size){
                    
                    for(int j=i;j<i+n;j++){
                        sum+=arr[j];
                    }
                    list.add(sum);
                    //System.out.println(sum);
                    
                }
            }
          n--;  
        }
        
      int count=0;
        for(int x:list){
            if(x<0){
                count++;
            }
        }
      System.out.println(count);  
        
        
    }
}