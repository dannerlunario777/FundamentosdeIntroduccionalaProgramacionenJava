
public class P2Ejercicio4
{
    public int cuantasHojasSeNecesitan(int n){
        if(n >= 1){
            if(n % 2 == 0){
                return n/2;
            }else{
                return n/2 + 1;
            }
        }
        return n;
    }
}

