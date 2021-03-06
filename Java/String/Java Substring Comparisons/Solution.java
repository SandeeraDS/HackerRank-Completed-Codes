import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
     ArrayList<String> al=new ArrayList<String>();
        
        for(int i=0;i<=s.length()-k;i++){
            
            al.add(s.substring(i,i+k));
        }
        Collections.sort(al);
        
        int x = al.size();
       // System.out.println(x);
        
        smallest=al.get(0);
        largest=al.get(x-1);
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
