package configuration;

import java.sql.*;

public class ConexaoDAO {
    
    public Connection conexaoBD() {

        Connection conexao = null;
        
        try {
            String url = "jdbc:mysql://localhost/pratica_ucsal";
            conexao = DriverManager.getConnection(url, "root", "wladi123");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conexao;
    }
   
}