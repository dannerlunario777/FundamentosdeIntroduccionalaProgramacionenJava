package Practica4;
public class P4Ejercicio15
{
    public int corazonNum(int n){
        int res;
        int cant= cantDig(n);
        int iteraciones= cant/2;
        if(cant%2==0){
            int dig=n%10;
            while(iteraciones>0){
                dig=n%10;
                n=n/10;
                iteraciones--;
            }
            res=(n%10)*10+dig;
        }else{
            while(iteraciones>0){
                n=n/10;
                iteraciones--;
            }
            res= n%10;
        }
        return res;
    }
    
    private int cantDig(int n){
        int cont=0;
        while(n>0){
            cont++;
            n/=10;
        }
        return cont;
    }
    
}
