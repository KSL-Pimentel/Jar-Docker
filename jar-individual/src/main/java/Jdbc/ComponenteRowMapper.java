package Jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author kayap
 */
public class ComponenteRowMapper implements RowMapper<Componente>{
    public Componente mapRow(ResultSet rs, int rowNum) throws SQLException {
        Componente objetoComponente = new Componente();
        
        objetoComponente.setId_componente(rs.getString("id_componente"));
        objetoComponente.setNomeComponente(rs.getString("nomeComponente"));
        objetoComponente.setFabricante(rs.getString("fabricante"));
        objetoComponente.setTipo(rs.getString("tipo"));
        objetoComponente.setIpComponente(rs.getString("ipComponente"));
        objetoComponente.setModelo(rs.getString("modelo"));
        objetoComponente.setDriver(rs.getString("driver"));

        return objetoComponente;
    }
}
