
public class Ejercicio7P7
{
    private String p1;
    private String p2;

    public Ejercicio7P7(String p1, String p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public String lexicograficamente(){
        String res = "";
        int tam1 = p1.length();
        int tam2 = p2.length();
        if(tam1 != tam2 && p1 != p2){
        if(tam1 > tam2){
            res = "La palabra "+p2+" es menor lexicograficamente que "+p1;
        }else{
            res = "La palabra "+p1+" es menor lexicograficamente que "+p2;
        }
    }else{
        res = "Las palabras son lexicograficamente iguales";
    }
        return res;
    }
}
