package Calculadora;
public class CalculadoraTest {

    public static void main(String[] args) {
        testSuma();
        testResta();
        testMultiplicacion();
        testDivision();
        testRaiz();
        testExponencial();
    }

    private static void testSuma() {
        double result = Calculador.suma(2.5, 3.5);
        assert result == 6.0; 
        System.out.println("Suma correcta");
    }

    private static void testResta() {
        double result = Calculador.resta(5.0, 2.0);
        assert result == 3.0;
        System.out.println("Resta correcta");
    }

}
