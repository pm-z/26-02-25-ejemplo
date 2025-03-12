package org.example;

public class Main{
    public static void main (String[] args) {

        Empleado.datos("Juan Perez", 15, 50000);
        Bono b = new Bono();
        b.calcularBono();
        Saludo c = new Saludo();
        c.imprimirSaludo();
    }
}
