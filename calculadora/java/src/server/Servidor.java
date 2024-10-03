package src.server;

import src.common.ICalculadora;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {
    public static void main(String[] args) {
        try {
            ICalculadora calculadora = new CalculadoraImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("CalculadoraService", calculadora);
            System.out.println("Servidor de calculadora OOP pronto!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}