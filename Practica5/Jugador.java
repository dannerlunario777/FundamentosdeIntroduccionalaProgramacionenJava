public class Jugador {
    private String nombre;
    private int fichas;
    
    public Jugador(String nombre, int fichas){
        this.nombre = nombre;
        this.fichas = fichas;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getFichas(){
        return fichas;
    }
    
    public void descontarFicha(){
        fichas--;
    }
}
