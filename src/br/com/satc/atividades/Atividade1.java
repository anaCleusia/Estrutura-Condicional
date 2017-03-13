package br.com.satc.atividades;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        Scanner nota = new Scanner(System.in);

        System.out.println("Digite a sua 1ª nota :");
        float n1 = nota.nextFloat();

        System.out.println("Digite a sua 2ª nota :");
        float n2 = nota.nextFloat();

        System.out.println("Digite a sua 3ª nota :");
        float n3 = nota.nextFloat();

        float calculo = (n1 + n2 + n3) / 3;

        System.out.println("O resultado é :" + calculo);

        System.out.println("Qual é a Nota minima para Aprovação?");
        float n = nota.nextFloat();

        if (n > calculo) {
            System.out.println("Você Está Reprovado... \n Têm pode fazer a prova de recuperação\n\n\n ");

        } else {
            System.out.println("Você Está Aprovado...\n Não precisa fazer a Prova de recuperação\n\n\n ");
            System.exit(0);

        }
        System.out.println("Qual é a nota de recuperação:");
        float rec = nota.nextFloat();

        
            float novaNota = (rec +calculo) / 2;
        
            if(n <= novaNota){
            System.out.println("A nova nota é :" + novaNota + "****Parabens finalmente você passou****");
            }else{
       
            System.out.println("Infelizmente você não conseguiu passar"+ novaNota);
        }

    }
}
