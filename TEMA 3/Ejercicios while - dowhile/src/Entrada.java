import java.util.Scanner;

public class Entrada {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //ejercicioUno();
        //ejercicioDos();
        //ejercicioTres();
        ejercicioCuatro();

    }

    // Ejercicio 1: Leer números enteros hasta introducir un 0. El programa obtendrá la suma de todos
    //los números positivos. (SumarPositivos)
    public static void ejercicioUno(){
        int numero = 0;
        int suma = 0;

        System.out.print("Introduce un número entero (0 para salir): ");
        numero = teclado.nextInt();
        while (numero != 0) {
            if (numero > 0) {
                suma += numero;
            }
            System.out.print("Introduce un número entero (0 para salir): ");
            numero = teclado.nextInt();
        }
        System.out.println("La suma de los números positivos es: " + suma);
    /* CON DO WHILE
        * int numero;
        int suma = 0;

        do {
            System.out.print("Introduce un número entero (0 para salir): ");
            numero = sc.nextInt();

            if (numero > 0) {
                suma += numero;
            }
        } while (numero != 0);

        System.out.println("La suma de los números positivos es: " + suma);
    }
        * */


    }


    //Ejercicio 2: Calcúlese el mínimo común múltiplo de dos números entre 1 y 100. Para obtener el mcm se tomará uno
    // de los valores introducidos y se irá multiplicando por 1, 2, 3, etc, hasta que el valor obtenido sea múltiplo
    // del otro número, que sería el valor buscado. (MinimoComunMultiplo)
    public static void ejercicioDos(){
        int num1, num2, mcm = 0;
        boolean encontrado = false;

        System.out.print("Introduce el primer número (entre 1 y 100): ");
        num1 = teclado.nextInt();
        System.out.print("Introduce el segundo número (entre 1 y 100): ");
        num2 = teclado.nextInt();

        if (num1 < 1 || num1 > 100 || num2 < 1 || num2 > 100) {
            System.out.println("Los números deben estar entre 1 y 100.");
            return;
        }

        mcm = num1;

        while (!encontrado) {
            if (mcm % num2 == 0) {
                encontrado = true;
            } else {
                mcm += num1;
            }
        }

        System.out.println("El mínimo común múltiplo de " + num1 + " y " + num2 + " es: " + mcm);
    }

    // Ejercicio 3: Generar números enteros aleatorios entre 0 y 100 hasta obtener el 0. El programa mostrará cada
    // uno de los datos generados y obtendrá el mayor de los números generados. (MayorNumero)
    public static void ejercicioTres(){
        int numero;
        int mayor = 0;
        int contador=0;

        do {
            numero = (int) (Math.random() * 101);
            // Contador para los numeros generados
            contador ++ ;

            System.out.println("Número generado: " + numero);
            if (numero > mayor) {
                mayor = numero;
            }
        } while (numero != 0);

        System.out.println("El mayor número generado es: " + mayor);
        System.out.println("Numeros generados: "+contador);
    }

    // Ejercicio 4: Introducir un entero no negativo, y convertirlo a binario, octal y hexadecimal. (BinarioOctalHexadecimal)
    public static void ejercicioCuatro(){
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();
        do {
            System.out.print("Introduce un número entero NO negativo: ");
            numero = teclado.nextInt();
            if (numero < 0) {
                System.out.println("❌ El número no puede ser negativo. Inténtalo de nuevo.");
            }
        } while (numero < 0);

        // Conversión
        String binario = Integer.toBinaryString(numero);
        String octal = Integer.toOctalString(numero);
        String hexadecimal = Integer.toHexString(numero).toUpperCase();

        // Resultado
        System.out.println("\nRepresentaciones:");
        System.out.println("🔹 Binario: " + binario);
        System.out.println("🔹 Octal: " + octal);
        System.out.println("🔹 Hexadecimal: " + hexadecimal);
    }

    /* Ejercicio 5: Crea un programa que genere un número aleatorio (entre 0 y 20) de entrada y lo guarde en una
    // variable. El sistema irá pidiendo números al usuario hasta que coincida con el aleatorio generado
    // (en caso de no coincidir mostrará el mensaje "Lo siento, intentalo de nuevo"). Cuando coincida el sistema
    // deberá mostar el mensaje "Enhorabuena, has acertado el número en 5 intentos" (Adivina)*/
    public static void ejercicioCinco(){}

    /*Ejercicio 6: Modifica el ejercicio anterior para que una vez adivinado el número el sistema muestre el
    siguiente mensaje: "Quieres volver a jugar (S/N)":
    - En caso de introducir N la aplicación se detendrá
    - En caso de introducir S la aplicación empezará de nuevo (generando un aleatorio, pidiendo números hasta
       acertar el generado, etc...) Cuando el usuario acierte el número generado se mostrará un mensaje diciendo
        si ha superado el record de intentos (si ha hecho menos intentos que las veces anteriores) (AdivinaRecord)
    *
    * */
    public static void ejercicioSeis(){}

    /* Ejercicio 7: Realizar un menú de 4 opciones, donde se mostrará por pantalla el siguiente formato
    - Bienvenido a la aplicación del menú - 1. Opción1 - 2. Opción2 - 3. Opción3 - 4. Opción4 - 5. Salir - Introduce la opción seleccionada
Una vez mostrado la última línea, el sistema esperará a que el usuario introduzca un dato. Dependiendo de la opción
 seleccionada aparecerá un mensaje por pantalla que ponga "La opción seleccionada es X".
 En el caso de meter una diferente pondrá "opción no contemplada". El programa se repetiría hasta que introduzca el 5 (MenuSimple)
    * */
    public static void ejercicioSiete(){}

    /*Ejercicio 8: Modifica el ejercicio anterior para hacer una calculadora. Nada más ejecutar se mostrarán
    las opciones disponibles - Bienvenido a la aplicación de calculos - Introduce operando uno: - Introduce operando
    dos: - 1. Sumar - 2. Restar - 3. Multiplicar - 4. Dividir - 5. Módulo - 6. Salir - Selecciona la operacion que quieres realizar.
Al seleccionar una de las opciones el sistema realizará la operación correspondiente y mostrará el resultado por
pantalla de la siguiente forma "El resultado de la operación es:". Una vez terminada la operación volverá a mostrar el
 menú y pedir dos números nuevos. (MenuCalculo)
    * */
    public static void ejercicioOcho(){}

    //Ejercicio 9:3. Modifica el ejercicio 9 para hacer una calculadora de cambios de base. Nada más ejecutar se
    // mostrarán las opciones disponibles - Bienvenido a la aplicación de cambios de base
    //    - Introduce el número que quieres cambiar de base:
    //    - Pasar a base2
    //    - Pasar a base8
    //    - Pasar a base16
    //    - Salir
    //    - Selecciona la base a la que quieres pasar
    //
    //Al introducir un número el sistema comprobará que es mayor que 0. En caso de no serlo mostrará el mensaje
    // "No válido, introduce otro", esperando una nueva introducción de datos. Una vez introducido, al seleccionar
    // una de las opciones el sistema realizará la conversión correspondiente y mostrará el resultado por pantalla de
    // la siguiente forma "El número XX en base10 es igual que XX en baseXX". Una vez terminada la operación volverá a
    // mostrar el menú y pedir un número. (MenuBases)
    public static void ejercicioNueve(){}

}
