
public class P4Ejercicio11
{
    public int multiEspecial(int n, int m){
        int res=0;
        for(int i=1; i<=m; i++){
            res=res+n;
        }

        /*
         * for(int i=0; i<m; i++){
        res=res+n;
        }
         */
        return res;
    }
}

