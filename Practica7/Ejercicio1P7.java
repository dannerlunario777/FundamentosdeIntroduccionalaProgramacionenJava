
public class Ejercicio1P7
{
    private String nom1;
    private String nom2;

    public Ejercicio1P7( String nom1,  String nom2){
        this.nom1 = nom1;
        this.nom2 = nom2;

    }

    public String sumarNombres(){
        String res = "";
        int distancia = 0;
        int suma1= 0;
        int suma2= 0;
        for(int i = 0; i < nom1.length(); i ++){
            suma1 += nom1.charAt(i);
        }
        for(int i = 0; i < nom2.length(); i ++){
            suma2 += nom2.charAt(i);
        }
        if(suma1 > suma2){
            distancia = suma1 - suma2;
            res = "La distancia entre "+nom1+" y "+nom2+" es de "+distancia;
        }else{
            distancia = suma2 - suma1;
            res = "La distancia entre "+nom1+" y "+nom2+" es de "+distancia;
        }
        return res;
    }
}
