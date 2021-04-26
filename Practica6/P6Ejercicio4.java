
public class P6Ejercicio4
{
    private int [] estrellas;
    public P6Ejercicio4 (int [] arr){
        estrellas = arr;
    }
public String calcularEstrellas(int inicio, int fin){
    int cont = 0;

    for(int i = inicio ; i<=fin; i++){
        if(estrellas[i]==0){
            cont++; 
    }
}
return "Hay "+cont+" estrella(s) que han dejado de brillar : (";
}
}
