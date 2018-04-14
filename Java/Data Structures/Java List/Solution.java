import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
     
        List<Integer> list = new ArrayList<>();
        
        Scanner s = new Scanner(System.in);
        
        int n =s.nextInt();
        
        while(n>0){
            list.add(s.nextInt());
            n--;
        }
        int next=s.nextInt();
        
        while(next>0){
            
            String op=s.next();
            
            if(op.equals("Insert")){
                
                int index=s.nextInt();
                int value = s.nextInt();
                
                list.add(index,value);
            }
            else{
                int rm=s.nextInt();
                list.remove(rm);
            }
            
            next--;
        }
        
        for(int ff:list){
            System.out.print(ff+" ");
        }
    }
}
