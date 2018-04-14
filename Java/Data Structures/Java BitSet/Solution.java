import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner s =new Scanner(System.in);
        
        int m = s.nextInt();
        int n = s.nextInt();
        
        BitSet bits1 = new BitSet(m);
        BitSet bits2 = new BitSet(m);
        
        while(n>0){
            String event = s.next();
            int op1 = s.nextInt();
            int op2 = s.nextInt();
            
            if(event.equals("AND")){
                
                if(op1==1){
                    bits1.and(bits2);
                }
                else{
                    bits2.and(bits1);
                }
            }
            else if(event.equals("OR")){
                if(op1==1){
                    bits1.or(bits2); 
                }
                else{
                    bits2.or(bits1);
                }
            }
            else if(event.equals("XOR")){
                if(op1==1){
                    bits1.xor(bits2); 
                }
                else{
                    bits2.xor(bits1);
                }
            }
            else if(event.equals("FLIP")){
                if(op1==1){
                    bits1.flip(op2); 
                }
                else{
                    bits2.flip(op2);
                }
            }
            else{
                if(op1==1){
                    bits1.set(op2); 
                }
                else{
                    bits2.set(op2);
                }    
            }
            
            System.out.println(bits1.cardinality()+" "+bits2.cardinality());
            
        }
    }
}