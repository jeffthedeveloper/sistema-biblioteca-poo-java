package biblioteca;

public class Usuario {
    private String nome;
    private int registro;

    public Usuario(String nome, int registro) {
        this.nome = nome;
        this.registro = registro;
    }

    // Métodos getters e setters para acessar e modificar os atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    
    @Override    
    public void exibirDetalhes() {
     System.out.println("Nome:" + nome);
     System.out.println("Registro:" + registro);
     System.out.println();

    }


}
