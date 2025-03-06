import java.util.Scanner;

public class Exercicio6 {
    static Scanner entradaDados = new Scanner(System.in);
    public static void main(String[] args){
        Menu();
    }

    static void Menu(){
        System.out.println("    Bem vindo a lanchonete do seu Zé!");
        System.out.println("    Aqui o cardapio: ");

        System.out.println("|--------------- CARDAPIO ----------------|");
        System.out.println("Código          Produto              Preço" );
        System.out.println("                                           ");
        System.out.println("100         Cachorro Quente         R$ 1,20");
        System.out.println("101         Bauru Simples           R$ 1,30");
        System.out.println("102         Bauru com Ovo           R$ 1,50");
        System.out.println("103         Hamburguer              R$ 1,20");
        System.out.println("104         CheeseBurguer           R$ 1,30");
        System.out.println("105         Refrigerante            R$ 1,00");
        System.out.println("                                           ");
        System.out.println("|--------------- ||||||||| ---------------|");

        System.out.print("Selecione o codigo do produto que você queira: ");
        int codigo = entradaDados.nextInt();
        System.out.println("");
        System.out.println("");
        System.out.println("");

        switch (codigo){
            case 100: cachorroQuente(); break;
            case 101: Bauru(); break;
            case 102: bauruOvo(); break;
            case 103: Hamburguer(); break;
            case 104: CheeseBurguer(); break;
            case 105: Refrigerante(); break;
            default:  
            System.out.println("ERRO!");
            System.out.println("Digite um codigo de produto corretamente");
            System.out.println("");
            System.out.println("");
            System.out.println("");

            Menu();
            break;
        }
    }

    static void cachorroQuente(){
        System.out.print("Selecione a quantidade que você quer ");
        int quantidade = entradaDados.nextInt();

        double valorPago = quantidade * 1.20;

        System.out.println("Você escolheu o Cachorro Quente! E escolheu: " + quantidade + " cachorros quentes, cada um custa R$ 1,20, então o valor a ser pago será de: R$" + valorPago);
    }
    static void Bauru(){
        System.out.print("Selecione a quantidade que você quer ");
        int quantidade = entradaDados.nextInt();

        double valorPago = quantidade * 1.30;

        System.out.println("Você escolheu o Bauru Simples! E escolheu: " + quantidade + " baurus, cada um custa R$ 1,30, então o valor a ser pago será de: R$" + valorPago);
    }
    static void bauruOvo(){
        System.out.print("Selecione a quantidade que você quer ");
        int quantidade = entradaDados.nextInt();

        double valorPago = quantidade * 1.50;

        System.out.println("Você escolheu o Bauru com  Ovo! E escolheu: " + quantidade + " baurus, cada um custa R$ 1,50, então o valor a ser pago será de: R$" + valorPago);
    }
    static void Hamburguer(){
        System.out.print("Selecione a quantidade que você quer ");
        int quantidade = entradaDados.nextInt();

        double valorPago = quantidade * 1.20;

        System.out.println("Você escolheu o Hamburguer! E escolheu: " + quantidade + " Hamburguers, cada um custa R$ 1,20, então o valor a ser pago será de: R$" + valorPago);
    }
    static void CheeseBurguer(){
        System.out.print("Selecione a quantidade que você quer ");
        int quantidade = entradaDados.nextInt();

        double valorPago = quantidade * 1.30;

        System.out.println("Você escolheu o CheeseBurguer! E escolheu: " + quantidade + " CheeseBurguers, cada um custa R$ 1,30, então o valor a ser pago será de: R$" + valorPago);
    }
    static void Refrigerante(){
        System.out.print("Selecione a quantidade que você quer ");
        int quantidade = entradaDados.nextInt();

        double valorPago = quantidade * 1.00;

        System.out.println("Você escolheu o Refrigerante! E escolheu: " + quantidade + " cachorros quentes, cada um custa R$ 1,00, então o valor a ser pago será de: R$" + valorPago);
    }
    
}
