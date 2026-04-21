package principal;

import javax.swing.JOptionPane;
import objetos.*;

/**
 * Classe principal do sistema de agenda.
 * Responsável pelo menu e interação com o usuário.
 */
public class Principal {

    public static void main(String[] args) {

        int opcao;
        Agenda lista = new Agenda();

        do {

            String entrada = JOptionPane.showInputDialog(null,
                    "0 - Sair"
                    + "\n1 - Adicionar contato"
                    + "\n2 - Editar contato"
                    + "\n3 - Remover contato"
                    + "\n4 - Buscar por nome"
                    + "\n5 - Buscar por telefone"
                    + "\n6 - Listar todos os contatos",
                    "Menu",
                    JOptionPane.INFORMATION_MESSAGE);

            if (entrada == null) break;

            opcao = conversaoInt(entrada);

            switch (opcao) {

                case 1: // Adicionar contato
                    String nome = JOptionPane.showInputDialog("Digite o nome do contato:");
                    String tele = JOptionPane.showInputDialog("Digite o telefone:");

                    if (nome != null && tele != null) {

                        if (!Contatos.validarTelefone(tele)) {
                            JOptionPane.showMessageDialog(null, "Telefone inválido!");
                            break;
                        }

                        Contatos contato = new Contatos(nome, tele);
                        lista.adicionarElement(contato);
                    }
                    break;

                case 2: // Editar contato
                    String altere = JOptionPane.showInputDialog("Nome do contato a editar:");
                    String novoNome = JOptionPane.showInputDialog("Novo nome:");
                    String novoTele = JOptionPane.showInputDialog("Novo telefone:");

                    if (altere != null && novoNome != null && novoTele != null) {

                        if (!Contatos.validarTelefone(novoTele)) {
                            JOptionPane.showMessageDialog(null, "Telefone inválido!");
                            break;
                        }

                        lista.editarContato(altere, novoNome, novoTele);
                    }
                    break;

                case 3: // Remover contato
                    nome = JOptionPane.showInputDialog("Nome do contato a remover:");
                    if (nome != null) {
                        lista.removerContato(nome);
                    }
                    break;

                case 4: // Buscar por nome
                    String busca = JOptionPane.showInputDialog("Digite o nome:");
                    if (busca != null) {
                        lista.buscaPorNome(busca);
                    }
                    break;

                case 5: // Buscar por telefone
                    busca = JOptionPane.showInputDialog("Digite o telefone:");
                    if (busca != null) {
                        lista.buscaPorTelefone(busca);
                    }
                    break;

                case 6: // Listar contatos
                    lista.impressao();
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando o sistema...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (opcao != 0);
    }

    /**
     * Converte String para inteiro com tratamento de erro
     */
    public static int conversaoInt(String valor) {
        try {
            return Integer.parseInt(valor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido!");
            return -1;
        }
    }
}