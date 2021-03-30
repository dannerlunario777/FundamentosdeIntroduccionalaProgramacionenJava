
public class P3Ejercicio5
{
    public String parientes(int num1, int num2){
        String res = "";
        if(num1 > num2){
            if(num1 % num2 == 0){
                res = "¡ LOS NUMEROS SON PARIENTANGOS :) ! Bien ahi mi pariente";
            }else{
                res = "¡ Los numeros que introdujistes no son parientangos ! >:v";
            }
        }
        return res;
    }
}
