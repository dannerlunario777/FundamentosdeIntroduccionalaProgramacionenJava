package Practica4;

public class P4Ejercicio8
{
    public int numCambiado(int num){
        int res = 0;
        int fin = 0;
        int inicio = num;
        while(num>10){
            fin = num / 10;
            num = fin;
        }
        res = inicio%10 * 10 + fin;
        return res;
    }
}
