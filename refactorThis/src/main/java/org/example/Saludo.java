package org.example;
class Saludo {
    void imprimirSaludo() {
        if (Empleado.edad < 18) {
            System.out.println("Hola, joven " + Empleado.nombre);
        } else {
            System.out.println("Hola, señor/a " + Empleado.nombre);
        }
    }
}

