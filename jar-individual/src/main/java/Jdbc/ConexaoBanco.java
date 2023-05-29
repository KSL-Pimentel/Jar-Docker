package Jdbc;

import java.util.List;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author kayap
 */
public class ConexaoBanco {
    private JdbcTemplate connection;
    
    public  ConexaoBanco() {
        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://svr-projeto-easy.database.windows.net:1433;database=bd-projeto-easy;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
        dataSource.setUsername("admin-projeto-easy@svr-projeto-easy");
        dataSource.setPassword("#Gfgrupo1");

        this.connection = new JdbcTemplate(dataSource);

    }

    public JdbcTemplate getConnection() {
        return connection;

    }

    public List<LogUso> query(String sql, LogUsoRowMapper logUsoRowMapper, String idUser, String idEmpresa) {
        return connection.query(sql, logUsoRowMapper, idUser, idEmpresa);
    }   

    public void update(String sql, String idUser, String idEmpresa) {
        connection.update(sql, idUser, idEmpresa);
    }

    public void insertIntoUsuario(String inNome, String inTelefone, String inEmail, String inSenha, String inCargo, Integer inPid, Integer pidGestor, Integer idEmpresa) {
        String sql = "INSERT INTO Usuario (nome, telefone, email, senha, cargo, pid, pid_gestor, id_empresa) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        connection.update(sql, inNome, inTelefone, inEmail, inSenha, inCargo, inPid, pidGestor, idEmpresa);
    }
    
}
