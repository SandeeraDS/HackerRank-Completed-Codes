//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      
      
      int n=in.nextInt();
       Map<String,Integer> tpNumbers = new HashMap<>(n);
      in.nextLine();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         tpNumbers.put(name,phone);
         in.nextLine();
      }
      
      ArrayList<String> list = new ArrayList<>();
      
      while(in.hasNext())
      {
         String s=in.nextLine();
         list.add(s);
      }
      
      for(String x:list){
      
          if(tpNumbers.containsKey(x)){
          
              System.out.println(x+"="+tpNumbers.get(x));
          }
          else{
          
              System.out.println("Not found");
          }
      }
   }
}
