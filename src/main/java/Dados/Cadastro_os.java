
package Dados;
import br.com.sistemasOs.TelaCadastro;
import br.com.sistemasOs.TelaPrincipal;


public class Cadastro_os {
    private int idos;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String problema;
    private String tipoequip;
    private String marca;
    private String situacao;
    
    private static int posicaoAutoIncremental = 1;

    public Cadastro_os(String nome, String endereco, String telefone, String email, String problema, String tipoequip, String marca, String situacao) {
        
        posicaoAutoIncremental++;
        
        this.idos = posicaoAutoIncremental;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.problema = problema;
        this.tipoequip = tipoequip;
        this.marca = marca;
        this.situacao = situacao;
    }
   

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getTipoequip() {
        return tipoequip;
    }

    public void setTipoequip(String tipoequip) {
        this.tipoequip = tipoequip;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
