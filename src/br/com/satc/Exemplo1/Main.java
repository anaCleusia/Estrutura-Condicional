package br.com.satc.Exemplo1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual é a sua Idade :");
        int idade = entrada.nextInt();

        
        if(idade <= 13){
          System.out.println("Criança");
        }
                 else if ((idade > 13)&&(idade <=17)){
                     System.out.println("Adolescente");
                     
                     } else if ((idade >= 18) && (idade <= 26)) {
                         System.out.println(" Jovem Adulto");
                         
                            } else if((idade > 26 ) &&(idade <= 65)){
                               System.out.println("Adulto");
                                    }else{
                                      System.out.println("Idoso");
        }

    }

}
