
public class P3Ejercicio3
{
    public String diaSimbolico(int num){
        String res = "";
        int aux = 0;
        int aux2 = 0;
        if(num >= 0 && num < 10){
            res = "Dia normal";
        }if(num >= 10 && num <= 99){
            aux = num / 10;
            aux2 = num % 10;
        }if((aux > 0 && aux < 10)&&(aux2 >= 0 && aux < 10)){
        }if((aux % 2 == 0)&&(aux2 % 2 != 0)){
            res = "Cruz de Dariel";
        }if((aux % 2 != 0)&&(aux2 % 2 == 0)){
            res = "Cruz de Dariel";
        }if((aux % 2 == 0) && (aux2 % 2 == 0)){
            res = "Dia normal";
        }if((aux % 2 != 0) && (aux2 % 2 != 0)){
            res = "Dia normal";
        }
        return res;
}
}
