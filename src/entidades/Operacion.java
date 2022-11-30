package entidades;

import java.util.Scanner;

public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion(){

    }

    public Operacion(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1(){
        return numero1;
    }
    public void setNumero1(int numero1){
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }
    public void setNumero2(int numero2){
        this.numero2 = numero2;
    }

    public void crearOperacion(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese numero 1");
        this.setNumero1(scanner.nextInt());

        System.out.println("Ingrese numero 2");
        this.setNumero2(scanner.nextInt());
    }

    public int sumar(){
        int suma = numero1 + numero2;
        System.out.println("la suma es " + suma);
        return suma;
    }

    public int restar(){

      int resta = numero1 - numero2;
      System.out.println("la resta es " + resta);
      return resta;
    }

    public int multiplicar(){
        int resultado;

        if (numero1 == 0 || numero2 ==0){
            resultado = 0;
            System.out.println("Erro, " + resultado);

        }else {
            resultado = numero1 * numero2;
            System.out.println("la multiplicacion es " +  resultado);
        }
        return resultado;
    }
    public int dividir(){
        int resultado;

        if ( numero2 ==0){

            System.out.println("Erro,no se puede dividir por cero ");
            resultado =0;

        }else {
            resultado = numero1 / numero2;
            System.out.println("la division es " +  resultado);
        }
        return resultado;
    }
}
