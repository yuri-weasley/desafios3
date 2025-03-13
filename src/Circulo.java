public class Circulo implements Forma {
    double r;
    @Override
    public double calcularArea() {
        return Math.PI * r * r;
    }
}
