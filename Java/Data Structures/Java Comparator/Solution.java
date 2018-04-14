import java.util.*;

class Checker implements Comparator<Player>{
    
    public int compare(Player p1,Player p2){
        
        if(p1.score==p2.score){
            if(p1.name.equals(p2.name)){
                return 0;
            }
            else if(p1.name.compareToIgnoreCase(p2.name)>0){
                return 1;
            }
            else{
                return -1;
            }
        }
        else if(p1.score> p2.score){
            return -1;
        }
        else {
            return 1;
        }
    }
}
class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}