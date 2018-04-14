import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        
        int numberOfArrays = s.nextInt();
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(numberOfArrays);
        
        for(int i=1;i<=numberOfArrays;i++){
            
            int size = s.nextInt();
            
            ArrayList<Integer> adding =  new ArrayList<>(size);
            
             while(size>0){
               
                int aaaa=s.nextInt();
                adding.add(aaaa);
                size--;
            }
            list.add(adding);
        }
        
        int query = s.nextInt();
        
        int[][] qry = new int[query][2];
        
        for(int j=0;j<query;j++){
            
            for(int k=0;k<2;k++){
                qry[j][k]=s.nextInt();
            }
        }
        
         for(int j=0;j<query;j++){
           // System.out.println(qry[j][0]);
           try{
               
              // if(!list.get(qry[j][0]-1).isEmpty()){
                  // System.out.println(list.get(qry[j][0]-1));}
                 // if(list.get(qry[j][0]-1).get(qry[j][1]-1).ise){
                      System.out.println(list.get(qry[j][0]-1).get(qry[j][1]-1));
                  //}
              // }
               
           }catch(Exception e){
                System.out.println("ERROR!");
           }
        }
        
    }       
        
}