package src.client;

import src.common.ICalculadora;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            ICalculadora calculadora = (ICalculadora) registry.lookup("CalculadoraService");

            Scanner scanner = new Scanner(System.in);
            int opcao;

            do {
                System.out.println("Escolha uma operação:");
                System.out.println("1. Soma");
                System.out.println("2. Subtração");
                System.out.println("3. Multiplicação");
                System.out.println("4. Divisão");
                System.out.println("5. Potência");
                System.out.println("6. Raiz Quadrada");
                System.out.println("7. Avaliar Expressão");
                System.out.println("8. Sair");
                opcao = scanner.nextInt();

                double a, b;
                String operacao = "";
                switch (opcao) {
                    case 1:
                        operacao = "soma";
                        System.out.print("Primeiro número: ");
                        a = scanner.nextDouble();
                        System.out.print("Segundo número: ");
                        b = scanner.nextDouble();
                        System.out.println("Resultado: " + calculadora.executarOperacao(operacao, a, b));
                        break;
                    case 2:
                        operacao = "subtracao";
                        System.out.print("Primeiro número: ");
                        a = scanner.nextDouble();
                        System.out.print("Segundo número: ");
                        b = scanner.nextDouble();
                        System.out.println("Resultado: " + calculadora.executarOperacao(operacao, a, b));
                        break;
                    case 3:
                        operacao = "multiplicacao";
                        System.out.print("Primeiro número: ");
                        a = scanner.nextDouble();
                        System.out.print("Segundo número: ");
                        b = scanner.nextDouble();
                        System.out.println("Resultado: " + calculadora.executarOperacao(operacao, a, b));
                        break;
                    case 4:
                        operacao = "divisao";
                        System.out.print("Primeiro número: ");
                        a = scanner.nextDouble();
                        System.out.print("Segundo número: ");
                        b = scanner.nextDouble();
                        System.out.println("Resultado: " + calculadora.executarOperacao(operacao, a, b));
                        break;
                    case 5:
                        operacao = "potencia";
                        System.out.print("Base: ");
                        a = scanner.nextDouble();
                        System.out.print("Expoente: ");
                        b = scanner.nextDouble();
                        System.out.println("Resultado: " + calculadora.executarOperacao(operacao, a, b));
                        break;
                    case 6:
                        operacao = "raizquadrada";
                        System.out.print("Número: ");
                        a = scanner.nextDouble();
                        System.out.println("Resultado: " + calculadora.executarOperacao(operacao, a, 0));
                        break;
                    case 7:
                        scanner.nextLine(); // Limpar buffer
                        System.out.print("Digite a expressão: ");
                        String expressao = scanner.nextLine();
                        System.out.println("Resultado: " + calculadora.avaliarExpressao(expressao));
                        break;
                    case 8:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } while (opcao != 8);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
