
package agenda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            
        Agenda agenda = new Agenda();

        
        System.out.println("Bem vindo(a) ao sistema Agenda");
        System.out.println("-------------------");
        
        System.out.print("Quantos contatos deseja cadastrar? ");
        Scanner scan = new Scanner(System.in);
        int contador = scan.nextInt();
        contador += 1;
         
        for (int i = 1; i < contador; i++) {
            
                Scanner scann = new Scanner(System.in);

                System.out.println("Digite nome do " + i + "º contato: ");
                String nome = scann.nextLine();
                System.out.println("Digite email do " + i + "º contato: ");
                String email = scann.nextLine();
                System.out.println("Digite a data de aniversário do " + i + "º contato: ");
                String  dataAniversario = scann.nextLine();

                agenda.getPessoas().add(new Contato(nome, email, dataAniversario));
                
        }
        
        System.out.println("-------------------");
        System.out.println("Contatos cadastrados");
        System.out.println("-------------------");
        
        agenda.exibir();
        
    }
    
}
