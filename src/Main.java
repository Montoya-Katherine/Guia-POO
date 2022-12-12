import entidades.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Persona persona = new Persona();
        persona.crearPersona();
        System.out.println(persona.calcularImc());
        System.out.println("La persona es mayor de edad " +  persona.esMayorDeEdad());



//Cafetera -  aca mi duda es en el ultimo metodo de agregar cafe,
// yo por parametro cuando lo invoco al metodo le paso el valor 0
// para luego poder inicializar con un scanner  la variable para que el valor lo ingrese el usuario

       /*Cafetera cafetera= new Cafetera(1000, 200);
        System.out.println( cafetera.llenarCafetera());
        cafetera.servirTaza(1200);
        System.out.println(cafetera.vaciarCafetera());
        System.out.println(cafetera.agregarCafe(0));


// cuenta Bancaria - no se si esta bien planteado como pide el ejercicio.

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
