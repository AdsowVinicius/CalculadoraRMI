package src.server;

public class RaizQuadrada extends Operacao {
    @Override
    public double calcular(double a, double b) {
        return Math.sqrt(a); // Ignora o segundo valor
    }
}

