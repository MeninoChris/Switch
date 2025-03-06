import java.util.Scanner;

public class Exercicio4 {
    static Scanner entradaDados = new Scanner(System.in);
    public static void main(String[] args){
        /*
        Um funcionário receberá aumento de acordo com seu plano de 	trabalho.
        Faça um algoritmo que leia:
        ¨ o plano de trabalho;
        ¨ e o salário atual de um funcionário;
        Calcule e imprima o seu novo salário.
        Plano   Aumento
        A           10%
        B           15%
        C           20%
         */

        Menu();

    }

    static void Menu(){
        System.out.println("");

        System.out.println("| ===========MENU=========== |");
        System.out.println("Digite o seu plano de trabalho: ");
        System.out.println("        A - Plano A ");
        System.out.println("        B - Plano B ");
        System.out.println("        C - Plano C ");
        System.out.println("        S - Sair da Aplicação ");
        System.out.println("| =========================== |");
        char planoTrabalho =  entradaDados.next().toUpperCase().charAt(0);

        switch (planoTrabalho){
            case 'A': PlanoA(); break;
            case 'B': PlanoB(); break;
            case 'C': PlanoC(); break;
            case 'S': System.exit(0);; break;
            default: 
            
            System.out.println("ERRO!");
            System.out.println("Selecione um caractere valido!");
            Menu();
            break;
        }
    }

    static void PlanoA(){

        System.out.print("Digite o seu salário atual: ");
        double salario = entradaDados.nextInt();

        double aumento = salario * 0.10;
        System.out.println("Seu salario é de: R$"+ salario + ", e você obteve um aumento de: R$" + aumento + ", totalizando: R$" + (salario + aumento));

    }

    static void PlanoB(){
        System.out.print("Digite o seu salário atual: ");
        double salario = entradaDados.nextInt();

        double aumento = salario * 0.15;
        System.out.println("Seu salario é de: R$"+ salario + ", e você obteve um aumento de: R$" + aumento + ", totalizando: R$" + (salario + aumento));
    }

    static void PlanoC(){
        System.out.print("Digite o seu salário atual: ");
        double salario = entradaDados.nextInt();

        double aumento = salario * 0.20;
        System.out.println("Seu salario é de: R$"+ salario + ", e você obteve um aumento de: R$" + aumento + ", totalizando: R$" + (salario + aumento));

    }
    
}