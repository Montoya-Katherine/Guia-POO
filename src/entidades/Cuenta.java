package entidades;

import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private int dni;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int dni, double saldoActual, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni= dni;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void crearCuenta(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su DNI");
        dni= scanner.nextInt();

        System.out.println("Ingrese su numero de cuenta");
        numeroCuenta = scanner.nextInt();

        System.out.println("Ingrese saldo actual");
        saldoActual = scanner.nextDouble();

    }

    public double ingresarDinero(double ingreso){
        saldoActual = saldoActual + ingreso;
        return saldoActual;
    }

    public double retirarDinero(double retiro){

        this.setSaldoActual(saldoActual - retiro);
        if (this.saldoActual < 0){
            this.saldoActual = 0;
        }
        return saldoActual;
    }

    public double extraccionRapida(){
        this.setSaldoActual(saldoActual * 0.2);
        return saldoActual;
    }

    public double consultarSaldo(){
        System.out.println("Saldo actual es: " + saldoActual);
        return saldoActual;
    }

    public void consultarDatos(){
        System.out.println("DNI: " + dni);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo total:" + saldoActual);
    }
}
