public class Entrada {

    int edadClase = 30;

    // variables

    // datos que yo quiero guardar para reutilizar en algun momento

    // metodos

    // funcionalidades
    // NO PUEDO PONER EJECUCIONES FUERA
    /*
    tantas
    lineas
    como
    quiera
     */

    /*
     * documentacion con JavaDOC
     * */

    // TODO tengo que declarar la variable que no me funciona
    public static void main(String[] args) {
        // ejecuciones
        // tipo nombre = VALOR?
        // el nombre de las variables. empieza en minuscula, representativo
        // SEGUN LO QUE GUARDA -> int, char, String, boolean, float, double
        // NUMEROS
        // sin decimales -> byte, short, int, long

        int edad;
        edad = 50;

        // con decimales -> float, double
        float altura = 1.74f;
        double salario = 209876.87;

        // LETRA
        char letra = 'a'; // PRIMITIVA

        // PALABRA
        String palabra = "Borja"; // COMPLEJA

        // BOOLEAN -> true o false
        boolean acierto = false; // true -> PRIMITIVA

        // CUALQUIER COSA
        Object cosa = "asdasd"; // COMPLEJA

        palabra = "otro valor";
        edad = 65;
        altura = 2.56f; // Si declaro float pongo f al final del numero.
        acierto = true;

        // SEGUN LA CONSTRUCCION DEL VALOR -> primitivas / complejas
        // primitivas (empieza con minuscula el tipo) /
        // complejas (el tipo empieza con mayusculas)

        // SEGUN SI PUEDO CAMBIAR SU VALOR O NO. mutables - no mutables ó CONSTANTES
        final String DNI = "0987654321A";
        
        // SEGUN SU AMBITO -> donde puede ser accedida la variable -> de clase o de bloque

        String nombre="Miguel";
        edad = edad +1;
        altura = 1.904567f;
        salario = 345678.6543;

        // Hola mi nombre es miguel, tengo 36 años y mido 1.90
        System.out.println("Hola mi nombre es "+nombre+", tengo "+edad+" años y mido "+altura);// salto de linea
        System.out.println("Esta es la siguiente linea");
        // String -> %s
        // int -> %d
        // float, double -> %.2f
        // boolean -> %b
        // char -> %c
        System.out.printf("Hola mi nombre es %s, tengo %d años y mido %.2f cm, mi salario es %.4f\n",nombre,edad,altura
                ,salario);
        System.out.println("Esta es la siguiente linea");
    }
        // ejecuciones
        // tipo nombre = VALOR?
        // el nombre de las variables.empieza en minuscula, representativo
    // SEGUN LO QUE GUARDA -> int, char, String, boolean, float, double
        // NUMEROS
        // sin decimales -> byte, short, int, long
    int edad = 36;
    // con decimales -> float, double
    float altura = 1.75f;
    double salario = 209876.87;

    // LETRA
    char letra = 'a';

    // PALABRA
    String palabra = "miguel";

    // BOOLEAN
    boolean acierto = false; // true

    // Cualquier cosa
    Object cosa = "asdasd";




    public void metodoUno(){
        edadClase = 60;
    }

    public void metodoDos(){
        edadClase = 70;
    }

}
