package Practica4;

public class P4Ejercicio6
{
    public String numeros(int num){
        String res = "Numero negativo";
        int aux = 0;
        for(int i = 1; i <= num/2; i++){
            aux += i; 
            if(num % i != 0){
                aux -= i; 
            }
        }
        if(aux == num){
            res = "Numero perfecto";
        }if(aux < num){
            res = "Numero Defectivo";
        }else if(aux > num)
            res = "Numero Abundante";
            return res;
            
        }
    }


