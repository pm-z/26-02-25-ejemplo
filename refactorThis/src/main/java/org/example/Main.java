package org.example;
<<<<<<< HEAD
=======
class noName {//Porque no tiene nombres
    static String nombre = "SinNombre";
    static int edad = 0;
    static double salario = 0.0;

    static void datos(String n, int e, double s) {
        nombre = n;
        edad = e;
        salario = s;
    }

    static void mostrar() {//Mostrar no name
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}

class Bono {
    void calcularBono() {
        double bono = 0;
        if (A.edad > 50) {
            bono = A.salario * 0.10;
        } else {
            bono = A.salario * 0.05;
        }
        System.out.println("Bono: " + bono);
    }
}

class Saludo {
    void imprimirSaludo() {
        if (A.edad < 18) {
            System.out.println("Hola, joven " + A.nombre);
        } else {
            System.out.println("Hola, señor/a " + A.nombre);
        }
    }
}
>>>>>>> e5f73bb12f8edd1c27cad447fdc340693c719814

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
