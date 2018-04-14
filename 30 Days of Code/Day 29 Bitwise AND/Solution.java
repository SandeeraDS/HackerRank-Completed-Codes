import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner s =  new Scanner(System.in);
        
       // int result;
        int testcases = s.nextInt();
        
        while(testcases-->0){
            int n=s.nextInt();
            int k=s.nextInt();
            int bitV=0;
            int max=Integer.MIN_VALUE;
            //TreeSet<Integer> list = new TreeSet<>();
            
            for(int A=1;A<n;A++){
                for(int B=A+1;B<=n;B++){
                    bitV=A & B;
                   // System.out.println(bitV);
                   if(bitV>max && bitV<k)
                        max=bitV;
                }
            }
            System.out.println(max);
        }
    }
}