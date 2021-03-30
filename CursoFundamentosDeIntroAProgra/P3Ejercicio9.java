
public class P3Ejercicio9
{
   public String añoBiciesto(int año){
       String res = "El año no es Bisiesto :,(";
       if(año >= 1){
        }if(año % 4 == 0 || año % 400 == 0){
       res = "El año es Bisiesto :)";
       }else{res = res;
        }
        return res;
    }
}
