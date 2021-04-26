public class Cancion{
    private String autor,titulo;

    public Cancion(String autor, String titulo){
        this.autor= autor;
        this.titulo= titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getTitulo(){
        return titulo;
    }
}