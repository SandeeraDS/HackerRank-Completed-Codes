    import java.util.*;
    public class Test {
        public static void main(String[] args) {
           
            Scanner in = new Scanner(System.in);
            
            TreeSet Tset = new TreeSet();//beacuse contain only unique values;
            
            int max= Integer.MIN_VALUE;
            
            Deque<Integer> deque = new ArrayDeque<>();
            
            int n = in.nextInt();
            int m = in.nextInt();
            
            
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
               
                deque.add(num);
                Tset.add(num);
                
                if(deque.size()==m){
                    
                        if(Tset.size()>max){

                            max=Tset.size();

                            if(max==m){
                                System.out.println(max);
                                return;
                            }
                         }

                        int first=deque.remove();

                            if(!deque.contains(first)){
                                Tset.remove(first);
                        }
                      
                    }
                } 
           System.out.println(max);    
        }
    }
