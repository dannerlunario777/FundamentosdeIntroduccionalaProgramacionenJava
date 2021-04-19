
public class RitmoCornio
{
    private String can1;
    private String can2;
    private String can3;
    private boolean reproduciendo = true;
    private boolean stop = false;

    public RitmoCornio(String can1, String can2, String can3){
        this.can1 = can1;
        this.can2 = can2;
        this.can3 = can3;
    }


    public String CambiarCancion(int canActual){
        int n1 = 1; //can1 
        int n2 = 2; //can2 
        int n3 = 3; //can3
        String res  = "";
        if(canActual == 1){
            res = can2;
        }else if(canActual == 2){
            res = can3;
        }else if(canActual == 3){
            res = can1;

        }
        return res;
    }
    
    public void setStop(){
        stop = !stop;
    }
    
    public void setReproduciendo(){
        reproduciendo = !stop;
    }
    
    public String Reproducir(){
        String res = "";
        if(reproduciendo || stop){
            res = "Se esta reproduciendo una cancion, puedes pausar la cancion";
        }else{
            res = "la cancion ya esta pausada";
        }
        return res;
    }
}

