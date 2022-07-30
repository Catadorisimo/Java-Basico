package tema2;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Indique su precio: ");
        int precio = sc.nextInt();
        System.out.println("Indique el IVA: ");
        float iva = sc.nextFloat();

        getIva(precio, iva);


    }

    public static void getIva(int precio, float iva){

        float precioF = (precio * (iva / 100)) + precio;

        System.out.println(precioF + " euros");
    }
}
