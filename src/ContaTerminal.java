import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){ 

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome!");
        String nome = scanner.next();

        System.out.println("Por favor, digite o numero da sua conta!");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite quanto deseja depositar em sua conta!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já esta disponível para saque.");        
    }
}