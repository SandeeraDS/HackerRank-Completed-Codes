import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String appendAndDelete(String s, String t, int k) {
        
        int sL=s.length(),tL=t.length();
        
        if(sL-tL>k){
            return "No";
        }
        else if(s.equals(t) && k%2==0){
            return "Yes";
        }
        else if(sL>=tL && (sL*2)<=k){
            return "Yes";
        }
        else if((sL+tL-k)<0){
            return "Yes";
        }
        else{
           
            int count=0;
            int n=(sL>=tL) ? tL : sL;
            for(int i=0;i<n;i++){
                
                if(s.charAt(i)==t.charAt(i)){
                   // System.out.println("awo");
                    count++;                    
                }
                else{
                    break;
                }
            }
            
            //check sl<tl situatiom
            if(sL<tL){
                if(sL==count){
                    int tTL =t.substring(count).length();
                    
                    if(tTL%2==0){
                        if(tTL<=k && k%2==0){
                            return "Yes";
                        }
                        else{
                            return "No";
                        }
                    }
                    else{
                         if(tTL<=k && k%2!=0){
                            return "Yes";
                        }
                        else{
                            return "No";
                        }
                    }
                }
                
                else{
                      int tSL=s.substring(count).length();
                      int tTL=t.substring(count).length();
                    
                      if((tSL+tTL)%2==0){
                          if(tTL+tSL<=k && k%2==0){
                            return "Yes";
                        }
                        else{
                            return "No";
                        }
                      }
                    
                    else{
                         if(tTL+tSL<=k && k%2!=0){
                            return "Yes";
                        }
                        else{
                            return "No";
                        }
                    }
                }
            }
            
            else if(sL>tL){
                
                if(tL==count){
                     
                    int tSL=s.substring(count).length();
                    //System.out.println(tSL);
                    if(tSL%2==0){
                        if(tSL<=k && k%2==0){
                            return "Yes";
                        }
                        else{
                            return "No";
                        }
                    }
                    else{
                         if(tSL<=k && k%2!=0){
                            return "Yes";
                        }
                        else{
                            return "No";
                        }
                    }
                }
                
                else{
                    int tSL=s.substring(count).length();
                    int tTL=t.substring(count).length();
                    
                      if((tSL+tTL)%2==0){
                          if(tTL+tSL<=k && k%2==0){
                            return "Yes";
                        }
                        else{
                            return "No";
                        }
                      }
                    
                    else{
                         if(tTL+tSL<=k && k%2!=0){
                            return "Yes";
                        }
                        else{
                            return "No";
                        }
                    }
                }
            }
            
            else{
                return "No";
            }
            
            
            
        }
       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        String result = appendAndDelete(s, t, k);
        System.out.println(result);
        in.close();
    }
}
