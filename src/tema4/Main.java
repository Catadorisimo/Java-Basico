package tema4;

public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("OnePlus","9t","Negro",8,"Oxigen");
        SmartWatch watch = new SmartWatch("AppleWatch","3","Blanco", "Cuadrado");

        phone.encender();
        System.out.println(phone);

        watch.encender();
        System.out.println(watch);


        phone.apagar();
        watch.apagar();
    }
}
