
public class Ejercicio6
{
    public int calcularTiempo(){
        int hrDurmio = 2;
        int minDurmio = 45;
        int hrDesperto = 11;
        int minDesperto = 25;
        int hrDurmMin = hrDurmio * 60 + minDurmio;
        int hrDespMin = hrDesperto * 60 + minDesperto;
        int resultado = hrDespMin - hrDurmMin;
        return resultado;    
}
}
    