package org.example;

public class Main {
    public static void main(String[] args) {
        Personal.datos("Juan Perez", 45, 50000);
        Personal.mostrar();
        Bono b = new Bono();
        b.calcularBono();
        Saludo c = new Saludo();
        c.imprimirSaludo();
    }
}
