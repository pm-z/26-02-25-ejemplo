package org.example;

class Bono {
    void calcularBono() {
        double bono = 0;
        if (Personal.edad > 50) {
            bono = Personal.salario * 0.10;
        } else {
            bono = Personal.salario * 0.05;
        }
        System.out.println("Bono: " + bono);
    }
}

