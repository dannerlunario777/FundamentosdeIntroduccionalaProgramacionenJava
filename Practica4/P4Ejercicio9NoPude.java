package Practica4;

public class P4Ejercicio9NoPude
{
   public int numBinario(int num){
       int res = 0;
       int auxBinario = 0;
       while(num>0){
           auxBinario = num/2;
           res += num%2 * 10;
           num = auxBinario;
        }
        return res;
    }
}
