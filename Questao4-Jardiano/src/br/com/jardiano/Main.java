package br.com.jardiano;

import br.com.jardiano.model.Conta;

public class Main {

    public static void main(String[] args) {
        // criando a conta
        Conta minhaConta = new Conta("Jardiano",1, "250-x", 12000.00, "14/05/2020");
        Conta meuSonho = new Conta("Jardiano II",1, "250-x", 12000000000.00, "14/05/2020");

        meuSonho.transfere(minhaConta, 1000.0);

        System.out.println(minhaConta.toString());
        System.out.println(meuSonho.toString());
    }
}
