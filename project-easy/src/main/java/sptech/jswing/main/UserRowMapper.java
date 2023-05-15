package sptech.jswing.main;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User>{
     @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User usuario = new User();
        usuario.setIdUsuario(rs.getInt("id"));
        usuario.setNome(rs.getString("nome"));
        usuario.setEmail(rs.getString("email"));
        usuario.setSenha(rs.getString("senha"));
        usuario.setCargo(rs.getString("cargo"));
        return usuario;
    }
}
