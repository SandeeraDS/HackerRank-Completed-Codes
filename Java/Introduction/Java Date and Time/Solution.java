import java.util.Scanner;
import java.time.*; 

public class Solution {
    public static String getDay(String day, String month, String year) {
       
        
              
       try{
           
       LocalDate ld = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month),Integer.parseInt(day));
           System.out.print(ld.getDayOfWeek());
       }
       catch(Exception e){
       
           System.out.println(e);
       }

        
        
      
        
        return "";
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}


