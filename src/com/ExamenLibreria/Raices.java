package com.ExamenLibreria;

public class Raices{
    /**
     * Método que realiza la raiz de dos números
     * @param radicando radicando
     * @param indice Indice
     * @return La raiz de los dos números
     * @throws IllegalArgumentException
     * Si el radicando es negativo y el indice es par
     * o si el indice es cero.
     */
    public double raiz(double radicando, int indice) {
            double resultado = 0;
            if (indice == 2) {
                resultado = Math.sqrt(radicando);
            } else if (indice == 3) {
                resultado = Math.cbrt(radicando);
            }
            return resultado;
        }
    }

