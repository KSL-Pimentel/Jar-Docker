package Jdbc;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author kayap
 */
public class ConexaoBancoLocal {
    private JdbcTemplate connection;
    
    public  ConexaoBancoLocal() {
       BasicDataSource dataSource = new BasicDataSource();

       dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
       dataSource.setUrl("jdbc:mysql://3.80.41.54:3306/bancoLocal?useSSL=false");
       dataSource.setUsername("root");
       dataSource.setPassword("urubu100");

       this.connection = new JdbcTemplate(dataSource);

    }

    public JdbcTemplate getConnection() {
        return connection;

    }
    
    public void insertIntoBancoLocal(String inNome, String inSobrenome, String inEmail, String inSenha, String inCargo, Integer idGestor, Integer idEmpresa) {
    try {
        // Criar uma instância da classe de conexão com o banco de dados local
        ConexaoBancoLocal conexaoLocal = new ConexaoBancoLocal();

        // Obter a conexão do banco de dados local
        JdbcTemplate connection = conexaoLocal.getConnection();

        // Definir a consulta SQL com parâmetros
        String sql = "INSERT INTO Usuario (nome, sobrenome, email, senha, cargo, fkGestor, fk_empresa) VALUES (?, ?, ?, ?, ?, ?, ?)";

        // Executar a consulta de inserção
        connection.update(sql, inNome, inSobrenome,  inEmail, inSenha, inCargo, idGestor, idEmpresa);

        System.out.println("Inserção no banco local realizada com sucesso!");
    } catch (Exception e) {
        System.out.println("Ocorreu um erro ao executar o insert no banco local: " + e.getMessage());
    }
}

}
