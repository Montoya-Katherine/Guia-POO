import entidades.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Cuenta cuenta = new Cuenta();
        cuenta.crearCuenta();

        cuenta.ingresarDinero(100);
        cuenta.consultarSaldo();
        cuenta.ingresarDinero(200);
        cuenta.consultarSaldo();
        cuenta.retirarDinero(500);
        cuenta.consultarSaldo();
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();
        cuenta.consultarDatos();

        /*Rectangulo rectangulo = new Rectangulo();
        rectangulo.crearRectangulo();
        rectangulo.calcularArea();


        Operacion operacion = new Operacion();
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
