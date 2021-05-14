package school.biblioteca.catalogo;
import java.util.*;

public class Catalogo {

    private Map<String, String> livros = new HashMap<String, String>();

    public Map<String, String> getLivros() {
        return this.livros;
    }

    public void setLivros(String isbn, String titulo) {
        this.livros.put(isbn, titulo);
    }

}
