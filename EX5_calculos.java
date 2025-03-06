import java.util.Scanner;

public class Exercicio5 {
    static Scanner entradaDados = new Scanner(System.in);
    public static void main(String[] args){

        Menu();

    }

    static void Menu(){
        System.out.println("| ========MENU======== |");
        System.out.println("    M - Media");
        System.out.println("    S - Diferença");
        System.out.println("    P - Produto");
        System.out.println("    D - Divisão");
        System.out.println("    E - Sair da Aplicação ");
        System.out.println("| ==================== |");
        char aplicacao =  entradaDados.next().toUpperCase().charAt(0);

        switch (aplicacao) {
            case 'M': Media();  
            
            
            break;
            case 'S': Diferenca();  break;
            case 'P': Produto();  break;
            case 'D': Divisão();  break;
            default:  System.exit(0);  break;
        }
    }

    static void Media(){
        System.out.print("Digite o primeiro numero: ");
        double num1 = entradaDados.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = entradaDados.nextDouble();

        double resultado = (num1 + num2) / 2;
        System.out.println("O resultado da media dos numeros: " + num1 + " e " + num2 + " é: " + resultado);
    }

    static void Diferenca(){
        System.out.print("Digite o primeiro numero: ");
        double num1 = entradaDados.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = entradaDados.nextDouble();

        double diferenca = Math.abs(num1 - num2);
        double numeroMaior = num1;
        if (numeroMaior < num2){
            numeroMaior = num2;
        }
        
        System.out.println("O resultado da diferença dos numeros: " + num1 + " e " + num2 + " é: " + diferenca);
        System.out.println("E o numero maior entre os dois é: " + numeroMaior);
    }

    static void Produto(){
        System.out.print("Digite o primeiro numero: ");
        double num1 = entradaDados.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = entradaDados.nextDouble();

        double resultado = (num1 * num2);
        System.out.println("O resultado do produto dos numeros: " + num1 + " e " + num2 + " é: " + resultado);
    }

    static void Divisão(){
        System.out.print("Digite o primeiro numero: ");
        double num1 = entradaDados.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = entradaDados.nextDouble();

        double resultado = (num1 / num2) ;
        System.out.println("O resultado da divisão dos numeros: " + num1 + " e " + num2 + " é: " + resultado);
    }

}
