
public class UnicornioBot
{
    private String nombre;
    
  public UnicornioBot(String nombre){
      this.nombre = nombre;
    }
    
  public String saludar(String nombre){
      String res = "!!!Hola "+nombre+"¡¡¡";
      return res;
    }
    
  public String setNombre(String nombre){
      return nombre;
    }
}
