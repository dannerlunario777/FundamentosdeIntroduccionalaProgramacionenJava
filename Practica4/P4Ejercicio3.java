
public class P4Ejercicio3
{
    public int numInv(int num){
        int invertido = 0;
        int resto = 0;
        while(num > 0){
            resto = num % 10;
            invertido = invertido * 10 + resto;
            num = num / 10;
        }
        return invertido;
    }
}
