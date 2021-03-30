
public class P3Ejercicio8
{
    public void fecha(int dia, int mes, int año){
        String res = "¡ Pusiste mal la fecha ! >:v";
        if(dia >= 1 && dia <= 31){  
        }else if(mes >= 1 && dia <= 12){
        }else if(año >= 1){
        }if(mes == 1){
            res = dia +" de enero del "+ año;
        }if(mes == 2){
            res = dia +" de febrero del "+ año;
        }if(mes == 3){
            res = dia +" de marzo del "+ año;
        }if(mes == 4){
            res = dia +" de abril del "+ año;
        }if(mes == 5){
            res = dia +" de mayo del "+ año;
        }if(mes == 6){
            res = dia +" de junio del "+ año;
        }if(mes == 7){
            res = dia +" de julio del "+ año;
        }if(mes == 8){
            res = dia +" de agosto del "+ año;
        }if(mes == 9){
            res = dia +" de septiembre del "+ año;
        }if(mes == 10){
            res = dia +" de octubre del "+ año;
        }if(mes == 11){
            res = dia +" de noviembre del "+ año;
        }if(mes == 12){
            res = dia +" de diciembre del "+ año;
    }
    System.out.println(res);
}
}
