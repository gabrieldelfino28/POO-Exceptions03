package controller;

public class OperacaoController {

    public int operacaoValor(int num) {
        if (num < 0) {
            throw new ArithmeticException("Valor não pode ser negativo.");
        }
        if (num % 2 == 0) {
            return num * num;
        } else {
            return num * num * num;
        }
    }
}
