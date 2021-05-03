
public class Ejercicio4P7
{
    private String cadena;

    public Ejercicio4P7(String cadena){
        this.cadena = cadena;
    }

    public String nroDeVocales(){
        int cont = 0;
        String nCadena = cadena.toLowerCase();
        for(int i = 0; i < nCadena.length(); i ++){
            if(nCadena.charAt(i)=='a'){
                cont++;
            }
        }
        for(int i = 0; i < nCadena.length(); i ++){
            if(nCadena.charAt(i)=='e'){
                cont++;
            }
        }
        for(int i = 0; i < nCadena.length(); i ++){
            if(nCadena.charAt(i)=='i'){
                cont++;
            }
        }
        for(int i = 0; i < nCadena.length(); i ++){
            if(nCadena.charAt(i)=='o'){
                cont++;
            }
        }
        for(int i = 0; i < nCadena.length(); i ++){
            if(nCadena.charAt(i)=='u'){
                cont++;
            }
        }
      
        return "Existen "+cont+" vocales";
    }
}


