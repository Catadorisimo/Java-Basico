package tema4;

public class SmartPhone extends SmartDevice{
    private int ram;
    private String so;

    public SmartPhone () {
        super();
    }

    public SmartPhone (String marca, String modelo, String color, int ram, String so) {
        super(marca, modelo, color);
        this.ram = ram;
        this.so = so;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    @Override
    public String toString() {
        return "SmartPhone: \n" +
                "marca=" + this.getMarca() + '\n' +
                "modelo=" + this.getModelo() + '\n' +
                "color=" + this.getColor() + '\n' +
                "RAM=" + ram + '\n' +
                "S.O.=" + so + '\n';
    }
}
