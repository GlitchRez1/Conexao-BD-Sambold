package org.sambold.tg.conexao;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.ResultSet;

public class Conexao {

     private static final String DRIVER = "com.mysql.jdbc.Driver";
     private static final String URL = "jdbc:mysql://localhost:3306/BdProjectAPI";
     private static final String USER = "root";
     private static final String PASS = "";

    
        // Método para conectar ao banco de dados da API
    public static Connection conectar() {
        try {
            Class.forName(DRIVER);
        // Retorna a conexão ao programa
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
        }
        return null; // a conexão vai fechar se ocorrer algum erro (seja ao conectar ou não achar o Driver)
    
        /*Logo em seguida temos 3 métodos com o mesmo nome, isso chama "sobrecarga", para evitar termos que criar mais de um método
        com nomes diferentes que façam algo similar*/
}
    public static void fecharConexao(Connection con){

            try {
                if(con!=null){
                    con.close();
                }
            } catch (SQLException ex) {

            }   
    }  

    public static void fecharConexao(Connection con, PreparedStatement stmt){

            fecharConexao(con);

            try {
                if(stmt!=null){
                    stmt.close();
                }
            } catch (SQLException ex) {

            }   
    }

    public static void fecharConexao(Connection con, PreparedStatement stmt, ResultSet rs){

            fecharConexao(con, stmt);

            try {
                if(rs!=null){
                    rs.close();
                }
            } catch (SQLException ex) {
    
            }   
    }

}
