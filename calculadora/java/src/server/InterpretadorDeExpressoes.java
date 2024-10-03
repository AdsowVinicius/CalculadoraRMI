package src.server;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class InterpretadorDeExpressoes {
    private ScriptEngine engine;

    public InterpretadorDeExpressoes() {
        ScriptEngineManager manager = new ScriptEngineManager();
        this.engine = manager.getEngineByName("JavaScript"); // Usando motor JavaScript para expressões
    }

    public double avaliar(String expressao) {
        // Substituir "^" por "Math.pow" para calcular potência e tratar sqrt()
        expressao = expressao.replace("^", "Math.pow");
        expressao = expressao.replace("sqrt", "Math.sqrt");
        try {
            Object resultado = engine.eval(expressao);
            return resultado instanceof Integer ? (Integer) resultado : (Double) resultado;
        } catch (ScriptException e) {
            System.out.println("Erro ao avaliar a expressão: " + e.getMessage());
            return 0;
        }
    }
}
