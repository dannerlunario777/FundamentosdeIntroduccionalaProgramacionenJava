
public class Ejercicio2
{
    public int MontoDeDinero () {
        int DineroActual = 300;
        int CienPorciento = 100;
        int CincoPorciento = 5;
        int resultado = (DineroActual * CienPorciento)/5;
        int cont = 0;
        while(cont <= 12){
            DineroActual = DineroActual + resultado;
            cont++; 
        }
        return resultado;
}
}
 