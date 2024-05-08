import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);



       int numero;
       String agencia, nomeCliente;

       System.out.println("Por favor, digite o numero da sua agencia(Apenas numeros inteiros)");
       numero = sc.nextInt();
       sc.nextLine();

       System.out.println("Por favor, digite a agencia");
       agencia = sc.nextLine();

       System.out.println("Por favor, digite o seu nome");
       nomeCliente = sc.nextLine();



       ContaTerminal contaTerminal = new ContaTerminal(numero, agencia, nomeCliente);
       BancoTerminal bancoTerminal = new BancoTerminal();

       boolean continuar = true;
       while (continuar) {
          System.out.println("Gostaria de ver o seu saldo antes de realizar alguma operação?");
          System.out.println("[1]Sim");
          System.out.println("[2]Não");
          int verSaldo = sc.nextInt();
          if (verSaldo == 1) {
             System.out.println("O seu saldo é " + contaTerminal.getSaldo());
          } else {
             System.out.println("Operação cancelada");
          }

          System.out.println("Gostaria de realizar alguma operação?");
          System.out.println("[1]Saque");
          System.out.println("[2]Deposito");
          System.out.println("[3]Sair");
          int escolha = sc.nextInt();
          switch (escolha) {
             case 1:
                System.out.println("Por favor digite o valor do saque");
                double valorSaque = sc.nextDouble();
                bancoTerminal.sacar(contaTerminal, valorSaque);
                break;
             case 2:
                System.out.println("Por favor digite o valor do Deposito");
                double valorDeposito = sc.nextDouble();
                bancoTerminal.depositar(contaTerminal, valorDeposito);
                break;
             case 3:
                continuar = false;
                System.out.println("Saindo do programa");
                break;
             default:
                System.out.println("Escolha inválida.");
          }
          System.out.println("O seu saldo é " + contaTerminal.getSaldo());
       }

       sc.close();
    }
}
