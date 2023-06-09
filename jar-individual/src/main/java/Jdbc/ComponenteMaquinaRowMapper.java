package Jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author kayap
 */
public class ComponenteMaquinaRowMapper implements RowMapper<ComponenteMaquina>{
    public ComponenteMaquina mapRow(ResultSet rs, int rowNum) throws SQLException {
        ComponenteMaquina objetoComponenteMaquina = new ComponenteMaquina();
        
        objetoComponenteMaquina.setId_componenteMaquina(rs.getString("id_componenteMaquina"));
        objetoComponenteMaquina.setFk_componente(rs.getString("fk_componente"));
        objetoComponenteMaquina.setFk_maquina(rs.getString("fk_maquina"));

        return objetoComponenteMaquina;
    }
}
