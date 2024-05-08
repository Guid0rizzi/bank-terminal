

public class ContaTerminal {

    int numero;
    String agencia;
    String nomeCliente;
    double saldo = 25.00;



    public ContaTerminal(int numero, String agencia, String nomeCliente){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo já está disponível para saque.");

    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }


}
