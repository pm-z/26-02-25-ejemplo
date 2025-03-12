package org.example;
class Bono {
    void calcularBono() {
        double bono = 0;
        if (Empleado.edad > 50) {
            bono = Empleado.salario * 0.10;
        } else {
            bono = Empleado.salario * 0.05;
        }
        System.out.println("Bono: " + bono);
    }
}

