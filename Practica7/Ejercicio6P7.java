
public class Ejercicio6P7
{
    private String nom;
    private String pref;
    
    public Ejercicio6P7(String nom, String pref){
        this.nom = nom;
        this.pref = pref;
    }
    
    public String esPrefijo(){
        String res = "";
        int tam = pref.length();
        for(int i = 0; i < tam; i ++){
            if(nom.charAt(i) == pref.charAt(i)){
                res = "El nombre "+nom+", Si comienza con el prefijo "+pref;
            }else{
                res = "El nombre "+nom+", No comienza con el prefijo "+pref;
        }
    }
    return res;
}
}

