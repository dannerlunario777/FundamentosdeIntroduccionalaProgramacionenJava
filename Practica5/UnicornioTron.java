import java.util.Scanner;
public class UnicornioTron {
    private double premio;
    private int numSecreto;

    public UnicornioTron(double premio){
        this.premio= premio;
        numSecreto= (int)(Math.random()*11); 
    }

    public double getPremio(){
        return premio;
    }

    public void recargar(double dinero){
        premio+=dinero;
        numSecreto= (int)(Math.random()*11); 
    }

    public String jugar(Jugador jug){
        String msj="";
        int intentos= jug.getFichas();
        if(premio == 0.0){
            msj= "no hay premio";
        }else{
            if(intentos>0){
                //puede jugar
                String nombreJug= jug.getNombre();
                Scanner sc= new Scanner(System.in);
                System.out.println(nombreJug+" ingrese su numero: ");
                int num= sc.nextInt();
                if(numSecreto==num){
                    msj= "yeeeii ganastee!!";
                    premio=0.0;
                }else{
                    msj= "ese no era el numero";
                }
                jug.descontarFicha();
            }else{
                msj="ya no te queda intentos";
            }
        }

        return msj;
    }
}