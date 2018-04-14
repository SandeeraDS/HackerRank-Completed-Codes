//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Map phoneBook = new HashMap();
        Map checkList = new HashMap();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
           phoneBook.put(name,phone);
        }
        int key=0;
        while(in.hasNext()){
            String s = in.next();
          checkList.put(++key,s);
        }
        in.close();
        
        for(int j=1;j<=key;j++){
            if(phoneBook.containsKey(checkList.get(j))){
                System.out.println(checkList.get(j)+"="+phoneBook.get(checkList.get(j)));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}
