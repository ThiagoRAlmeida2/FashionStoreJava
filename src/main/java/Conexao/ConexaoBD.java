package Conexao;

import java.sql.Connection;

import java.sql.DriverManager;

public class ConexaoBD {
    public static Connection getConexao() throws Exception {
        Connection conn;
        String urlConexao = "jdbc:mysql://localhost:3305/loja_Java";
        String user = "King";
        String psw = "thiagomitosis123";

        DriverManager.registerDriver(new  com.mysql.cj.jdbc.Driver());
        conn = DriverManager.getConnection(urlConexao, user, psw);

        return conn;
    }
}