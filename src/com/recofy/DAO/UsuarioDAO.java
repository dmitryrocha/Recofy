package com.recofy.DAO;

import com.recofy.model.Musica;
import com.recofy.model.Playlist;
import com.recofy.model.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements GenericDAO {

    private DataSource ds;

    public UsuarioDAO(DataSource ds){
        this.ds = ds;
    }

    public void create(Object o ){

    }


    public List<Object> read (Object o) {
        try {
            if(o instanceof Usuario) {
                Usuario incompleto = (Usuario) o;
                String SQL = "SELECT * FROM tblUsuario WHERE email = ? AND senha = ?";
                PreparedStatement statement = ds.getConnection().prepareStatement(SQL);
                statement.setString(1, incompleto.getEmail());
                statement.setString(2, incompleto.getSenha());
                ResultSet rs = statement.executeQuery();
                ArrayList<Object> result = new ArrayList<Object>();
                if(rs.next()){
                    Usuario usuario = new Usuario();
                    usuario.setId(rs.getInt("idUsuario"));
                    usuario.setNome(rs.getString("nome"));
                    usuario.setEmail(rs.getString("email"));
                    usuario.setSenha(rs.getString("senha"));
                    result.add(usuario);
                }
                statement.close();
                rs.close();
                return result;
            } else {throw new RuntimeException(("Objeto inválido"));}

        } catch (SQLException ex) {
            System.out.println("Erro ao recuperar usuário: "+ex.getMessage());
        }


        return null;

    }

    public void update(Object o ){

    }

    public void delete(Object o ){

    }
}
