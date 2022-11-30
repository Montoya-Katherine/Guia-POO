package entidades;

public class Libro {
    private String titulo;
    private String autor;
    private String numPag;

    public Libro(){

    }
    public Libro( String titulo, String autor, String numPag){
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public String getTitulo(){
        return titulo;
    }
    public void  setTitulo( String titulo){
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNumPag() {
        return numPag;
    }

    public void setNumPag(String numPag) {
        this.numPag = numPag;
    }

    public void mostrarLibro(){
        System.out.println("El titulo del libro es: " + titulo );
        System.out.println("El autor: " + autor );
        System.out.println("Cantidad de pagina:" + numPag );

    }
}
