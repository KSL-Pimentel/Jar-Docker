package Jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


/**
 *
 * @author kayap
 */
public class LogUsoRowMapper implements RowMapper<LogUso>{
    public LogUso mapRow(ResultSet rs, int rowNum) throws SQLException {
        LogUso objetoLogUso = new LogUso();
        
        objetoLogUso.setId_LogUso(rs.getString("id_LogUso"));
        objetoLogUso.setFk_maquina(rs.getString("fk_maquina"));
        objetoLogUso.setFk_empresa(rs.getString("fk_empresa"));
        objetoLogUso.setFk_usuario(rs.getString("fk_usuario"));
        objetoLogUso.setDataLog(rs.getString("dataLog"));
        objetoLogUso.setHoraInicio(rs.getString("horaInicio"));
        objetoLogUso.setHoraFinal(rs.getString("horaFinal"));

        return objetoLogUso;
    }
}
