package model;
import java.util.ArrayList;
public class Deck
{
    private ArrayList <Card> deck;

    public Deck(){
        deck = new ArrayList();

    }
    public void insertCards(Card card){
        deck.add(card);
    }
}
