import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        Pattern p = Pattern.compile("(.+)@gmail\\.com");
        List<String> list = new ArrayList<String>();
        int n = s.nextInt();
         s.nextLine();
        while(n-- > 0){
            
            String qry = s.nextLine().trim();
            
            String[] words=qry.split("\\s");
            
           Matcher m = p.matcher(words[1]);
            
           if(m.matches()){
               list.add(words[0]);
               //System.out.println(m.matches());
            }
           
        }
        
        Collections.sort(list);
        for(String x:list){
            System.out.println(x);
        }
    }
}