package entidades;

import java.util.Scanner;

public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese base del triangulo");
        this.setBase(scanner.nextInt());

        System.out.println("ingrese la altura del triangulo");
        this.setAltura(scanner.nextInt());

    }

    public int calcularArea(){
        int area;
        area = base * altura;
        System.out.println("AREA " + area);
        return  area;
    }

}
