package br.com.jardiano;

import br.com.jardiano.model.ContaCorrente;
import br.com.jardiano.model.ContaPoupanca;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ContaCorrente> contasCorrente = new ArrayList<>();
        List<ContaPoupanca> contasPoupanca = new ArrayList<>();

        String menuPrincipal = "Escolha uma opção abaixo: \n" +
                "1 - Adicionar uma conta corrente. \n" +
                "2 - Adiconar uma conta poupanca \n" +
                "3 - Listar contas cadastradas. \n" +
                "4 - Depositar dinheiro \n" +
                "5 - Sacar dinheiro \n" +
                "6 - Transferência de dinheiro. \n" +
                "7 - Encerrar o programa.";
        String value = JOptionPane.showInputDialog(null, menuPrincipal, "Menu principal", 3);

        if (value == null || value.isEmpty()) {
            throw new NullPointerException();
        }
        int auxValor = (int) Double.parseDouble(value);
        try {
            if (auxValor == 1){
                ContaCorrente minhaConta = new ContaCorrente(1, "250-x", 1200.00, "14/05/2020", "Jardiano", 200.0, 1200.0);
                System.out.println(minhaConta.toString());
                contasCorrente.add(minhaConta);
            } else if (auxValor == 2){
                ContaPoupanca meuSonho = new ContaPoupanca(1, "250-x", 1200.00, "14/05/2020", "Jardiano II", 200.0, 1000);
                System.out.println(meuSonho.toString());
                contasPoupanca.add(meuSonho);
            } else if (auxValor == 3){
                String corrente = contasCorrente.toString().replace("[", "").replace("]", "").replace(", ", "");
                String polpanca = contasPoupanca.toString().replace("[", "").replace("]", "").replace(", ", "");
                System.out.println(corrente);
                System.out.println(polpanca);
            } else if (auxValor == 4){
                ContaCorrente minhaConta = new ContaCorrente(1, "250-x", 1200.00, "14/05/2020", "Jardiano", 200.0, 1200.0);
                minhaConta.deposita(3000);
                System.out.println(minhaConta.toString());
            } else if (auxValor == 5){
                ContaCorrente minhaConta = new ContaCorrente(1, "250-x", 1200.00, "14/05/2020", "Jardiano", 200.0, 1200.0);
                minhaConta.saca(3000.00);
                System.out.println(minhaConta.toString());
            }  else if (auxValor == 6){
                ContaCorrente minhaConta = new ContaCorrente(1, "250-x", 1200.00, "14/05/2020", "Jardiano", 200.0, 1200.0);
                minhaConta.saca(3000.00);
                ContaPoupanca meuSonho = new ContaPoupanca(1, "250-x", 1200.00, "14/05/2020", "Jardiano II", 200.0, 1000);
                meuSonho.transfere(minhaConta, 300.0);
                System.out.println(meuSonho.toString());
                System.out.println(minhaConta.toString());
            } else {
                return;
            }

            JOptionPane.showMessageDialog(null, "Entrada inválida.", "Alerta", 2);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Entrada inválida.", "Alerta", 2);
        }
    }
}
