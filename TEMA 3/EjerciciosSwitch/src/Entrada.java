import java.util.Scanner;

public class Entrada {

        static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //ejercicioUno();
        //ejercicioDos();
        ejercicioTres();










    }
        // Escribe un programa en Java que solicite al usuario ingresar un número del 1 al 7 y muestre el día de la semana correspondiente utilizando una sentencia switch.
        public static void ejercicioUno(){
            System.out.println(" Ingrese un numero del 1 al 7: ");
            int dia = teclado.nextInt();
            switch(dia){
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("El numero introducido no es valido");
            }
        }

        // Crea un programa que permita al usuario ingresar un carácter y luego determine si es una vocal o una consonante utilizando una sentencia switch.
    public static void ejercicioDos(){
        System.out.println("Ingrese un caracter: ");
        char caracter = teclado.next().charAt(0);
        switch(caracter){
            case 'a','e','i','o','u':
                System.out.println("El caracter ingresado es una vocal");
                break;
            default:
                System.out.println("El caracter ingresado es una consonante");
        }
    }

    // Desarrolla un programa que reciba un número entero y, utilizando una sentencia switch, determine si es par o impar.
    public static void ejercicioTres(){
        System.out.println("Ingrese un numero: ");
        int num = teclado.nextInt();
        switch(num%2){
            case 0:
                System.out.println("El numero ingresado es par");
                break;
            default:
                System.out.println("El numero ingresado es impar");
        }
    }

    // Realiza un programa que solicite al usuario ingresar un mes (como un número del 1 al 12) y
    // muestre la cantidad de días que tiene ese mes, considerando años no bisiestos.
    public static void ejercicioCuatro(){
        System.out.println("Ingrese un numero del 1 al 12: ");
        int mes = teclado.nextInt();
        if(mes==2){

        }
        switch (mes){
            case 1:
                System.out.println("Enero tiene 31 dias");
                break;
            case 2:
                System.out.println("Febreo tiene 28 dias");
                break;
            case 3:
                System.out.println("Marzo tiene 31 dias");
                break;
            case 4:
                System.out.println("Abril tiene 30 dias");
                break;
            case 5:
                System.out.println("Mayo tiene 31 dias");
                break;
            case 6:
                System.out.println("Junio tiene 30 dias");
                break;
            case 7:
                System.out.println("Julio tiene 31 dias");
                break;
            case 8:
                System.out.println("Agosto tiene 31 dias");
                break;
            case 9:
                System.out.println("Septimbre tiene 30 dias");
                break;
            case 10:
                System.out.println("Octubre tiene 31 dias");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 dias");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 dias");
                break;
        }


    }
}
