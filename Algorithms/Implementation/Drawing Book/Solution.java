import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        int count=0; double checker=Math.ceil(n/2);
       
        if(checker>=p){
            //System.out.println("awa1");
            for(int i=1;i<=n;i+=2){
              
                if(p<=i){
                    return count;
                }
                 count++;
            }
        }
        else{
             //System.out.println("awa2");
            for(int i=n;i>0;i-=2){
               
               if(n%2==0){
                    if(p>=i){
                        return count;
                    }
                    count++;
               }
                else{
                   if(p>=i-1){
                        return count;
                    }                  
                    count++; 
               }
            }
        }
        return -1;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
