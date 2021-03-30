
public class P3Ejercicio2
{
    public int precioTotal(int a, int b, int c){
        int res = 0;
        if(a > b && a > c){
            res = b + c;
        }if(b > a && b > c){
            res = a + c;
        }if(c > b && c > a){
            res = b + a;
        }if(a == b && b == c){
            res = b + a;
        }
        return res;
}
}
       

