package org.sambold.tg;
//mvn clean compile (Use para compilar projeto antes de tudo)
//mvn javafx:run (Teste se o javafx esta rodando)
//mvn exec:java (Roda o projeto)

import java.util.Scanner;

import org.sambold.tg.tgmodeloBeans.Usuario;


public class Main {
    public static void main(String[] args) {
        // Aqui estou criando um objeto do tipo usuário pra usar como exemplo
        
        Scanner scan = new Scanner(System.in);
        // Aqui o usuário ira colocar todas as informações
        System.out.println("Digite o seu email:");
        String email = scan.nextLine();
        System.out.println("Digite sua senha:");
        String senha = scan.nextLine();
        System.out.println("Qual o seu Perfil?");
        String perfil = scan.nextLine();
        boolean isAtivo = true;
        



        Usuario usuario1 = new Usuario(email, senha, perfil, isAtivo);
        // Exibindo informações
        System.out.println("Email: " + email);
        System.out.println("Senha " + senha);
        System.out.println("Perfil: " + perfil);
        
    }
}


/* Anotações:
 * Tenho que fazer o scan para que o Usuário consiga colocar as informações via input
 *  Tenho que criar as classes Aluno e Usuário e seus construtores para que eu consigo chamar ao Usuário
 *  Tenho que adaptar a algumas coisas para o novo banco de Dados do Matheus
 *  Mexer com os arquivos DAO depois
 */
