package src.server;

public class Divisao extends Operacao {
    @Override
    public double calcular(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: divisão por zero.");
        }
        return a / b;
    }
}

