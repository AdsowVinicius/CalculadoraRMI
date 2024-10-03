package src.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculadora extends Remote {
    double executarOperacao(String operacao, double a, double b) throws RemoteException;
    double avaliarExpressao(String expressao) throws RemoteException;
}
