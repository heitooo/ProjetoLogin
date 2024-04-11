package br.ulbra.DAO;

import br.ulbra.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection con;

    public UsuarioDAO() throws SQLException {
        con = ConnectionFactory.getConnection();
    }

    public boolean checkLogin(String login, String senha) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        try {

            stmt = (PreparedStatement) con.prepareStatement(
                    "SELECT * FROM tbusuario WHERE emailusu = ? and senhausu = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }

    public void create(Usuario u) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("insert into tbUsuario(nomeusu, emailusu, senhausu) values(?,?,?)");
            stmt.setString(1, u.getNomeUso());
            stmt.setString(2, u.getEmailUso());
            stmt.setString(3, u.getSenhaUso());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        } //fim do try 
    } //fim do create

}
