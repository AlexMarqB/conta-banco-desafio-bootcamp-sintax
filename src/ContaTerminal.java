import java.util.Scanner;

public class ContaTerminal {
    private Scanner scan = new Scanner(System.in);
    private int numero;
    private String agencia, nomeCliente;
    private float saldo;

    public static void main(String[] args) throws Exception {


        System.out.println("Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, " +
                "sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque");
    }
}