
public class Ejercicio5P7
{
   private String cadena;
   
   public Ejercicio5P7(String cadena){
       this.cadena = cadena;
    }
    
    public String invertir(){
        String res = "";
        for(int i = 0; i < cadena.length(); i ++){
            res = cadena.charAt(i)+res;
        }
        return res;
    }
}
