package Individual;

import Looca.*;
import Jdbc.*;
import JdbcCommands.InsertMaquina;
import JdbcCommands.SelectUser;
import java.util.List;
import java.util.Scanner;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author kayap
 */
public class JarIndividual {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);
        
        ConexaoBancoLocal conexaoBancoLocal = new ConexaoBancoLocal();
        ConexaoBanco conexaoBanco = new ConexaoBanco();
        JdbcTemplate conexao = conexaoBanco.getConnection();
        JdbcTemplate conexaoLocal = conexaoBancoLocal.getConnection();
        
        SelectUser select = new SelectUser();
        
        Integer escolha;
        
        ShowCPU cpu = new ShowCPU();
        ShowTemp temp = new ShowTemp();
        
        // System.out.println(cpu.clockCpu());
        //System.out.println(temp.showTemp());
        //System.out.println(cpu.usoCpu());
        
        do {
            System.out.println("Escolha a opção que deseja.");
            System.out.println("1 - Insert SQL / 2 - Select SQL / 3 - Insert Local / 0 - Encerrar");
            escolha = leitor.nextInt();
            
            switch (escolha) {
            case 0:
                System.out.println("-".repeat(30));
                System.out.println("Encerrando");
                break;
            case 1:
                System.out.println("-".repeat(30));
                System.out.println("Insert SQL pela Azure");
                
                System.out.println("Nome:");
                String inNome = leitor2.nextLine();

                System.out.println("Email:");
                String inEmail = leitor2.nextLine();

                System.out.println("Senha:");
                String inSenha = leitor2.nextLine();
                
                System.out.println("Cargo:");
                String inCargo = leitor2.nextLine();
                
                System.out.println("ID Gestor:");
                Integer idGestor = leitor2.nextInt();
                
                System.out.println("ID Empresa:");
                Integer idEmpresa = leitor2.nextInt();

                conexaoBanco.insertIntoUsuario(inNome, inEmail, inSenha, inCargo, idGestor, idEmpresa);

                break;
                
            case 2:
                System.out.println("-".repeat(30));
                System.out.println("Select SQL pela Azure");

                System.out.println("email");
                String email = leitor2.nextLine();

                System.out.println("senha");
                String senha = leitor2.nextLine();

                select.selectAndInsert(email, senha);
                break;
                
            case 3:
                System.out.println("-".repeat(30));
                System.out.println("Insert MySQL Local");
                
                System.out.println("Nome:");
                String nomeLocal = leitor2.nextLine();
                
                System.out.println("Sobrenome:");
                String sobrenomeLocal = leitor2.nextLine();

                System.out.println("Email:");
                String emailLocal = leitor2.nextLine();

                System.out.println("Senha:");
                String senhaLocal = leitor2.nextLine();
                
                System.out.println("Cargo:");
                String cargoLocal = leitor2.nextLine();
                
                System.out.println("ID Gestor:");
                Integer gestorLocal = leitor2.nextInt();
                
                System.out.println("ID Empresa:");
                Integer empresaLocal = leitor2.nextInt();

                conexaoBancoLocal.insertIntoBancoLocal(nomeLocal, sobrenomeLocal, emailLocal, senhaLocal, cargoLocal, gestorLocal, empresaLocal);
                break;
                
            default:
                System.out.println("Opção inválida. Selecione 1, 2, 3 ou 4.");
                break;
                
            }   
        } while (escolha != 0);
        
    }
    
}
