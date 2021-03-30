
public class P3Ejercicio7
{
    public int numero(int n){
        int res = 0;
        if(n >= 100 && n <= 999){
            res = n / 100;
        }else {
            System.out.println(generarMensaje());
        }
        return res;
    }
    public String generarMensaje(){
    return"!!! El numero que introdujiste debe ser de 3 cifras >:v ¡¡¡";
    
}
}
