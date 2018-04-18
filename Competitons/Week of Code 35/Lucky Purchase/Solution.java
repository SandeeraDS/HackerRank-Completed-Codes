import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       String bandName=""; int price=Integer.MAX_VALUE;
        for(int a0 = 0; a0 < n; a0++){
            String name = in.next();
            int value = in.nextInt();
        
        
          
            if(String.valueOf(value).length()%2!=0){
                continue;
            }
            
            int seven=0,four=0;
           
            for(int j=0;j<String.valueOf(value).length();j++){
               
                if(String.valueOf(value).charAt(j)!='4'&& String.valueOf(value).charAt(j)!='7'){
                      
                    seven=0;
                    four=0;
                    break;
                }
                
                else if(String.valueOf(value).charAt(j)=='4' ){
                    four++;
                }
                
                else{
                   // System.out.print(seven+" ");
                    seven++;
                }       
            }
            
            if(seven!=0 && four!=0){
               // System.out.print(seven+" ");
                if(seven==four){
                  
                     //System.out.println(""); 
                    if(price>value){
                        price =value;
                        bandName =name;
                         //System.out.print(value;" "); 
                    }
                }
                
            }
        }
       
        if(price ==Integer.MAX_VALUE)
           System.out.println("-1");
        else
            System.out.println(bandName);
    }
}
