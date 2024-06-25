import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Scanner para leitura de dados do terminal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // Aqui vai lê o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        
        // vai lê o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        scanner.nextLine();  // Limpa o buffer do scanner
        String agencia = scanner.nextLine();
        
        // Solicita e lê o nome do cliente
        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.nextLine();
        
        // Solicita e lê o saldo da conta
        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        // Fecha o objeto scanner
        scanner.close();
    }
}
