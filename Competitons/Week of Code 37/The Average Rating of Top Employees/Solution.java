import java.io.*;
import java.math.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the averageOfTopEmployees function below.
    static void averageOfTopEmployees(int[] rating) {

        double sum=0,count=0;
        
        for(int i=0;i<rating.length;i++){
            
            if(rating[i]>=90){
                sum+=rating[i];
                count++;
            }
        }
       System.out.printf("%.2f",sum/count);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] rating = new int[n];

        for (int ratingItr = 0; ratingItr < n; ratingItr++) {
            int ratingItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            rating[ratingItr] = ratingItem;
        }

        averageOfTopEmployees(rating);

        scanner.close();
    }
}
