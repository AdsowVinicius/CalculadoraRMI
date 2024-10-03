package src.server;

public class OperacaoFactory {
    public static Operacao getOperacao(String operacao) {
        switch (operacao.toLowerCase()) {
            case "soma":
                return new Soma();
            case "subtracao":
                return new Subtracao();
            case "multiplicacao":
                return new Multiplicacao();
            case "divisao":
                return new Divisao();
            case "potencia":
                return new Potencia();
            case "raizquadrada":
                return new RaizQuadrada();
            default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);
        }
    }
}