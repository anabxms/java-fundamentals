package school.biblioteca;

import school.biblioteca.autor.Autor;
import school.biblioteca.catalogo.Catalogo;
import school.biblioteca.livro.Livro;

public class Main {
    public static void main(String[] args) {

        Livro l1 = new Livro("1Q84", "8579621801");
        Catalogo c1 = new Catalogo();
        Autor a1 = new Autor("Haruki Murakami", "05765213456");
        a1.addObras(l1);
        l1.addAutores(a1);
        l1.addTags("Ficção");
        c1.setLivros(l1.getIsbn(), l1.getTitulo());
        System.out.println(c1.getLivros());
        System.out.println(a1.getObras());

    }
}
