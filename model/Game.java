package model;

import java.awt.*;
import java.util.ArrayList;

public class Game implements UnoGame {
    private Player player;
    public Game(Player player){
        this.player = player;
    }

    @Override
    public Player whoWin() {
        Player res = null;
        if(player.getWinner()){
            res = player;
        }
        return res;
    }

    @Override
    public ArrayList<UnoCard> getCardsCurrentPlayer(){
        return player.viewMyDeck();
    }

    @Override
    public ArrayList<Player> getPlayers() {
        return player.viewListPlayers();
    }

    @Override
    public UnoCard getCurrentCard() {
        return null;
    }

    @Override
    public Player getCurrentTurn() {
        return null;
    }

    @Override
    public boolean dropCard(Card card, Card dCard){
        boolean res = false;
        String auxc1 = card.getValue();
        String auxc11 = card.getColor();
        String auxc2 = dcard.getValue();
        String auxc22 = dcard.getColor();
        if(auxc1.equals(auxc2)||auxc11.equals(auxc22)||card.getValue().equals("C")){
            res = true;
        }else{
            res = false;
        }
        return res;
    }

    @Override
    public void loadCard() {

    }

    @Override
    public boolean nextTurn() {
        return false;
    }

    @Override
    public int sizeDeck() {
        return 0;
    }

    /*
     * 0 -> Izquierda
     * 1 -> Derecha
     */
    @Override
    public int getDirection() {
        return 0;
    }

    @Override
    public void shuffle() {

    }
}
