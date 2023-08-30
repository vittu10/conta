import java.util.Scanner;
public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("conta bancaria digite seu numero");
        int x =sc.nextInt();
        System.out.println("digite sua agencia");
        int ag = sc.nextInt();
        System.out.println("seu nome");
        String nome=sc.next();
        
        System.out.println();
        System.out.println("seu saldo");
        float saldo=sc.nextFloat();
        System.out.println("ola " + nome + " obrigado por criar uma conta em nosso banco,sua agência é " + ag + " conta " + x + " e seu saldo " + saldo + " já está disponível para saque");
    }
}