package br.com.jardiano;

import br.com.jardiano.model.ContaCorrente;
import br.com.jardiano.model.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        // criando a conta
        ContaCorrente minhaConta = new ContaCorrente(1, "250-x", 1200.00, "14/05/2020", "Jardiano", 200.0, 1200.0);
        ContaPoupanca meuSonho  = new ContaPoupanca(1, "250-x", 1200.00, "14/05/2020", "Jardiano II", 200.0, 1000.0);

        System.out.println(minhaConta.toString());
        System.out.println(meuSonho.toString());

/*      Para efetuar o saque o valor não pode ser negativo ou igual a zero, também não pode ser maior que o saldo da conta.
        Para efetuar o deposito, o valor solicitado não pode ser negavito ou igual a zero.
        Para efetuar a transferencia, o valor solicitado não pode ser negativo ou igual a zero, alem de não ser maior que o saldo da conta que irá fazer a transferência, além que uma conta não pode transferir para a conta de origem.*/
    }
}
