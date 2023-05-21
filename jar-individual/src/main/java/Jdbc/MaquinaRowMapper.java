package Jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author kayap
 */
public class MaquinaRowMapper implements RowMapper<Maquina>{
    public Maquina mapRow(ResultSet rs, int rowNum) throws SQLException {
        Maquina objetoMaquina = new Maquina();
        
        objetoMaquina.setId_maquina(rs.getString("id_maquina"));
        objetoMaquina.setSistemaOperacional(rs.getString("sistemaOperacional"));
        objetoMaquina.setArquitetura(rs.getString("arquitetura"));
        objetoMaquina.setFabricante(rs.getString("fabricante"));
        objetoMaquina.setFk_empresa(rs.getString("fk_empresa"));

        return objetoMaquina;
    }
}
