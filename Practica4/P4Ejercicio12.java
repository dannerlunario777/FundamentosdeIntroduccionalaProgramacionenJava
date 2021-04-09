package Practica4;

public class P4Ejercicio12
{
    public String antiguaResta(int n, int m){
        int res = n - m;
        int cont = 1;
        while(res > m){
            cont ++;
            n = res;
            res = n - m;
        }
        return "Se pudo dividir "+cont+" veces";
    }
}
