package view;

import controller.OperacaoController;

public class Main {

    public static void main(String[] args) {

        OperacaoController oc1 = new OperacaoController();
        try {
            System.out.println(oc1.operacaoValor(10));
            System.out.println(oc1.operacaoValor(5));
            System.out.println(oc1.operacaoValor(0));
            System.out.println(oc1.operacaoValor(-5));
        }catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}
