package br.com.jardiano.model;

public class ContaCorrente extends Conta {

    private double taxaAdministracao;
    private double limite;

    public ContaCorrente(int numero, String agencia, double saldo, String abertura, String nome, double taxaAdministracao, Double limite) {
        super(nome, numero, agencia, saldo, abertura);
        this.taxaAdministracao = taxaAdministracao;
        this.limite = limite;
    }

    @Override
    public void saca(double quantidade) {
        double novoSaldo = this.getSaldo() - quantidade;
        this.setSaldo(novoSaldo);
    }

    @Override
    public void deposita(double quantidade) {
        this.setSaldo(this.getSaldo() + quantidade);
    }

    @Override
    public void transfere(Conta destino, double valor) {
        if (valor < 0 || valor > this.getSaldo()) {
            System.out.println("Impossivel transferir");
        } else {
            this.setSaldo(this.getSaldo() - valor);
            destino.setSaldo(destino.getSaldo() + valor);
        }
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "taxaAdministracao=" + taxaAdministracao +
                ", limite=" + limite +
                ", agencia='" + agencia + '\'' +
                '}';
    }
}
