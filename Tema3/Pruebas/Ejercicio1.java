import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

        System.out.print("Por favor, introduzca el primer número: ");
        int num1 = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca el segundo número: ");
        int num2 = Integer.parseInt(System.console().readLine());

        int resultado = num1 * num2;

        System.out.printf("%d * %d = %d\n", num1, num2, resultado );

        //SCANNER

        Scanner escaner = new Scanner(System.in);

        System.out.print("Por favor, introduzca el primer número: \n");
        int num3 = escaner.nextInt();
        System.out.print("Introduzca el segundo número: \n");
        int num4 = escaner.nextInt();

        int resultado2 = num3 * num4;

        System.out.printf("%d * %d = %d", num3, num4, resultado2 );

        escaner.close();

    }
}