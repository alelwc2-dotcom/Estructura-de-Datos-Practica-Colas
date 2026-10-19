package main_dinamica;

import Estructuras_lineales.COLA.ColaDinamica;

public class MainColaDinamica {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COLA DINÁMICA ===");
        ColaDinamica cola = new ColaDinamica();

        cola.encolar(5);
        cola.encolar(15);
        cola.encolar(25);
        cola.mostrar();

        System.out.println("Total de elementos: " + cola.contarElementos());
        System.out.println("Elemento al frente (peek): " + cola.peek());
        System.out.println("Desencolado: " + cola.desencolar());
        cola.mostrar();
    }
}
