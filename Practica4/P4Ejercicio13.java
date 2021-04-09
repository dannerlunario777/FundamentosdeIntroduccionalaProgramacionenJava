package Practica4;

public class P4Ejercicio13
{
    public String numerosAmigos(int n, int m){
        int sumaN= sumaNumPropios(n);
        int sumaM= sumaNumPropios(m);
        String res="no son amigos :,( super F"; //por defecto
        if(sumaN==m && sumaM==n){
            res="! Son AMIGOS ¡:)";
        }
        return res;
    }

    private int sumaNumPropios(int a){
        int sum=0;
        for(int posibleDiv=1; posibleDiv<=(a/2) ; posibleDiv++){
            if(a%posibleDiv==0){
                sum+=posibleDiv; // sum= sum + posibleDiv;
            }
        }
        return sum;
    }
}
