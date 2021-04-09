package Practica4;
public class P4Ejercicio4
{
    public int factorial(int num){
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i; // resultado = resultado * i;
        }
        
        /*for(int i=num; i>0; i--){
            resultado *= i;
        }*/
        return resultado;
    }
}


