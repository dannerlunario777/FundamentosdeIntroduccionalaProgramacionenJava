
public class P3Ejercicio10
{
    public String numeroEnCrecimiento(int num){
        int aux = 0;
        int aux2 = 0;
        String res = "El numero NO esta en ( ¡CRECIMIENTO ) :(";
        if(num >= 100 && num <= 999){
            aux = num % 100;
            aux2 = aux % 10;
        }if(aux2 == 9){
            res = "Es numero en (CRECIMIENTO) !YEY¡ :,)";
        }
        return res;
    }
}
