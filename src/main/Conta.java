import org.junit.Test;

public class Conta {
    // Qual o problema ? Criar um sistema de software que efetue as operaçõees entre contas bancarias
    // Quais são os dados necessários ? Sacar, depositar
    // Quais as operações necessárias ? Sacar (valor a sacar, saldo na conta, quem é o cliente) e depositar (valor a depositar, conta destino)

    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
    }

    public Conta(int numero, double saldoInicial) {
        this.numero = numero;
        //this.saldo = saldoInicial;
        this.depositar(saldoInicial);
    }

    public boolean sacar(double valorASacar) {
        if (this.saldo >= valorASacar) {
            this.saldo = this.saldo - valorASacar;
            return true;
        }
        return false;
    }

    public void depositar(double valorADepositar) {
        this.saldo = this.saldo + valorADepositar;
        System.out.println("Novo saldo: " + this.saldo);
    }

    public boolean transferir(Conta contaDestino, double valorATransferir) {
        boolean foiPossivelSacar = this.sacar(valorATransferir);
        if (foiPossivelSacar) {
            contaDestino.depositar(valorATransferir);
            return true;
        }
            return false;
        }


    public int getNumero(){
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
