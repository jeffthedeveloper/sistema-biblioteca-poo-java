package biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true; 
        // O iivro é criadi disponível
    }

// Métodos getters e setters para acessar e modificar os atributos
    public String getTitulo() {
        return titulo;
    }

    public void  setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void  setAutor(String autor) {
        this.autor = autor;
    }


    public String getIsbn() {
        return isbn;
    }

    public void  setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponível() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
        System.out.println();

    }
}
