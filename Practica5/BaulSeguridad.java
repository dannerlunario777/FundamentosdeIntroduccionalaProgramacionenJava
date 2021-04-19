
public class BaulSeguridad
{
    private int claveBaul;
    private boolean estaAbierto;

    public BaulSeguridad(){
        claveBaul = 1111;
        estaAbierto = false;
    }

    public String abrir(int clave){
        String res;
        if(!estaAbierto){
            //cerrado
            if(clave == claveBaul){
                res = "clave correcta";
                estaAbierto = true;
            }else{
                res = "clave incorrecta >:V ";
            }
        }else{
            res  = "El baul ya esta abierto"; 
        }
        return res;
    }

    public String cerrar(){
        String res;
        if(estaAbierto){
            //Esta abierto vamo a cerrarlo
            estaAbierto = false;
            res = "Cerraste baul";
        }else{
            res = "Ya esta cerrado we :V";
        }
        return res;
    }

    public String cambiarClave(int nuevaClave){
        String res = "introduce un numero de 4 digitos";
        if(estaAbierto){
            if(cantDig(nuevaClave)==4){
                claveBaul = nuevaClave;
                res = "Cambiaste la clave";
            }
        }else{
            res = "Necesitas abrir el baul primero pillin/@";

            return res;
        }
        return res;
    }

    private int cantDig(int n){
        int cont = 0;
        while(n>0){
            cont++;
            n/=10;
        }
        return cont;
    }
}
