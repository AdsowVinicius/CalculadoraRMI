package src.server;

public class Potencia extends Operacao {
    @Override
    public double calcular(double a, double b) {
        return Math.pow(a, b);
    }
}