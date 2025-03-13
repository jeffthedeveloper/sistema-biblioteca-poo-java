package biblioteca;

import java.time.LocalDate;

public class BibliotecaApp {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Senhor dos anéis", "J.R.R. Tolkien", "978-65-86127-00-1");
        Livro livro2 = new Livro("Dom Quixote", "Miguel de Cervantes", "978-65-86127-00-1");
        Usuario usuario1 = new Usuario("Jeff JEDI", 1);
        Usuario usuario2 = new Usuario("Fulana Macaiba", 2);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarUsuario(usuario1);
        biblioteca.adicionarUsuario(usuario2);

        // Realiza um Empréstimo

        biblioteca.realizarEmprestimo(livro1, usuario1, LocalDate.now());

        // Exibe detalhes do empréstimo
        Emprestimo emprestimo = biblioteca.buscarEmprestimoAtivo(livro1);
        if (emprestimo != null) {
            System.out.println("Detalhes do empréstimo ANTES da devolução:");
            emprestimo.exibirDetalhes();
        } else {

            System.out.println("Empréstimo não encontrado");
        }

        // Registra a devolução
        biblioteca.registrarDevolucao(livro1, LocalDate.now().plusDays(7));

        // Exibe detalhes do empréstimo após devolução, se encontrado

        if (emprestimo != null) {

            System.out.println("Detalhes do empréstimo APÓS a devolução:");

            emprestimo.exibirDetalhes();
        } else {

            System.out.println("Empréstimo não encontrado");
        }
    }
}
