# Práctica de Programación: Colas (Estática, Circular y Dinámica)

Proyecto modular en Java que implementa y evalúa las variantes de la estructura de datos lineal **Cola** (Estática Lineal, Estática Circular y Dinámica con Nodos Enlazados) para el Instituto Tecnológico Superior de Xalapa[cite: 1, 3].

## Estructura del Proyecto
- **Estructuras_lineales/**: Contiene la clase `Nodo` y el paquete `COLA` con las implementaciones de `ColaEstatica`, `ColaEstaticaCircular` y `ColaDinamica`[cite: 1].
- **main_estatica/**: Contiene el `Main` independiente para probar la Cola Estática Lineal[cite: 1, 2].
- **main_circular/**: Contiene el `Main` independiente para probar la Cola Estática Circular[cite: 1, 2].
- **main_dinamica/**: Contiene el `Main` independiente para probar la Cola Dinámica[cite: 1, 2].

## Compilación y Ejecución por Consola

Para compilar todos los archivos fuente desde la raíz del proyecto, ejecuta:

```bash
javac Estructuras_lineales/Nodo.java Estructuras_lineales/COLA/*.java main_estatica/MainColaEstatica.java main_circular/MainColaCircular.java main_dinamica/MainColaDinamica.java
