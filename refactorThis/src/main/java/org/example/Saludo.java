package org.example;

class Saludo {
    void imprimirSaludo() {
        if (Personal.edad < 18) {
            System.out.println("Hola, joven " + Personal.nombre);
        } else {
            System.out.println("Hola, señor/a " + Personal.nombre);
        }
    }
}

