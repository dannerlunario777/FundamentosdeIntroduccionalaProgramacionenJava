public class Coordenada {
    private int x,y;
    public Coordenada(){
        x= (int)(Math.random()*11);
        y= (int)(Math.random()*11);
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setX(int nX){
        x= nX;
    }
    
    public void setY(int nY){
        y=nY;
    }
}