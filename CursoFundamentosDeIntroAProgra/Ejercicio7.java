
public class Ejercicio7
{
    public int Bateria () {
        int tiempohr = 1;
        int tiempoenMin = 60;
        int convertirHraMin = tiempohr * tiempoenMin;
        int jugar1h = 20;
        int redes1h = 10;
        int youtube1h = 15;
        int bateria = 55;
        int juegoMediaHra = (jugar1h * 30) / convertirHraMin; // 30 minnutos de juego
        int redesQuinceMin = (redes1h * 15) / convertirHraMin;  // 15 minutos de redes
        int youtubeCuarentaMin = (youtube1h * 40) / convertirHraMin; // 40 minutos de youtube
        int resultado = bateria -(juegoMediaHra + redesQuinceMin + youtubeCuarentaMin);
        return resultado;
    }
}
    