import entidades.Cancion;
import entidades.Libro;
import entidades.Operacion;
import entidades.Rectangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.crearRectangulo();
        rectangulo.calcularArea();
        /*Operacion operacion = new Operacion();
        operacion.crearOperacion();
        operacion.sumar();
        operacion.restar();
        operacion.multiplicar();
        operacion.dividir();


        Cancion cancion = new Cancion();
        cancion.pedirUsuario();
        cancion.mostrarCancion();

        Libro libro = new Libro();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el titulo del libro");
        libro.setTitulo(scanner.nextLine());

        System.out.println("Ingrese el autor del libro");
        libro.setAutor(scanner.nextLine());

        System.out.println("Ingrese la cantidad de paginas");
        libro.setNumPag(scanner.nextLine());

        libro.mostrarLibro();*/
    }
}
