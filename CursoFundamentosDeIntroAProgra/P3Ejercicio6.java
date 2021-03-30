public class P3Ejercicio6
{
    public void datos(int a, int b, int c, String aA, String bB, String cC){
        int mayor = 0;
        int medio = 0;
        int menor = 0;
        if(a>b&&b>c){
            System.out.println("El hermano mayor es: "+aA+" , "+a);
            System.out.println("El hermano del medio es: "+bB+" , "+b);
            System.out.println("El hermano menor es: "+cC+" , "+c);
        }if(a>c&&c>b){
            System.out.println("El hermano mayor es: "+aA+" , "+a);
            System.out.println("El hermano del medio es: "+cC+" , "+c);
            System.out.println("El hermano menor es: "+bB+" , "+b);
        }if(b>a&&a>c){
            System.out.println("El hermano mayor es: "+bB+" , "+b);
            System.out.println("El hermano del medio es: "+aA+" , "+a);
            System.out.println("El hermano menor es: "+cC+" , "+c);
        }if(b>c&&c>a){
            System.out.println("El hermano mayor es: "+bB+" , "+b);
            System.out.println("El hermano del medio es: "+cC+" , "+c);
            System.out.println("El hermano menor es: "+aA+" , "+a);
        }if(c>a&&a>b){
            System.out.println("El hermano mayor es: "+cC+" , "+c);
            System.out.println("El hermano del medio es: "+aA+" , "+a);
            System.out.println("El hermano menor es: "+bB+" , "+b);
        }if(c>b&&b>a){
            System.out.println("El hermano mayor es: "+cC+" , "+c);
            System.out.println("El hermano del medio es: "+bB+" , "+b);
            System.out.println("El hermano menor es: "+aA+" , "+a);
        }
    }
}
    
 