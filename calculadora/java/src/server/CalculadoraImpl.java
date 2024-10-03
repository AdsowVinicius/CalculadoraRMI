package src.server;

import src.common.ICalculadora;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImpl extends UnicastRemoteObject implements ICalculadora {

    protected CalculadoraImpl() throws RemoteException {
        super();
    }

    @Override
    public double executarOperacao(String operacao, double a, double b) throws RemoteException {
        Operacao operacaoObj = OperacaoFactory.getOperacao(operacao);
        return operacaoObj.calcular(a, b);
    }

    @Override
    public double avaliarExpressao(String expressao) throws RemoteException {
        InterpretadorDeExpressoes interpretador = new InterpretadorDeExpressoes();
        return interpretador.avaliar(expressao);
    }
}
