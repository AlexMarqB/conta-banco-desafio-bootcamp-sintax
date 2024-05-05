import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        int numero;
        String nomeAgencia, nomeCliente;
        float saldo = 0;

        //TODO:Conhecer e importar a classe Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor digite o número da conta!");
        if (scan.hasNextInt()) {
            numero = scan.nextInt();
            // Consumir a quebra de linha após a entrada do número
            scan.nextLine();
        } else {
            System.out.println("Entrada inválida para o número da conta.");
            return;
        }

        System.out.println("Por favor, digite o nome da agência");
        nomeAgencia = scan.nextLine();

        System.out.println("Por favor, digite seu nome completo");
        nomeCliente = scan.nextLine();

        System.out.println("Seu saldo inicial é R$ 0,00, digite o valor que deseja adicionar");
        if (scan.hasNextFloat()) {
            saldo += scan.nextFloat();
            // Consumir a quebra de linha após a entrada do valor do saldo
            scan.nextLine();
        } else {
            System.out.println("Entrada inválida para o saldo inicial.");
            return;
        }

        //TODO:exibir a mensagem conta criada
        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+ nomeAgencia +", conta "+numero+" e seu saldo R$ "+saldo+" já está disponível para saque");
    }
}
