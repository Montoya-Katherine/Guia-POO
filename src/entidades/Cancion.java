package entidades;

import java.util.Scanner;

public class Cancion {
    private String titulo;
    private String autor;

    public Cancion(){

    }
    public Cancion( String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public void  setTitulo( String titulo){
        this.titulo= titulo;
    }

    public String getAutor(){
        return autor;
    }
    public void  setAutor( String autor){
        this.autor= autor;
    }

    public void pedirUsuario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el titulo de la cancion");
        this.setTitulo(scanner.nextLine());

        System.out.println("Ingrese el autor");
        this.setAutor(scanner.nextLine());
    }

    public void mostrarCancion(){
        System.out.println("Titulo de la cancion: " + titulo);
        System.out.println("Su autor: "+ autor);
    }
}
