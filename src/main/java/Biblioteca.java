package Biblioteca;
import javax.swing.*; //Importação de biblioteca
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Biblioteca extends JFrame { //JFrame -> janela de aplicativo Swing
    private Map<String, Livro> livros; //Map -> armazena contatos usando nomes como chaves
    private DefaultListModel<String> listModel; //Modelo de lista que armazena os nomes dos contatos para exibição em uma lista na interface.
    private JList<String> listaLivros; //JList exibe os nomes dos contatos
    private JTextField tituloField; //JTextField -> interação do user pelo teclado
    private JTextField idField; //JTextField -> interação do user pelo teclado
    private JTextField categoriaField; //JTextField -> interação do user pelo teclado
    private String livroSelecionado; //Variável que armazena o nome do contato selecionado na lista.


    public Biblioteca() { //Construtor

        livros = new HashMap<>(); //HashMap é um conjunto de pares de chave-valor, para cada elemento (valor) salvo num HashMap deve existir uma chave única atrelada a ele
        listModel = new DefaultListModel<>(); //DefaultiListModel -> utilizado para criar um modelo de lista padrão
        listaLivros = new JList<>(listModel);

        setTitle("Biblioteca Simulator");
        setSize(500, 400); // largura x altura
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ação padrão para fechar programa após fechar janela
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(); // Cria um novo painel Swing chamado 'panel' para organizar componentes na interface gráfica.
        panel.setLayout(new GridBagLayout()); // Usar o GridBagLayout para maior controle de posicionamento
        panel.setBackground(Color.WHITE);

        GridBagConstraints constraints = new GridBagConstraints(); //Gerenciador de layout mais flexível e complexo
        GridBagConstraints constraints1 = new GridBagConstraints();
        constraints1.fill = GridBagConstraints.HORIZONTAL;
        constraints.fill = GridBagConstraints.HORIZONTAL; //.fil = preencher
        constraints1.insets = new Insets(5, 5, 5, 5);
        constraints.insets = new Insets(5, 5, 5, 5); // Espaçamento interno dos botões

        JButton adicionarButton = new JButton("Adicionar Livros");
        JButton listarButton = new JButton("Listar Livros");
        JButton excluirButton = new JButton("Excluir Livro");
        JButton editarButton = new JButton("Editar Livros");
        JButton salvarButton = new JButton("Salvar Edições");

        adicionarButton.setPreferredSize(new Dimension(140, 30)); // Definir o tamanho dos botões
        listarButton.setPreferredSize(new Dimension(140, 30));
        excluirButton.setPreferredSize(new Dimension(140, 30));
        editarButton.setPreferredSize(new Dimension(140, 30));
        salvarButton.setPreferredSize(new Dimension(140, 30));

        tituloField = new JTextField();
        idField = new JTextField();
        categoriaField = new JTextField();

        adicionarButton.setBackground(Color.LIGHT_GRAY); //Definir cor dos botões
        listarButton.setBackground(Color.LIGHT_GRAY);
        excluirButton.setBackground(Color.LIGHT_GRAY);
        editarButton.setBackground(Color.LIGHT_GRAY);
        salvarButton.setBackground(Color.LIGHT_GRAY);

        tituloField.setBorder(BorderFactory.createTitledBorder("Nome do Contato")); //Adicionar borda no panel
        idField.setBorder(BorderFactory.createTitledBorder("Número do Contato"));
        categoriaField.setBorder(BorderFactory.createTitledBorder("Email do Contato"));


        panel.add(adicionarButton); //Adiciona botão
        panel.add(listarButton);
        panel.add(excluirButton);
        panel.add(editarButton);
        panel.add(salvarButton);
        panel.add(tituloField); //Adiciona painel
        panel.add(idField);
        panel.add(categoriaField);

        constraints1.gridy = 0; //Constraints (restrições) mantém os dados do usuário restritos
        constraints1.gridwidth = 2; // Expandir em duas colunas
        panel.add(tituloField, constraints1);

        constraints1.gridy = 1;
        panel.add(idField, constraints1);

        constraints1.gridy = 2;
        panel.add(categoriaField, constraints1);

        constraints.gridy = 3;
        panel.add(adicionarButton, constraints);

        constraints.gridy = 4;
        panel.add(listarButton, constraints);

        constraints.gridy = 5;
        panel.add(excluirButton, constraints);

        constraints.gridy = 6;
        panel.add(editarButton, constraints);

        constraints.gridy = 7;
        panel.add(salvarButton, constraints);


        add(new JScrollPane(listaLivros), BorderLayout.CENTER);
        add(panel, BorderLayout.EAST);

        setVisible(true);
        












    }};
