public class Ejercicio1 {

    public static void main(String[] args){

        int x = 144;
        int y = 999;
        int suma = x + y;
        int resta = x - y;
        double division = (double) x / y;
        int multiplicacion = x * y;

        System.out.printf("%d + %d = %d\n", x, y, suma );
        System.out.printf("%d - %d = %d\n", x, y, resta );
        System.out.printf("%d / %d = %.2f\n", x, y, division );
        System.out.printf("%d * %d = %d\n", x, y, multiplicacion );
    }
}