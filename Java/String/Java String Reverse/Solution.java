import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        for(int i=0;i<A.length();i++){
          
                if(A.charAt(i)!=A.charAt(A.length()-1-i)){
                   // System.out.println(i+" "+j);
                    System.out.println("No");
                    return;
                }
            }
        
        System.out.println("Yes");
        
    }
}
