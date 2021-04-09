package Practica4;

public class P4Ejercicio7
{
    public String numNarcisista(int num){
        String res = "Es un numero negativo";
        int aux = 0;
        int help = 0;
        while(num>0){
            aux = num / 10;
            num = aux;
            help += aux%10 * aux%10 * aux%10;
        }
        if(help == num){
            res = "Es un numero Narcisista";
        }else if(help != num){
             res = "Es un numero Normal";
        }
        return res;
    }
}