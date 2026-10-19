package main_circular;

import Estructuras_lineales.COLA.ColaEstaticaCircular;

public class MainColaCircular {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COLA ESTÁTICA CIRCULAR ===");
        ColaEstaticaCircular cola = new ColaEstaticaCircular(4);

        cola.encolar(100);
        cola.encolar(200);
        cola.encolar(300);
        cola.mostrar();

        System.out.println("Elemento al frente (peek): " + cola.peek());
        System.out.println("Desencolado: " + cola.desencolar());
        cola.mostrar();
    }
}
