package entidades;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private byte edad;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(){}

    public Persona(String nombre, byte edad, char sexo,
                   double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona(){
        Scanner scanner= new Scanner(System.in,"ISO-8859-1").useDelimiter("\n");

        System.out.println("Ingrese su nombre");
        nombre = scanner.nextLine();

        System.out.println("Ingrese su edad");
        edad = scanner.nextByte();

        System.out.println("Ingrese su sexo");
        do {
            sexo = scanner.next().charAt(0);
            if (!(sexo == 'm' || sexo == 'f' || sexo == 'o')) {
                System.out.println("ingrese un caracter valido como ser m, f, o");
            }
        } while (!(sexo == 'm' || sexo == 'f' || sexo == 'o'));

        System.out.println("Ingrese su peso");
        peso = scanner.nextDouble();

        System.out.println("Ingrese su altura");
        altura = scanner.nextDouble();






    }
    public String calcularImc() {
        double calculoImc = peso / (Math.pow(altura, 2));
        if (calculoImc < 20) {
            return  "¡ADVERTENCIA! La persona está por debajo de su peso ideal";
        } else if (calculoImc >= 20 && calculoImc <= 25) {
            return "¡FELICITACIONES! La persona está en su peso ideal";
        } else {
            return "¡ADVERTENCIA! La persona tiene sobrepeso";
        }
    }

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }

    }

}
