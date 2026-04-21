package objetos;

/**
 package objetos;

/**
 * Classe que representa um contato da agenda.
 * Contém nome e número de telefone.
 */
public class Contatos {

    private String nome;
    private String numeroDecontato;

    /**
     * Construtor da classe
     */
    public Contatos(String nome, String numero) {
        this.nome = nome;
        this.numeroDecontato = numero;
    }

    // GETTERS E SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroDecontato() {
        return numeroDecontato;
    }

    public void setNumeroDecontato(String numeroDecontato) {
        this.numeroDecontato = numeroDecontato;
    }

    /**
     * Valida o número de telefone
     * Aceita números, espaços, parênteses, + e traços
     */
    public static boolean validarTelefone(String telefone) {
        if (telefone == null || telefone.isEmpty()) {
            return false;
        }
        return telefone.matches("[0-9()+\\-\\s]+");
    }

    /**
     * Retorno formatado do contato
     */
    @Override
    public String toString() {
        return "Nome: " + nome + "\nTelefone: " + numeroDecontato;
    }
}