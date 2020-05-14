package br.com.jardiano;

import br.com.jardiano.model.Conta;

public class Main {

    public static void main(String[] args) {
        // criando a conta
        Conta minhaConta = new Conta("Jardiano",1, "250-x", 12000.00, "14/05/2020");

        // saca 200 reais
        minhaConta.saca(200);

        // deposita 500 reais
        minhaConta.deposita(500);
        System.out.println(minhaConta.getSaldo());
    }
}
