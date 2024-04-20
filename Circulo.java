public class Circulo {
    Plano centro;
    int radio;
    public Circulo(int x, int y, int radio) {
        centro = new Plano(x, y);
        this.radio = radio;
    }
    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    void imprimir(){
        System.out.println("El centro del circulo es la coordenada ("+centro.getX()+","+centro.getY()+") y tiene un radio de "+radio);
    }
    
    
}
