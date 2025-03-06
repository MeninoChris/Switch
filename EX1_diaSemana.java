import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner entradaDados = new Scanner(System.in);
        /*
        Crie um algoritmo que leia um número de 1 a 7.
        imprima o dia da semana correspondente;
        assuma que 1 corresponde ao Domingo.
         */
         System.out.print("Bem vindo! Digite o dia da semana: ");
        int diaSemana = entradaDados.nextInt();

        switch (diaSemana){
            case 1: Domingo(); break;
            case 2: Segunda(); break;
            case 3: Terca(); break;
            case 4: Quarta(); break;
            case 5: Quinta(); break;
            case 6: Sexta(); break;
            default: Sabado(); break;


        }
    }
    static void Domingo(){
            System.out.println("Hoje é domingo!");
    }
    static void Segunda(){
            System.out.println("Hoje é Segunda-Feira!");
    }
    static void Terca(){
            System.out.println("Hoje é Terça-Feira!");
    }
    static void Quarta(){
            System.out.println("Hoje é Quarta-Feira!");
    }
    static void Quinta(){
            System.out.println("Hoje é Quinta-Feira!");
    }
    static void Sexta(){
            System.out.println("Hoje é Sexta-Feira!");
    }
    static void Sabado(){
            System.out.println("Hoje é Sabado!");
    }
    
}
