package tema4;

public class SmartWatch extends SmartDevice{

    private String diseño;

    public SmartWatch(){
        super();
    }

    public SmartWatch(String marca, String modelo, String color, String diseño){
        super(marca, modelo, color);
        this.diseño = diseño;
    }

    public String getDiseño() {
        return diseño;
    }

    public void setDiseño(String diseño) {
        this.diseño = diseño;
    }

    @Override
    public String toString() {
            return "SmartWatch: \n" +
                    "marca=" + this.getMarca() + '\n' +
                    "modelo=" + this.getModelo() + '\n' +
                    "color=" + this.getColor() + '\n' +
                    "diseño=" + diseño + '\n';
    }
}

