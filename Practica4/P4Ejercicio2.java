
public class P4Ejercicio2
{
    public String numPrimComp(int num){
        String res = "tu numero es negativo";
        if(num != 2 && num != 3){
            if(num % 2 == 0 || num % 3 == 0){
                res = "El numero "+num+" es numero compuesto";
            }else{
                res = "El numero "+num+" es numero primo";
            }
        }else{
            if(num == 2 || num == 3){
                res = "El numero "+num+" es numero primo";
            }
        }
        return res;
    }
}
