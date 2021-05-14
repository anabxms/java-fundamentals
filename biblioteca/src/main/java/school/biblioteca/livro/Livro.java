package school.biblioteca.livro;
import school.biblioteca.autor.Autor;
import java.util.*;

public class Livro {

    private String titulo;
    private String isbn;
    private ArrayList<Autor> autores = new ArrayList<Autor>();
    private Set<String> tags = new HashSet<String>();

    public Livro (String titulo, String isbn) {
        setTitulo(titulo);
        setIsbn(isbn);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public ArrayList<Autor> getAutores() {
        return this.autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public void addAutores(Autor autor) {
        if (this.autores.contains(autor))
            return;
        this.autores.add(autor);
    }

    public void removeAutor(Autor autor) {
        this.autores.remove(autor);
    }

    public boolean containsAutor(Autor autor) {
        return this.autores.contains(autor);
    }

    public Set<String> getTags() {
        return this.tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public void addTags(String tag) {
        this.tags.add(tag);
    }

    public void removeTag(String tag) {
        this.tags.remove(tag);
    }

    public boolean containsTag(String tag) {
        return this.tags.contains(tag);
    }

}
