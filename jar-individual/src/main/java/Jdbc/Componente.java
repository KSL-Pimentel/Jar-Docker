package Jdbc;

/**
 *
 * @author kayap
 */
public class Componente {
    private String id_componente;
    private String nomeComponente;
    private String fabricante;
    private String tipo;
    private String ipComponente;
    private String modelo;
    private String driver;

    public Componente(String id_componente, String nomeComponente, String fabricante, String tipo, String ipComponente, String modelo, String driver) {
        this.id_componente = id_componente;
        this.nomeComponente = nomeComponente;
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.ipComponente = ipComponente;
        this.modelo = modelo;
        this.driver = driver;
    }
    
    public Componente(){
        
    }
    
     @Override
    public String toString() {
        return "ObjetoLog{" +
                "id_componente ='" + id_componente + '\'' +
                "nomeComponente ='" + nomeComponente + '\'' +
                "fabricante ='" + fabricante + '\'' +
                "tipo ='" + tipo + '\'' +
                "ipComponente ='" + ipComponente + '\'' +
                "modelo ='" + modelo + '\'' +
                "driver ='" + driver + '\'' +
                '}';
    }

    public String getId_componente() {
        return id_componente;
    }

    public void setId_componente(String id_componente) {
        this.id_componente = id_componente;
    }

    public String getNomeComponente() {
        return nomeComponente;
    }

    public void setNomeComponente(String nomeComponente) {
        this.nomeComponente = nomeComponente;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIpComponente() {
        return ipComponente;
    }

    public void setIpComponente(String ipComponente) {
        this.ipComponente = ipComponente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
    
    
}
