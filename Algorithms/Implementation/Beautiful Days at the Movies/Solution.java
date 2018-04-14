import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int beautifulDays(int i, int j, int d) {
       int count=0;
        
        for(int k=i;k<=j;k++){
            
            StringBuilder s = new StringBuilder(Integer.toString(k));
            int ik=Integer.valueOf(s.reverse().toString());
            if((k-ik)%d==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}
