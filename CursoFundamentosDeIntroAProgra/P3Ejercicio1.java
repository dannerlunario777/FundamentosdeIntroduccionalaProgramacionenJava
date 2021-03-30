
public class P3Ejercicio1
{
    public void nroCapicua(int nro){
        int result = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        if(nro >= 100 && nro <= 999){
            a = nro / 100;
            b = (nro % 100) / 10;
            c = (nro % 100) % 10;
            if(nro == c * 100 +(b * 10 + a)){
                System.out.println("El numero: "+nro+" es capicua!! :)");
            }else{
                System.out.println("El numero no es capicua :(");
            }
        }
    }
}
   