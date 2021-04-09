package Practica4;


public class P4Ejercicio1
{
    private int num;
    public String nDigitos(int num){
        this.num = num;
        int cant=0;
        String res="";
        if(num>=0){
            //positivo
            //calcular la cant
            while(num>0){
                num= num/10;
                cant++;
            }
            res= "la cantidad de dig es "+cant;
        }else{
            //numero es negativo
            res = "es un numero negativo";
        }
        return res;
    }
}
