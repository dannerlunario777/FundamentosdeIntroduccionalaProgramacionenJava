
public class P2Ejercicio6
{
    public int abc(int num){
        //entrada 432 salida 243
        int a;
        int b;
        int c;
        a = num / 100;
        b = (num % 100)/10;
        c = (num % 100) % 10;
        return c*100+(a*10+b);
    }
}
