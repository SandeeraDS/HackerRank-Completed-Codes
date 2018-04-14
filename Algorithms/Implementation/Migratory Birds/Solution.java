import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        int[] variety ={0,0,0,0,0};
        
        for(int num : ar){
            switch(num){
                case 1:variety[0]+=1;break;
                    case 2:variety[1]+=1;break;
                        case 3:variety[2]+=1;break;
                            case 4:variety[3]+=1;break;
                                case 5:variety[4]+=1;break;
                    
            }
        }
        int max=0,a=0;
        
        for(int i=0;i<=4;i++){
            
            if(max<variety[i]){
                max=variety[i];
                a=i+1;
            }
        }
        
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
