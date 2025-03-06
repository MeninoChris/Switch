import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args){
         Scanner entradaDados = new Scanner(System.in);
        /*
        Faça um algoritmo que leia o período em que um aluno estuda:
        M - Matutino;
        V - Vespertino;
        N - Noturno.
        Escreva uma das opções a seguir:
                                                    Opção	    Saudação
                                                    M	        bom dia
                                                    V	        boa tarde
                                                    N	        boa noite
         */
         System.out.println("Bem vindo! Digite o  periodo que você estuda: ");
         System.out.println("M - Matutino ");
         System.out.println("V - Vespertino");
         System.out.println("N - Noturno");
         char periodo = entradaDados.next().toUpperCase().charAt(0);

        switch (periodo){
            case 'M': Matutino(); break;
            case 'V': Vespertino(); break;
            default: Noturno(); break;
        }
    }

    static void Matutino(){
            System.out.println("Bom dia!");
    }
    static void Vespertino(){
            System.out.println("Boa Tarde!");
    }
    static void Noturno(){
            System.out.println("Boa Noite!");
    
    }
}
