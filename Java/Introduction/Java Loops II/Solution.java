import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int[][] add = new int[t][3];
        for(int i=0;i<t;i++){
            for(int j=0;j<3;j++){
                add[i][j] = in.nextInt();        
            }      
        }
        in.close();
        
        int sum=0;
        
         for(int i=0;i<t;i++){
           
             sum=add[i][0];
            // System.out.print(sum);
             for(int j=1,n=1;j<=add[i][2];j++,n*=2){
                 
                 sum+=(add[i][1]*n);
                 System.out.print(sum+" ");
             }
           System.out.println("");   
        }
       
            
        }
    
}
