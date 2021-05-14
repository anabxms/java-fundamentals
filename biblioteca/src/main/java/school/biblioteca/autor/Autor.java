package school.biblioteca.autor;

import java.util.HashSet;
import java.util.Set;
import school.biblioteca.livro.Livro;

public class Autor {

    private String nome;
    private String cpf;
    private Set<Livro> obras = new HashSet<Livro>();

    public Autor (String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null)
            throw new RuntimeException("CPF não pode ser nulo!");
        else if (cpf.length() != 11)
            throw new RuntimeException("CPF deve ter 11 caracteres!");
        this.cpf = cpf;
    }

    public Set<Livro> getObras() {
        return this.obras;
    }

    public void setObras(Set<Livro> obras) {
        this.obras = obras;
    }

    public void addObras(Livro livro) {
        this.obras.add(livro);
    }

    public void removeTag(Livro livro) {
        this.obras.remove(livro);
    }

    public boolean containsTag(Livro livro) {
        return this.obras.contains(livro);
    }

}
