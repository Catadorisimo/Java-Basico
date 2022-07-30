package tema4;

public abstract class  SmartDevice {
    private String marca;
    private String modelo;
    private String color;

    public SmartDevice (){}

    public SmartDevice (String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void encender(){
        System.out.println("Encendido dispositivo");
    }

    public void apagar(){
        System.out.println("Apagando dispositivo");
    }

    @Override
    public String toString() {
        return "SmartDevice: \n" +
                "marca=" + marca + '\n' +
                "modelo=" + modelo + '\n' +
                "color=" + color;
    }


}
