package biblioteca;
import java.time.LocalDate;


public class Emprestimo {

    private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;


    public Emprestimo(Livro livro, Usuario usuario, LocalDate dataEmprestimo) {
        this.livro = livro;
        this.usuario = usuario; 
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = null; //Devolução ainda não
        this.livro.setDisponivel(false); // livro emprestado
        

    }

    // Métodos getters e setters para acessar e modificar os atributos

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    
    public void exibirDetalhes() {
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Data do empréstimo: " + dataEmprestimo);
        System.out.println("Data de devolução: " + dataDevolucao != null ? dataDevolucao : "Em aberto");
    }

}