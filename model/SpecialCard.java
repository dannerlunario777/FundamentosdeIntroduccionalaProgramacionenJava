package model;
import java.awt.*;
import java.awt.Color;
public class SpecialCard extends Card
{
    public SpecialCard(){
    }

    public String getValue(String card) {
        String res = "";
        switch(card){
            case "+2" :
            res = "+2";
            case "R" :
            res = "R";
            case "C" :
            res = "C";
        }
        return res;
    }

    public Color getColor(){ 
        return null;
    }
}

