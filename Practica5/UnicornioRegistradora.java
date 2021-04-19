package Practica5;


public class UnicornioRegistradora
{
    private int precioProducto;
    private int cantidadDeProducto;
    //private Person montoDeDinero;

    public UnicornioRegistradora(int precioProducto, int cantidadDeProducto){
        this.precioProducto = precioProducto;
        this.cantidadDeProducto = cantidadDeProducto;
        //montoDeDinero = new Person(0);
    }

    public String calcularPrecio(Person persona){
        int monto = persona.getMontoDeDinero();
        int res = precioProducto * cantidadDeProducto;
        String res2 = "El dinero indicado no cubre la compra >:v. Usted nos dio: "+monto+" y el precio total es: "+res;
        int cambio = monto - res;
        if(monto==res){
            return res2 = "Usted pago con Bs. "+monto+" El precio total es: "+res+" Cobro exitoso, esta cabal, gracias casa :)";
        }else if(monto>res){
                return res2 = "Usted pago con Bs. "+monto+" El precio total es: "+res+" Cobro exitoso su cambio es: "+cambio;
            
        }else if(monto<res){
            return res2;
        }
        return res2;
    }
}

