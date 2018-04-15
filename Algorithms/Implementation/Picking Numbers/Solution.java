import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int pickingNumbers(int[] a) {
      
        ArrayList<Integer> list = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int x:a){
            list.add(x);
        }
        
        Collections.sort(list);
       
        
        for(int i=0;i<list.size();i++){
            
            int count=1,j=i;;
             
                while((i+1)<list.size() && (list.get(i+1)-list.get(j))<=1){
                   // System.out.print(" "+a[j]);
                    count++;
                    i+=1;
                }
           // System.out.println(" ");
            if(count>max){
                max=count;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }
}
