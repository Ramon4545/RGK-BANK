import java.util.Scanner;

public class RGK{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero de sua conta: ");
        String conta = scanner.nextLine();
        System.out.print("Digite o saldo: ");
        Double saldo = scanner.nextDouble();


    
        System.out.println("\nN° conta: " + conta);
        System.out.println("Saldo: R$" + saldo + "\n");
        System.out.println("""
        ===== RGK BANKS =====
            1 - Consultar saldo
            2 - Depositar
            3 - Sacar
            4 - Sair
        ======================
        """);

        int resposta = scanner.nextInt();

        if(resposta == 1){
            System.out.println("===== RGK BANKS =====");
            System.out.println("Saldo: " + saldo);
            System.out.println("=====================" );
        } else if (resposta == 2){
             System.out.println("===== RGK BANKS =====");
             System.out.print("insira o valor de deposito: ");
             Double deposito = scanner.nextDouble();
             saldo += deposito;
             System.out.println("Seu saldo atualizado: " + saldo);
             System.out.println("=====================" );
        } else if (resposta == 3){
             System.out.println("===== RGK BANKS =====");
             System.out.print("insira o valor de saque: ");
             Double saque = scanner.nextDouble();
             saldo -= saque;
             System.out.println("Seu saldo atualizado: " + saldo);
             System.out.println("=====================" );
        }
    }
}