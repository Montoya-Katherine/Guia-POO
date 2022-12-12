package entidades;

import java.util.Scanner;

public class Cafetera {
    private int capacidadMax;
    private int cantidadActual;

    public Cafetera(){


    }

    public Cafetera(int capacidadMax, int cantidadActual){
        this.capacidadMax = capacidadMax;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    public int llenarCafetera(){
        if (cantidadActual < capacidadMax){
            this.setCantidadActual(cantidadActual = capacidadMax);
        }
        return cantidadActual;
    }

    public int servirTaza(int tamanioTaza){

        if (cantidadActual < tamanioTaza){
            this.setCantidadActual(tamanioTaza - cantidadActual);
            System.out.println("No alcanzo a llenar la taza, le falta llenar " + cantidadActual + "ml");
        }else {
            this.setCantidadActual(cantidadActual - tamanioTaza);
            System.out.println("Se lleno la taza");
        }

        return cantidadActual;
    }

    public int vaciarCafetera(){

        this.setCantidadActual(0);
        return cantidadActual;
    }

    public int agregarCafe(int cantCafe){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de cafe deseado");
        cantCafe = scanner.nextInt();

        this.setCantidadActual(cantidadActual + cantCafe);
        return cantidadActual;
    }
    // el metodo agrega cafe a la cafetera
    public void agregarCafe2(int cantidadCafe) {
        cantidadActual+= cantidadCafe;
        System.out.println("La cafetera tiene la capacidad actual de :" + cantidadActual);

    }

}
