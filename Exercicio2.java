import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args){
         Scanner entradaDados = new Scanner(System.in);
        /*
        Faça um algoritmo que leia um inteiro entre 1 e 12;
        – imprima o nome do mês por extenso.
         */
         System.out.print("Bem vindo! Digite o numero do Mês: ");
        int mesAno = entradaDados.nextInt();

        switch (mesAno){
            case 1: Janeiro(); break;
            case 2: Fevereiro(); break;
            case 3: Marco(); break;
            case 4: Abril(); break;
            case 5: Maio(); break;
            case 6: Junho(); break;
            case 7: Julho(); break;
            case 8: Agosto(); break;
            case 9: Setembro(); break;
            case 10: Outubro(); break;
            case 11: Novembro(); break;
            default: Dezembro(); break;
        }
    }

    static void Janeiro(){
            System.out.println("Estamos em Janeiro!");
    }
    static void Fevereiro(){
            System.out.println("Estamos em Fevereiro!");
    }
    static void Marco(){
            System.out.println("Estamos em Março!");
    }
    static void Abril(){
            System.out.println("Estamos em Abril!");
    }
    static void Maio(){
            System.out.println("Estamos em Maio!");
    }
    static void Junho(){
            System.out.println("Estamos em Junho!");
    }
    static void Julho(){
            System.out.println("Estamos em Julho!");
    }
    static void Agosto(){
            System.out.println("Estamos em Agosto!");
    }
    static void Setembro(){
            System.out.println("Estamos em Setembro!");
    }
    static void Outubro(){
            System.out.println("Estamos em Outubro!");
    }
    static void Novembro(){
            System.out.println("Estamos em Novembro!");
    }
    static void Dezembro(){
            System.out.println("Hoje é Dezembro");
    }
    
}
