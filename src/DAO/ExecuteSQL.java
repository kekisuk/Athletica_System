package DAO;

import java.sql.*;

/**
 *
 * AUTORES: Francisca Kelen Ferreira dos Santos, Mateus Eugênio de Andrade, Thiago Natalys Ribeiro da Silva, Lucas Antônio Ferreira Almeida, Olavo Cartaxo
 */

public class ExecuteSQL {
    private Connection con;
    
    public ExecuteSQL(Connection con) {
        setCon(con);
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
}
