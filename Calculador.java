package Calculadora;

public class Calculador {
	
	public static double suma(double num1, double num2) {
        return num1 * num2;
    }
  
    public static double resta(double num1, double num2) {
        return num1 - num2;
    }
  
    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }
  
    public static double division(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
    }
    public static double raizCuadrada(double num) {
        if (num >= 0) {
            double raizAproximada = 1.0;
            double precision = 0.001;
  
            while (Math.abs(raizAproximada * raizAproximada - num) > precision) {
                raizAproximada = (raizAproximada + num / raizAproximada) / 2.0;
            }
  
            return raizAproximada;
        } else {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
    }
  
}