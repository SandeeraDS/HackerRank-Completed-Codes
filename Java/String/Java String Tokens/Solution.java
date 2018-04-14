import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
       
        if (s == null || s.equals("") || s.trim().equals("")){
           System.out.println("0"); 
            return;
        }
        
        s=s.trim();
        
      
        String[] x = s.split("[ !,?.\\_'@]+");
        
      
       // if(x.length==0){
           // System.out.println(x.length);
           //  System.out.println(s);
       // }
       // else{
        System.out.println(x.length);
        for(String y:x){
            System.out.println(y);
        }
       // }
        
        scan.close();
    }
}
