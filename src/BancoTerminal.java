

public class BancoTerminal {
public void sacar(ContaTerminal conta, double valorSolicitado ){
    double saldo = conta.getSaldo();
    if (valorSolicitado > 0 && valorSolicitado <= saldo){
        saldo -= valorSolicitado;
        conta.setSaldo(saldo);
        System.out.println("O seu saque de "+valorSolicitado+ " foi feito com sucesso");
    }else{
        System.out.println("Não é possivel o saque com esse valor solicitado");
    }

}

public void depositar(ContaTerminal conta, double valorSolicitado ){
    double saldo = conta.getSaldo();
    if (valorSolicitado > 0){
        saldo += valorSolicitado;
        conta.setSaldo(saldo);
        System.out.println("O seu saque de "+valorSolicitado+" foi feito com sucesso");
    }else{
        System.out.println("Não é possivel o saque com esse valor solicitado");
    }

}





}
