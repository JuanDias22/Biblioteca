import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 public class Livro {

    public String id;
     public String titulo;
     public Autor autor;
     public String categoria;

    public Livro (String titulo, String id, String categoria) {
        this.titulo = titulo;
        this.id = id;
        this.categoria = categoria;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
        private List<Livro> livros;
        public Livro() {
            livros = new ArrayList<>();
        }
        public void adicionarLivro(Livro livro) {
            livro.adicionarLivro(livro);
        }
        public void excluirLivro(Livro livro) {
            livro.excluirLivro(livro);
        }
    public void listarLivros() {
        System.out.println("Lista de Livros:");
        for (Livro livro : livros) {
            System.out.println("Titulo: " + livro.getTitulo());
            System.out.println("Id: " + livro.getId());
            System.out.println("Categoria: " + livro.getCategoria());
        }
    }
    public Livro buscarLivro(String nome) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null; // Livro nao encontrado
    }

    public void editarContato(String nome, Livro novoLivro) {
        String livro = null;
        Livro livroExistente = buscarLivro(livro);
        if (livroExistente != null) {
            livroExistente.setTitulo(novoLivro.getTitulo());
            livroExistente.setId(novoLivro.getId());
            livroExistente.setCategoria(novoLivro.getCategoria());
        }
        }
}

