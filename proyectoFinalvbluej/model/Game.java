package model;

import java.awt.*;
import java.util.ArrayList;

public class Game implements UnoGame {
    private Player [] players;
    private ArrayList<UnoCard> deck;
    private int direction;
    private ArrayList<UnoCard> cementerio;
    private Player jugadorTurno;
    private int posicionJugTurno;
    private Player champion;
    private boolean cartaCargada;

    public Game(){
        agregarJugadores();
        posicionJugTurno = 0;
        jugadorTurno = players[posicionJugTurno];
        direction = 1;
        deck = new ArrayList();
        agregarAllCards();
        shuffle();
        cementerio = new ArrayList();
        cementerio.add(deck.remove(0));
        Player champion = null;
        cartaCargada = false;
        asignarCartasPlayers();
    }

    private void asignarCartasPlayers(){
        players[0].agregarCard();
        players[1].agregarCard();
        players[2].agregarCard();
        players[3].agregarCard();
    }

    private void agregarJugadores(){
        players = new Player[4];
        players[0]= new Player("JUGADOR 1");
        players[1]= new Player("JUGADOR 2");
        players[2]= new Player("JUGADOR 3");
        players[3]= new Player("JUGADOR 4");
    }

    private void agregarAllCards(){
        agregarCommonCards(Color.BLUE);
        agregarCommonCards(Color.RED);
        agregarCommonCards(Color.GREEN);
        agregarCommonCards(Color.YELLOW);
        agregarSpecialCards();
    }

    @Override

    public Player whoWin() {
        if(champion == null){
            for(int i = 0; i < players.length; i ++){
                if(players[i].getWinner()){
                    champion = players[i];
                }
            }
        }
        return champion;
    }

    @Override
    public ArrayList<UnoCard> getCardsCurrentPlayer(){
        return jugadorTurno.getCards();
    }

    @Override
    public ArrayList<Player> getPlayers() {
        ArrayList<Player> jugadores = new ArrayList();
        for(int i = 0; i<players.length; i ++){
            jugadores.add(players[i]);
        }
        return jugadores;
    }

    @Override
    public UnoCard getCurrentCard() {
        return cementerio.get(cementerio.size()-1);
    }

    @Override
    public Player getCurrentTurn() {
        return jugadorTurno;
    }

    @Override
    public boolean dropCard(UnoCard card){
        boolean res = false;
        UnoCard drop = cementerio.get(cementerio.size()-1);
        if(card.getValue()!="C"){
            if(card.getValue().equals(drop.getValue())||card.getColor().equals(drop.getColor())){
                if(card.getValue()=="+2"){
                    nextTurn(); 
                    loadCard();
                    cartaCargada = false;
                    loadCard();
                }
                if(card.getValue()=="R"){
                    if(direction == 0){
                        direction = 1;
                    }else{
                        direction = 0;
                    }
                }
                res = true;
            }
        }else{
            res = true;
        }
        return res;	
    }

    @Override
    public void loadCard() {
        if(!cartaCargada){
            //jugadorTurno.agregarCard(deck.remove(0));
            jugadorTurno.sacarCarta(deck.remove(0));
            cartaCargada = true;
        }
    }

    @Override
    public boolean nextTurn() {
        boolean res = false;
        if(cartaCargada && champion == null){
            if(direction == 0){
                posicionJugTurno --; 
                if(posicionJugTurno == -1){
                    posicionJugTurno = 3;
                }
            }else if(direction == 1){
                posicionJugTurno ++;
                posicionJugTurno %= 4;
            }
            jugadorTurno = players[posicionJugTurno];
            res = true;
            cartaCargada = false;
        }

        return res;
    }

    @Override
    public int sizeDeck() {
        return deck.size();
    }

    /*
     * 0 -> Izquierda
     * 1 -> Derecha
     */
    @Override
    public int getDirection() {
        return direction;
    }

    @Override
    public void shuffle() {
        int help = cementerio.size()-1;
        if(deck.isEmpty() == true){
            for(int i = 0; i < help; i ++){
                int aux = (int)Math.random()*(help);
                deck.add(cementerio.remove(aux));
            }
        }

    }

    private void agregarCommonCards(Color color){
        int cont = 0;
        int help = 0;
        String value = String.valueOf(help);

        deck.add(new Card("0",color));

        while(cont < 2){
            for(int i = 1; i < 10; i++){
                deck.add(new Card(value,color));
                help++;
            }
            cont++;
        }
    }

    private void agregarSpecialCards(){
        for(int i = 0; i < 4; i++){
            deck.add(new Card("C",Color.BLACK));}
        for(int i = 0; i < 2; i++){
            deck.add(new Card("R",Color.BLUE));
            deck.add(new Card("+2",Color.BLUE));
            deck.add(new Card("R",Color.RED));
            deck.add(new Card("+2",Color.RED));
            deck.add(new Card("R",Color.YELLOW));
            deck.add(new Card("+2",Color.YELLOW));
            deck.add(new Card("R",Color.GREEN));
            deck.add(new Card("+2",Color.GREEN));

        }
    }
}

