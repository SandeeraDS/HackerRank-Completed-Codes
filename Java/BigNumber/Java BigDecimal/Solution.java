import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
         
	String temp="";
        
         for(int i=0;i<n;i++)
        {
           for(int j=1;j<n-i;j++){
           
               if(new BigDecimal(s[j-1]).compareTo(new BigDecimal(s[j]))<0){
               
                    temp=s[j];
                   s[j]=s[j-1];
                   s[j-1]=temp;
               }
           }
        }
      for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}