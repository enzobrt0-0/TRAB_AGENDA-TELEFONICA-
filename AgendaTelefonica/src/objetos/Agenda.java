package objetos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe responsável por gerenciar uma agenda de contatos.
 * Permite adicionar, editar, buscar, remover e listar contatos.
 */
public class Agenda {

    // Lista que armazena os contatos
    private ArrayList<Contatos> agenda = new ArrayList<>();

    /**
     * Adiciona um novo contato à agenda
     * @param contato objeto do tipo Contatos
     */
    public void adicionarElement(Contatos contato) {
        agenda.add(contato);
    }

    /**
     * Edita um contato existente pelo nome
     */
    public void editarContato(String nome, String novoNome, String novoTele) {

        for (Contatos x : agenda) {
            if (x.getNome().equals(nome)) {

                // Atualiza os dados
                x.setNome(novoNome);
                x.setNumeroDecontato(novoTele);

                JOptionPane.showMessageDialog(null,
                        "DADOS ALTERADOS COM SUCESSO",
                        "ALTERAR",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Contato não existente",
                "Erro",
                JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Busca um contato pelo nome
     */
    public void buscaPorNome(String busca) {

        for (Contatos x : agenda) {
            if (x.getNome().equals(busca)) {

                JOptionPane.showMessageDialog(null,
                        "Contato encontrado!",
                        "Busca",
                        JOptionPane.INFORMATION_MESSAGE);

                JOptionPane.showMessageDialog(null,
                        "Nome: " + x.getNome() +
                        "\nTelefone: " + x.getNumeroDecontato());

                return;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Contato não existente",
                "Erro",
                JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Busca um contato pelo telefone
     */
    public void buscaPorTelefone(String busca) {

        for (Contatos x : agenda) {
            if (x.getNumeroDecontato().equals(busca)) {

                JOptionPane.showMessageDialog(null,
                        "Contato encontrado!",
                        "Busca",
                        JOptionPane.INFORMATION_MESSAGE);

                JOptionPane.showMessageDialog(null,
                        "Nome: " + x.getNome() +
                        "\nTelefone: " + x.getNumeroDecontato());

                return;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Contato não existente",
                "Erro",
                JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Remove um contato pelo nome
     */
    public void removerContato(String nome) {

        for (Contatos x : agenda) {
            if (x.getNome().equals(nome)) {

                agenda.remove(x);

                JOptionPane.showMessageDialog(null,
                        "Contato removido com sucesso",
                        "Remoção",
                        JOptionPane.INFORMATION_MESSAGE);

                return;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Contato não existente",
                "Erro",
                JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Lista todos os contatos da agenda
     */
    public void impressao() {

        if (agenda.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Agenda vazia",
                    "Info",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        for (Contatos x : agenda) {
            JOptionPane.showMessageDialog(null,
                    "Nome: " + x.getNome() +
                    "\nTelefone: " + x.getNumeroDecontato());
        }
    }
}