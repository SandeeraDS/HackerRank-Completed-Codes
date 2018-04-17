import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the maximumProgramValue function below.
     */
    static void maximumProgramValue(int n,String[] list) {
        
        
        long x=0;
        
        for(int i=0;i<n;i++){
            
            String[] ops = list[i].split(" ");
            //System.out.println(ops[0]);
            
            if(ops[0].equals("add")){
            
                int add=Integer.parseInt(ops[1]);
                
                if(add>0){
                
                    x+=add;
                }
            }
            else{
                int setInt=Integer.parseInt(ops[1]);
                
                if(setInt>x){
                
                    x=setInt;
                }
                
            }
        }
        
        System.out.print(x);
     
        

    }



    public static void main(String[] args) throws IOException {
       
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
       // System.out.println(n);
        
        String[] list = new String[n];
        s.nextLine();
        for(int i=0;i<n;i++){
            list[i]=s.nextLine();
        }
        
        

        maximumProgramValue(n,list);

       
    }
}
