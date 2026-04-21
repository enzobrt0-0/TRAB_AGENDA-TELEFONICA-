# TRAB_AGENDA-TELEFONICA-
📒 Sistema de Agenda de Contatos (Java)
📌 Descrição

Este projeto é um sistema simples de agenda de contatos desenvolvido em Java, utilizando interface gráfica com JOptionPane.

O sistema permite ao usuário gerenciar contatos de forma prática, possibilitando adicionar, editar, remover, buscar e listar informações.

🚀 Funcionalidades
➕ Adicionar novo contato
✏️ Editar contato existente
❌ Remover contato
🔍 Buscar contato por nome
📞 Buscar contato por telefone
📋 Listar todos os contatos
✅ Validação de número de telefone
🛠️ Tecnologias Utilizadas
Java
Swing (JOptionPane)
Programação Orientada a Objetos (POO)
🧠 Estrutura das Classes
📌 Contatos

Responsável por representar um contato.

Atributos:

nome
numeroDecontato

Principais métodos:

Getters e Setters
validarTelefone() → valida o formato do telefone
toString() → retorna o contato formatado
📌 Agenda

Responsável por gerenciar a lista de contatos.

Funcionalidades:

Adicionar contato
Editar contato
Remover contato
Buscar por nome
Buscar por telefone
Listar contatos

Utiliza ArrayList para armazenar os dados.

📌 Principal

Classe principal do sistema.

Responsabilidades:

Exibir menu interativo
Receber entradas do usuário
Controlar o fluxo do programa
