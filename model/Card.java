package model;

import java.awt.*;
import java.awt.Color;
public class Card implements UnoCard{
    private String value;
    private String color;
    private Card allCards [];

    public Card(String value, String color){
        this.color = color;
        this.value = value;
        allCards = new Card [96];

    }

    public void theCompleteCards(Card card){
        for(int i = 0; i < allCards.length; i++){
            allCards[i] = card;
            break;
        }
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public Color getColor() {
        return null;
    }
}
