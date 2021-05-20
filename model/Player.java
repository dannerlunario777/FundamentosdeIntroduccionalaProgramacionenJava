package model;
import java.util.ArrayList;
public class Player{
    private ArrayList<Player>players;
    private String name;
    private boolean win;
    public Player(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return name;
    }
    public String getName(){
        return name;
    }
    @Override
    public boolean equals(Object otherPlayer){
        boolean res = false;
        if(name.equals(otherPlayer)){
            res = true;
        }else{
            res = false;
        }
        return res;
    }
    public boolean win(ArrayList<Card>myDeck){        
        boolean res = myDeck.isEmpty();
        win = false;
        
        if(res == true){
            win = true;
        }else{
            win = false;
        }
        return win;
    }
    public boolean getWinner(){
        return win;
    }
    public String viewMyDeck(){
        ArrayList<Card>myDeck;
        myDeck = new ArrayList();
        String res = "";
        for(int i = 0; i < myDeck.size(); i ++){
            res = res + myDeck.get(i);
        }
        return res;
    }
    public void playerAdd(Player player){
        players.add(player);
    }
    public String viewListPlayers(){
        String res = "";
        for(int i = 0; i < players.size(); i ++){
            res = res + players.get(i);
        }
        return res;
    }
}
