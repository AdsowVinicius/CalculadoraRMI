package src.server;

import java.util.Scanner;

public class Calculadora {
    private Scanner scanner = new Scanner(System.in);
    private InterpretadorDeExpressoes interpretador = new InterpretadorDeExpressoes();

    public void menu() {
        int opcao;
        
        do {
            System.out.println("Bem-vindo à Calculadora");
            System.out.println("Escolha uma operação:");
            System.out.println("1. Expressão matemática");
            System.out.println("2. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch(opcao) {
                case 1:
                    calcularExpressao();
                    break;
                case 2:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 2);
    }

    private void calcularExpressao() {
        System.out.print("Digite a expressão (ex: 2 + 2 * 3, sqrt(9), 2^3): ");
        String expressao = scanner.nextLine();
        double resultado = interpretador.avaliar(expressao);
        System.out.println("Resultado: " + resultado);
    }
}
