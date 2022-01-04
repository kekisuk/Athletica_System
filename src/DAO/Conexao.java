package DAO;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * AUTORES: Francisca Kelen Ferreira dos Santos, Mateus Eugênio de Andrade, Thiago Natalys Ribeiro da Silva, Olavo Cartaxo.
 */

public class Conexao {
    public static Connection AbrirConexao() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/academia";
            con = DriverManager.getConnection(url, "root", "root");
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o Banco!\n"
                    + JOptionPane.ERROR_MESSAGE);
            e.getMessage();
        }
        return con;
    }
    public static void FecharConexao(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
