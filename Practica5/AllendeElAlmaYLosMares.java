public class AllendeElAlmaYLosMares {
    private Coordenada corSecreta;
    private int intentos;
    
    public AllendeElAlmaYLosMares(){
        corSecreta= new Coordenada();
        intentos=3;
    }
    
    public String jugar(int x, int y){
        String res="";
        int cX= corSecreta.getX();
        int cY= corSecreta.getY();
        int distX= Math.abs(cX-x);
        int distY= Math.abs(cY-y);
        if(intentos>0){
            if(distX==0 && distY==0){
                res="Ganaste papu!";
            }else{
                intentos--;
                if(distX>2){
                    res=res+"X esta lejos";
                }else{
                    res=res+"X esta cerca";
                }

                if(distY>2){
                    res=res+"Y esta lejos";
                }else{
                    res=res+"Y esta cerca";
                }
            }
        }else{
            res="Saludos a la familia del megalodon";
        }
        return res;
    }
    
    public void reiniciar(){
        intentos=3;
        int cX= (int)(Math.random()*11);
        int cY= (int)(Math.random()*11);
        corSecreta.setX(cX);
        corSecreta.setY(cY);
    }
    
}