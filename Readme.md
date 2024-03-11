# Proyecto Raíces

Este proyecto consiste en la implementación de un método para calcular cualquier raíz de un número.

## Proceso de desarrollo

1. Creé una nueva rama llamada 'raices'.
2. Me moví a esta rama para trabajar en ella.
3. Creé la clase `com.ExamenLibreria.Raices`.
4. Generé la documentación Javadoc para la clase `com.ExamenLibreria.Raices`.
5. Implementé el método `raiz` que permite calcular cualquier raíz de un número.
6. Implementé el método `raiz` en la clase `com.ExamenLibreria.Main` para comprobar que funciona correctamente.

## Método calcularRaiz

El método `calcularRaiz` en la clase `com.ExamenLibreria.Raices` se podría implementar de la siguiente manera si solamente quisieramos calcular la raíz cuadrada o cúbica de un número:

```java
public double raiz(double radicando, int indice) {
    double resultado = 0;
    if (indice == 2) {
        resultado = Math.sqrt(numero);
    } else if (indice == 3) {
        resultado = Math.cbrt(numero);
    }
    return resultado;
}
```
## Crear el artifact 

En el `src`, creamos un paquete nuevo, en este caso lo llamé `com.ExamenLibreria` y metemos todas las clases, incluyendo la main, dentro de dichi paquete.
Posteriormente, creamos un artifact de esta manera:
1. Vamos a la pestaña **File** y buscamos ***Project Structure***
2. Dentro de Project Structure le damos a ***Artifacts*** y clicamos en el +
3. Le damos a JAR y luego a **From modules with dependencies...**
4. Le damos todo `OK`
5. Después, nos vamos a la pestaña **Build** y le damos a ***Build Artifacts***
6. Nos saldrá un pestaña con el Jar que queremos "buildear" y le damos a ***Build***
7. Ya tendríamos nuestro Jar listo