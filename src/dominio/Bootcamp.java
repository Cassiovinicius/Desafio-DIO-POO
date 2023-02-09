package dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate datainIcial = LocalDate.now();
    private final LocalDate dataFinal = datainIcial.plusDays(45);
    private Set<Dev> devsIniciantes = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDatainIcial() {
        return datainIcial;
    }
    public LocalDate getDataFinal() {
        return dataFinal;
    }
    public Set<Dev> getDevsIniciantes() {
        return devsIniciantes;
    }
    public void setDevsIniciantes(Set<Dev> devsIniciantes) {
        this.devsIniciantes = devsIniciantes;
    }
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    
    
}
