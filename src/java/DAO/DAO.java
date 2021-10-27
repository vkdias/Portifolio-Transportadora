package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLExpection;
import java.sql.Statement;
import java.util.ArrayList;

public abstract class DAO {

    private Connection con;
    protected String tabela;
    private String insert;
    private String update;
    private boolean insertSQL;

    public DAO(Connection con, String tabela) {
        this.con = con;
        this.tabela = tabela;

    }

    protected abstract void setStatementValues(PreparedStatement stmt, Object object) throws SQLException;

    protected abstract Object createObject(ResultSet rs) throws SQLException;

}
