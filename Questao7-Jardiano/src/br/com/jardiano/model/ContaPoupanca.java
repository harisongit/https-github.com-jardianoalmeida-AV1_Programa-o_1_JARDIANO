package br.com.jardiano.model;

public class ContaPoupanca extends Conta {

    private double porcentagemRendimento;
    private int diaRedimento;

    public ContaPoupanca(int numero, String agencia, Double saldo, String abertura, String nome, double porcentagemRendimento, int diaRedimento) {
        super(nome, numero, agencia, saldo, abertura);
        this.porcentagemRendimento = porcentagemRendimento;
        this.diaRedimento = diaRedimento;
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
        return "ContaPoupanca{" +
                "porcentagemRendimento=" + porcentagemRendimento +
                ", diaRedimento=" + diaRedimento +
                ", agencia='" + agencia + '\'' +
                '}';
    }
}