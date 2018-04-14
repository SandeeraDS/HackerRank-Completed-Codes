import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int findDigits(int num) {
       List<Integer> x = new ArrayList<>();
        int value=num;
        while(value!=0){
            
            if((value%10)!=0)
                x.add(value%10);
            value/=10;
        }
        int count=0;
        for(int div:x){
            if((num%div)==0)
                count++;
                 //System.out.println(div);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }
        in.close();
    }
}
