public class powerLifter {
    private String Nombre;
    private int edad;
    private double peso, pressBanca, sentadilla, pesoMuerto;

    public powerLifter(String Nombre, int edad, double peso, double pressBanca, double sentadilla, double pesoMuerto) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.peso = peso;
        this.pressBanca = pressBanca;
        this.sentadilla = sentadilla;
        this.pesoMuerto = pesoMuerto;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    public double getpeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPressBanca() {
        return pressBanca;
    }
    public void setPressBanca(double press_banca) {
        this.pressBanca = press_banca;
    }
    public double getSentadilla(){
        return sentadilla;
    }
    public void setSentadilla(double sentadilla) {
        this.sentadilla = sentadilla;
    }
    public double getPesoMuerto(double peso_muerto) {
        return peso_muerto;
    }
    public void setPesoMuerto(double peso_muerto){
        this.pesoMuerto = peso_muerto;
    }

    @Override
    public String toString(){
        return Nombre + "" + edad + "" + peso + "" + pressBanca + "" + sentadilla + "" + pesoMuerto;
    }
}
