import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int designerPdfViewer(int[] h, String word) {
       
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<word.length();i++){
            
            int indexOfCharacter = word.charAt(i)-'a'; //a=0, z=25 according to array;
            
            if(h[indexOfCharacter]>max){
                max=h[indexOfCharacter];
            }
        }
        return max*word.length();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i = 0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();
    }
}
