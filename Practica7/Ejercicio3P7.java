
public class Ejercicio3P7
{
    private String cadena;

    public Ejercicio3P7(String cadena){
        this.cadena = cadena;
    }

    public String nroDeSignos(){
        int cont = 0;
        for(int i = 0; i < cadena.length(); i ++){
            if(cadena.charAt(i)==','){
                cont++;
                System.out.println(cadena.charAt(i));
            }
        }
        for(int i = 0; i < cadena.length(); i ++){
            if(cadena.charAt(i)=='.'){
                cont++;
                System.out.println(cadena.charAt(i));
            }
        }
        for(int i = 0; i < cadena.length(); i ++){
            if(cadena.charAt(i)=='¿'){
                cont++;
                System.out.println(cadena.charAt(i));
            }
        }
        for(int i = 0; i < cadena.length(); i ++){
            if(cadena.charAt(i)=='?'){
                cont++;
                System.out.println(cadena.charAt(i));
            }
        }
        for(int i = 0; i < cadena.length(); i ++){
            if(cadena.charAt(i)=='¡'){
                cont++;
                System.out.println(cadena.charAt(i));
            }
        }
        for(int i = 0; i < cadena.length(); i ++){
            if(cadena.charAt(i)=='!'){
                cont++;
                System.out.println(cadena.charAt(i));
            }
        }
        return "Existen "+cont+" signos de puntuacion";
    }
}

