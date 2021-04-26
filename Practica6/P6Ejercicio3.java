
public class P6Ejercicio3
{
    private int [] arrDesequilibrio;

    public P6Ejercicio3(int [] arr){
        arrDesequilibrio = arr;
    }

    public String hallarLaAnomalia(){
        String res = "";
        int [] nuevoArr = null;
        int mitad = arrDesequilibrio[arrDesequilibrio.length/2];
        int suma1 = 0;
        int suma2 = 0;
        for(int i = 0; i < mitad; i ++){
            suma1 = suma1+arrDesequilibrio[i];
        }
        for(int i = mitad; i < arrDesequilibrio.length-1; i ++){
            suma2 = suma2+arrDesequilibrio[i];
        }
        if(suma1 != suma2){
        if(suma1 > suma2){
            for(int i = 0; i < mitad; i ++){
                nuevoArr[i] = arrDesequilibrio[i];
            }
        }else{
            for(int i = mitad; i < arrDesequilibrio.length-1; i ++){
                nuevoArr[i] = arrDesequilibrio[i];
            }
        }
        int [] nueArr2 = null;
        int mitad2=nuevoArr[nuevoArr.length/2];
        int suma3 = 0;
        int suma4 = 0;
        for(int i = 0; i < mitad2; i ++){
            suma3 = suma3+nuevoArr[i];
        }
        for(int i = mitad2; i < nuevoArr.length-1; i ++){
            suma4 = suma4+nuevoArr[i];
        }
        if(suma3 > suma4){
            for(int i = 0; i < mitad; i ++){
                nueArr2[i] = nuevoArr[i];
            }
        }else{
            for(int i = mitad; i < nuevoArr.length-1; i ++){
                nueArr2[i] = nuevoArr[i];
            }
        }
        int [] nueArr3 = null;
        int mitad3=nueArr2[nueArr2.length/2];
        int suma5 = 0;
        int suma6 = 0;
        for(int i = 0; i < mitad3; i ++){
            suma5 = suma5+nuevoArr[i];
        }
        for(int i = mitad3; i < nuevoArr.length-1; i ++){
            suma6 = suma6+nuevoArr[i];
        }
        if(suma5 > suma6){
            
            res = "La anomalia es: "+suma5;
        }else{
            res = "La anomalia es: "+suma6;
        }
    }else{
        res = "Ambas partes son iguales";
    }
    return res;
    }
}
