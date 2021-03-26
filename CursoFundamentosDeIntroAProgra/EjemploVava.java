
public class EjemploVava
{
   public int SumarMin(){
       int a = convertirHrsMin(8);
       int b = convertirHrsMin(5);
       return a + b;
    }
    public int convertirHrsMin(int hr){
        return hr*60;
    }
}
