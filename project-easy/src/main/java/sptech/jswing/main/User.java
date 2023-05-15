package sptech.jswing.main;

public class User {
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private String cargo;

    public User(Integer id, String email, String senha) {
        this.id = id;
        this.email = email;
        this.senha = senha;
    }
    
    public User() {
        
    }

    public Integer getIdUsuario() {
        return id;
    }

    public void setIdUsuario(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return String.format("Usuário: \nId: %d \nNome: %s \nE-mail: %s\n Senha: %s\n Cargo: %s", id, nome, email, senha, cargo);
    }
}
