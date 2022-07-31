package tema6;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        1.Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
        ejercicio1("hola");

//        2.Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        ejercicio2();

//        3.Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        ejercicio3();

//        4.Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        ejercicio4();

//        5.Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        ejercicio5();

//        6.Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        ejercicio6();

//        7.Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        ejercicio7();

//        8.Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
        try {
            dividePorCero(3);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }

//        9.Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
        ejercicio9("C:\\Users\\susog\\Desktop\\holaMundo.txt","pruebaIntelli.txt");

//        10.Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
        ejercicio10("C:\\Users\\susog\\Desktop\\id.txt","C:\\Users\\susog\\Desktop\\nombres.txt","dioses.txt");

    }

    public static void ejercicio1(String texto) {
        System.out.println();
        System.out.println("Ejercicio1");
        StringBuilder reverse = new StringBuilder();

        for (int i = (texto.length()-1); i >= 0 ; i--) {
            reverse.append(texto.charAt(i));
        }

        System.out.println(reverse);
    }

    public static void ejercicio2(){
        System.out.println();
        System.out.println("Ejercicio2");
        String[] array = {"uno", "dos", "tres", "cuatro", "cinco"};

        for (String a: array) { System.out.println(a);}

    }

    public static void ejercicio3() {
        System.out.println();
        System.out.println("Ejercicio3");

        int[][] biArray = {
                {0,1,2,3,4},
                {1,2,3,4,5},
                {2,3,4,5,6}
        };

        for (int i = 0; i < biArray.length; i++) {
            System.out.println("\nFila: " + i);
            for (int j = 0; j < biArray[i].length; j++) {
                System.out.println("Columna: " + j + "\nValor: " + biArray[i][j]);
            }
        }
    }

    public static void ejercicio4() {
        System.out.println();
        System.out.println("Ejercicio4");

        Vector<Integer> vector = new Vector<>(5);

        vector.add(0);
        vector.add(1);
        vector.add(0);
        vector.add(1);
        vector.add(0);

        System.out.println("Antes de borrar datos: " + vector);

        vector.remove(1);
        vector.remove(2); //Borra el segundo 1, inicialmente en la posición 4, que ahora esta en la posición 3, debido al desplazamiento del borrado anterior.

        System.out.println("Después de borrar datos: " + vector);

    }

    public static void ejercicio5() {
        System.out.println();
        System.out.println("Ejercicio5");
        System.out.println("El vector duplicara esta capacidad inicial utlizando de manera excesiva el uso de memoria");
    }

    public static void ejercicio6() {
        System.out.println();
        System.out.println("Ejercicio6");

        ArrayList<String> array = new ArrayList<>();
        array.add("AA");
        array.add("AB");
        array.add("AC");
        array.add("AD");

        LinkedList<Object> linked = new LinkedList<>(array);

        for (Object str:array) {
            System.out.println("Valor de ArrayList: " + str);
        }

        for (Object str:linked) {
            System.out.println("Valor de LinkedList: " + str);
        }
    }

    public static void ejercicio7() {
        System.out.println();
        System.out.println("Ejercicio7");

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            if(i%2 != 0) {
                array.add(i);
            }
        }

        for (Integer integer : array) {
            System.out.println(integer);
        }
    }

    public static void dividePorCero(int n) throws ArithmeticException{

        System.out.println();
        System.out.println("Ejercicio8");

        try {

            System.out.println(n/0);

        }catch (ArithmeticException e){
            throw new ArithmeticException();
        }
    }

    public static void ejercicio9(String fileIn, String fileOut) {
        System.out.println();
        System.out.println("Ejercicio9");

        try(InputStream in = new FileInputStream(fileIn);PrintStream out = new PrintStream(fileOut)){

                int datos = in.read();

                while(datos != -1){
                    System.out.println((char) datos);
                    out.write((char) datos);
                    datos = in.read();
                }
        }catch(FileNotFoundException e){
            System.out.println("Error, no se encontró el archivo");

        } catch (IOException e) {
            System.out.println("Error IO");
            e.printStackTrace();
        }
    }

    public static void ejercicio10(String fileIn1,String fileIn2, String fileOut){

        System.out.println();
        System.out.println("Ejercicio10");

        String ids = "";
        String nombres = "";

        ArrayList<String> idsA;
        ArrayList<String> nombresA;
        HashMap<String, String> dioses = new HashMap<>();


        try(InputStream in1 = new FileInputStream(fileIn1);
            InputStream in2 = new FileInputStream(fileIn2);
            PrintStream outF = new PrintStream(fileOut)){

            int datosId = in1.read();
            int datosNombre = in2.read();

            while(datosId != -1){

                ids += (char)datosId;

                datosId = in1.read();
            }

            while(datosNombre != -1){

                nombres += (char)datosNombre;

                datosNombre = in2.read();
            }

            idsA = new ArrayList<>(Arrays.asList(ids.split(",")));
            nombresA = new ArrayList<>(Arrays.asList(nombres.split(",")));

            if(idsA.size() == nombresA.size()){
                for(int i = 0; i < idsA.size(); i++) {
                    dioses.put(idsA.get(i), nombresA.get(i));
                }
            }

            System.out.println(dioses);

            for (Map.Entry<String, String> e: dioses.entrySet()) {
                outF.println(e.getValue() + "#" + e.getKey());
            }

        }catch(FileNotFoundException e){
            System.out.println("Error, no se encontró el archivo");

        } catch (IOException e) {
            System.out.println("Error IO");
            e.printStackTrace();
        }




    }




}
