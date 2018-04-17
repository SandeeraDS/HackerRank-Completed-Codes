import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void  circularArrayRotation(int[] a, int[] m,int k) {
        LinkedList<Integer> list = new LinkedList<>();
        
        for(int addE:a){
            list.add(addE);
        }
        int temp =0;
   
        while(k-->0){    
            int lastElement = list.removeLast();
            list.addFirst(lastElement);
        }
        for(int result:m){
            System.out.println(list.get(result));
        }
       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] m = new int[q];
        for(int m_i = 0; m_i < q; m_i++){
            m[m_i] = in.nextInt();
        }
        circularArrayRotation(a, m,k);
       

        in.close();
    }
}
