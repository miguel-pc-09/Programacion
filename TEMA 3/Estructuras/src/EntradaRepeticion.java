import java.util.Scanner;

public class EntradaRepeticion {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // estructuraFor();

        //

        //

        //
    }

    public static void estructuraFor(){
        //[i=0, i=4] // 0,1,2,3,4,5xxxxx
        // introduce 10numeros por teclado y sca el sumatorio de todos ellos
        // saca la media de los numeros introducidos son pares
        /*int numeroPares=0;
        int sumatorio = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <10; i++){
            System.out.println("Introduce numero");
            int numero = scanner.nextInt();
            sumatorio += numero;
            if (numero % 2 == 0){
                numeroPares++;
              }
          }

          System.out.println("La suma de todos los numeros es: " + sumatorio);
        System.out.println("El numero medio es: " + (double) sumatorio / 10);
        System.out.println("El numero de pares es: "+numeroPares);
         */

        // tabla de multiplicar del 8
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.printf("%d * %d = %d\n",j,i,j*i);
            }
        }

        System.out.println("Introduce el numero con el que juegas");
        int numero = scanner.nextInt();
        for (int i = 0; i < 5; i++) {

        }

    }
}
