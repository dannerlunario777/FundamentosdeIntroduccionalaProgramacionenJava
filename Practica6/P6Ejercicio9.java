
public class P6Ejercicio9
{

    private int cap;
    private Cancion[] repertorio;
    private int cont;
    public P6Ejercicio9(int capacidad){
        cap= capacidad;
        repertorio= new Cancion[cap];
        cont=0;
    }

    public boolean agregarCancion(Cancion c){
        boolean res=false;
        if(cont<cap){
            repertorio[cont]= c;
            cont++;
            res=true;
        }
        return res;
    }
    
    public boolean eliminarCancion(String nombreCancion){
        boolean res=false;
        for(int i=0;i<cap;i++){
            Cancion miCancion= repertorio[i];
            String titulo= miCancion.getTitulo();
            if(titulo.equals(nombreCancion)){
                //eliminar
                repertorio[i]=null;
                res=true;
            }
        }
        return res;
    }
}

