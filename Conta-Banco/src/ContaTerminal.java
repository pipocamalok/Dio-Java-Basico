import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Conhecer e importar a classe Scanner
        // Exibir as mensagens para o nosso usuário
        // Obter oela scanner os valores digitados no terminal
        // Exibir a mensagem conta criada

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Por favor, digite o numero da conta:");
        numero = sc.nextInt();

        System.out.println("Número da Agencia:");
        String agencia = sc.next();

        System.out.println("Nome do proprietário da conta:");
        String nome = sc.next();

        System.out.println("Saldo inicial:");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigada por criar uma conta em nosso banco, sua Agência é " + agencia + ", conta " + numero + ", e seu saldo inicial de " + saldo + " já está disponível para saque.");
        
        sc.close();
    }
}