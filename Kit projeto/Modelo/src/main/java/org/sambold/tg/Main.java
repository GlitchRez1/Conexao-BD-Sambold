package org.sambold.tg;
//mvn clean compile (Use para compilar projeto antes de tudo)
//mvn javafx:run (Teste se o javafx esta rodando)
//mvn exec:java (Roda o projeto)

import org.sambold.tg.tgmodeloBeans.Usuario;

public class Main {
    public static void main(String[] args) {
        // Aqui estou criando um objeto do tipo usuário pra usar como exemplo
        Usuario usuarioExemplo = new Usuario("joao.silva@email.com", "123456", "ALUNO",true);

        // Exibindo informações
        System.out.println("Email: " + usuarioExemplo.getEmail());
        System.out.println("Perfil: " + usuarioExemplo.getPerfil());
        System.out.println("Usuário está Ativo? " + usuarioExemplo.isAtivo());
    }
}


/* Anotações:
 * Tenho que fazer o scan para que o Usuário consiga colocar as informações via input
 *  Tenho que criar as classes Aluno e Usuário e seus construtores para que eu consigo chamar ao Usuário
 *  Tenho que adaptar a algumas coisas para o novo banco de Dados do Matheus
 *  Mexer com os arquivos DAO depois
 */
