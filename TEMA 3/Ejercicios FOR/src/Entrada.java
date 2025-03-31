import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        //ejercicioUno();
        //ejercicioDos();
        //ejercicioTres();
        // ejercicioCuatro();
        // ejercicioCinco();
        // ejercicioSeis();
        //ejercicioSiete();
        // ejercicioOcho();
        // ejercicioNueve();
        ejercicioDiez();





        }
        static Scanner teclado = new Scanner(System.in);
        // Ejercicio 1: Se leerá el número de temperaturas a introducir (de ser 0 o negativo se establecerá a 10).
        // Obténgase la media con dos decimales de las temperaturas introducidas por consola. (TemperaturasIntroducidas)
        public static void ejercicioUno(){
            System.out.print("Introduce la temperatura: ");
            double temperatura = 0f;
            temperatura = teclado.nextFloat();
            System.out.println("Introduce una segunda temperatura: ");
            double temperatura2 = teclado.nextFloat();
            double media = 0;
            for (int i = 0; i < temperatura; i++) {
                if(temperatura<=0){
                    System.out.println("La temperatura no puede ser negativa");
                    temperatura = 10f;
                    break;
                }
                if(temperatura>=0){
                    System.out.println("Temperatura aceptada: ");
                    System.out.println(temperatura);
                    break;
                }
            }
                if(temperatura>=10 && temperatura2>=10 ){
                    media = (temperatura+temperatura2)/2;
                }
            System.out.println("La media de las temperaturas introducidas es: "+media);
    }

    // Ejercicio 2: Leer un número entre 0 y 10. Se mostrará la tabla de multiplicar de dicho número con el formato:
    // 5 x 3 = 15 (desde 0 hasta 10 en líneas distintas). (TablaDeMultiplicar)
    public static void ejercicioDos(){
        System.out.println("Bienvenido a las tablas de multipolicar.");
        System.out.println("¿Que tabla de multiplicar quieres ver?");
        int tabla = teclado.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(tabla+" x "+(i+1)+" = "+(tabla*i));
        }
    }

    // Ejercicio 3: Modificar el ejercicio anterior para calcular la tabla de multiplicar de todos los números (TablaTodos)
    public static void ejercicioTres(){
            for(int i = 0; i<11;i++){
                for(int j = 0; j<11; j++){
                System.out.printf("%d x %d = %d\n",j,i,j*i);

                }
            }
    }

    // Ejercicio 4: Modificar el ejercicio anterior para calcular la tabla de multiplicar de los números comprendidos
    // en un rango de números pedidos. Por ejemplo, las tablas de los números comprendidos entre el 3 y el 7 (3,4,5,6,7
    public static void ejercicioCuatro(){
        System.out.print("Indica tu primero numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduce tu segundo numero: ");
        int num2 = teclado.nextInt();
        for(int i = num1; i<=num2;i++){
            for(int j = 0; j<11; j++){
                System.out.printf("%d x %d = %d\n",j,i,j*i);
            }
        }
    }

    // Ejercicio 5: Dado dos enteros entre 0 y 5 (la base y el exponente), obtener la potencia del primero elevado al
    // segundo sin utilizar el método “pow”. Por ejemplo, base = 3 y exponente = 5, 35=3x3x3x3x3=243. Casos
    //  particulares: 00 = Error y n0 = 1.(BaseExponente)
    public static void ejercicioCinco(){
        System.out.println("Introduce la base: ");
        int base = teclado.nextInt();
        System.out.println("Introduce el exponente: ");
        int exponente = teclado.nextInt();
        int resultad = base^exponente;
        for(int i = base; i<=exponente;i++){
            System.out.printf(resultad+"=");
        }
    }

    // Ejercicio 6: Mostrar todos los números pares comprendidos entre dos dados. (ParesEntreDosDados)
    public static void ejercicioSeis(){
        System.out.println("Introduce el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int num2 = teclado.nextInt();
        for(int i = num1; i<=num2;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

    // Ejercicio 7: Simúlese el lanzamiento de un dado. Se introducirá el número de veces que se lanza el dado
    // (de no ser positivo, se establecerá a 100). (Dado)
    public static void ejercicioSiete(){
        System.out.println("Introduce el numero de veces que quieres lanzar el dado: ");
        int lanzamientos = teclado.nextInt();
        for(int i = 0; i<lanzamientos;i++){
            if(lanzamientos<=0){
                lanzamientos = 100;
                System.out.println("El numero de lanzamientos no puede ser negativo");
                break;
            }
            int dado = (int)(Math.random()*6+1);
            System.out.println("El resultado del lanzamiento es: "+dado);
        }
    }

    // Ejercicio 8: Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos
    // y la cantidad de ceros (NumerosTipos)
    public static void ejercicioOcho(){
        System.out.println("Introduce 10 numeros: ");
        int num = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int ceros = 0;
        for(int i = 0; i<10;i++){
            num = teclado.nextInt();
            if(num%2==0){
                sumaPositivos ++;
                System.out.println("El numero de pares es: "+sumaPositivos);
            }else if(num%2!=0){
                sumaNegativos ++;
                System.out.println("El numero de impares es: "+sumaNegativos);
            }else{
                ceros++;
                System.out.println("El numero de ceros es: "+ceros);
            }
        }
            System.out.println("Numeros pares totales: "+sumaPositivos);
            System.out.println("Numeros impares totales: "+sumaNegativos);
            System.out.println("Numero de ceros totaltes: "+ceros);
    }

    // Ejercicio 9: Pedir 10 sueldos. Mostrar su suma, media y cuantos hay mayores de 1000€.(Sueldos)
    public static void ejercicioNueve(){
        System.out.println("Introduce 10 sueldos: ");
        double sueldo= 0f;
        double sumaSueldos = 0f;
        double mediaSueldos = 0f;
        int sueldosMayores = 0;
        for(int i = 0; i<10;i++){
            sueldo = teclado.nextDouble();
            sumaSueldos += sueldo;

            if(sueldo>1000){
                sueldosMayores++;

            }

        }
        System.out.println("la suma de los sueldos es: "+sumaSueldos);
        System.out.println("El numero de sueldos mayores a 1000 es: "+sueldosMayores);
        System.out.println("La media de los sueldos es: "+(sumaSueldos/10));
    }

    // Ejercicio 10: Introduce  6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y
    // suspensos.(NotasTipos)
    public static void ejercicioDiez(){
        System.out.println("Introduce notas (6max): ");
        int nota = 0;
        int aprobados =0;
        int codnicionados = 0;
        int suspensos = 0;
        for(int i = 0; i < 6; i++){
        nota = teclado.nextInt();
            if(nota>5 && nota<=10){
                System.out.println("El alumno ha aprobado");
                aprobados++;
            } else if (nota>=4 && nota<=5) {
                System.out.println("El alumno esta condicionado");
                codnicionados++;
            } else if (nota<4 && nota>=0) {
                System.out.println("El alumno ha suspendido");
                suspensos++;

            }
        }
        System.out.println("Numero de alumnos aprobados: "+aprobados);
        System.out.println("Numero de alumnos condicionados: "+codnicionados);
        System.out.println("Numero de alumnos suspendidos: "+suspensos);
    }

    // Ejercicio 11: 

}
