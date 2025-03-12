package org.example;

public class Main{
    public static void main (String[] args) {
        Empleado.datos("Juan Perez", 45, 50000);
        Empleado.mostrar();
        Bono b = new Bono();
        b.calcularBono();
        Saludo c = new Saludo();
        c.imprimirSaludo();
    }
}
