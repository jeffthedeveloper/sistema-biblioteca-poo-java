package biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void realizarEmprestimo(Livro livro, Usuario usuario, LocalDate dataEmprestimo) {
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataEmprestimo);
        emprestimos.add(emprestimo);
    }

    // Se o emprestimo tiver sido realizado e ainda não devolvido o método
    // buscaEmprestimo retorna o emprestimo, caso contrário o retorno é null

    public Emprestimo buscarEmprestimoAtivo(Livro livro) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().equals(livro) && emprestimo.getDataDevolucao() == null) {
                return emprestimo;
            }
        }
        return null;
    }

    public void registrarDevolucao(Livro livro, LocalDate dataDevolucao) {
        Emprestimo emprestimo = buscarEmprestimoAtivo(livro);
        if (emprestimo == null) {
            throw new IllegalArgumentException("Empréstimo não encontrado.");
        }
        emprestimo.setDataDevolucao(dataDevolucao);
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;

            }
        }
        return null;
    }

    public Usuario buscarUsuarioPorNome(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                return usuario;
            }
        }
        return null;
    }

    public void exibirRelatorioEmprestimo() {
        for (Livro livro : livros) {
            livro.exibirDetalhes();
            System.out.println("---");
        }
    }
}