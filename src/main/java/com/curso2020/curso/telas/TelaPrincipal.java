package com.curso2020.curso.telas;

import com.curso2020.curso.controladores.ControladorTelaPrincipal;

/**
 *
 * @author l
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        controlador = new ControladorTelaPrincipal(this, Desktop, menuCadastroAluno,
                menuCadastroFuncionario, menuCadastroUsuario, menuCadastroProduto,
                menuConsultar, menuRegistrarCompraProduto, menuRegistrarContribuicao,
                menuRegistrarDespesa, menuRegistrarVenda, menuCaixa, menuAjudaSobre,
                menuOpcoesConfiguracoes, menuOpcoesSair, lblUsuario, lblHora, lblDiaSemana, lblData);
        //this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        panelInfo = new javax.swing.JPanel();
        lblData = new javax.swing.JLabel();
        lblDiaSemana = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblHora = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuCadastroAluno = new javax.swing.JMenuItem();
        menuCadastroFuncionario = new javax.swing.JMenuItem();
        menuCadastroUsuario = new javax.swing.JMenuItem();
        menuCadastroProduto = new javax.swing.JMenuItem();
        menuConsultar = new javax.swing.JMenu();
        menuRegistrar = new javax.swing.JMenu();
        menuRegistrarCompraProduto = new javax.swing.JMenuItem();
        menuRegistrarContribuicao = new javax.swing.JMenuItem();
        menuRegistrarDespesa = new javax.swing.JMenuItem();
        menuRegistrarVenda = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        menuRelatorioAlunos = new javax.swing.JMenuItem();
        menuRelatorioServicos = new javax.swing.JMenuItem();
        menuCaixa = new javax.swing.JMenu();
        menuAjuda = new javax.swing.JMenu();
        menuAjudaSobre = new javax.swing.JMenuItem();
        menuOpcoes = new javax.swing.JMenu();
        menuOpcoesConfiguracoes = new javax.swing.JMenuItem();
        menuOpcoesSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SGF- Sistema de Gerenciamento Financeiro");
        setExtendedState(MAXIMIZED_BOTH);
        setMinimumSize(new java.awt.Dimension(901, 680));

        Desktop.setBackground(java.awt.SystemColor.desktop);
        Desktop.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Desktop.setPreferredSize(new java.awt.Dimension(640, 480));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuário"));
        jPanel1.setToolTipText("Nome do usuário logado no sistema");
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 100));

        lblUsuario.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        lblUsuario.setText("Usuário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblData.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        lblData.setText("Data");

        lblDiaSemana.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        lblDiaSemana.setText("dia");

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblDiaSemana)
                    .addComponent(lblData))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addComponent(lblDiaSemana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setMaximumSize(new java.awt.Dimension(256, 256));
        lblLogo.setPreferredSize(new java.awt.Dimension(791, 689));

        lblHora.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        lblHora.setText("Hora");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHora, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Menu.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        menuCadastro.setText("Cadastro");

        menuCadastroAluno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuCadastroAluno.setText("Aluno");
        menuCadastro.add(menuCadastroAluno);

        menuCadastroFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuCadastroFuncionario.setText("Funcionário");
        menuCadastro.add(menuCadastroFuncionario);

        menuCadastroUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuCadastroUsuario.setText("Usuário");
        menuCadastroUsuario.setEnabled(false);
        menuCadastro.add(menuCadastroUsuario);

        menuCadastroProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuCadastroProduto.setText("Produto");
        menuCadastro.add(menuCadastroProduto);

        Menu.add(menuCadastro);

        menuConsultar.setText("Consultar");
        Menu.add(menuConsultar);

        menuRegistrar.setText("Registrar");

        menuRegistrarCompraProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menuRegistrarCompraProduto.setText("Compra de Produto");
        menuRegistrar.add(menuRegistrarCompraProduto);

        menuRegistrarContribuicao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menuRegistrarContribuicao.setText("Contribuição");
        menuRegistrar.add(menuRegistrarContribuicao);

        menuRegistrarDespesa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menuRegistrarDespesa.setText("Despesa");
        menuRegistrar.add(menuRegistrarDespesa);

        menuRegistrarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menuRegistrarVenda.setText("Venda");
        menuRegistrar.add(menuRegistrarVenda);

        Menu.add(menuRegistrar);

        menuRelatorio.setText("Relatório");
        menuRelatorio.setEnabled(false);

        menuRelatorioAlunos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuRelatorioAlunos.setText("Alunos");
        menuRelatorio.add(menuRelatorioAlunos);

        menuRelatorioServicos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuRelatorioServicos.setText("Serviços");
        menuRelatorio.add(menuRelatorioServicos);

        Menu.add(menuRelatorio);

        menuCaixa.setText("Caixa");
        Menu.add(menuCaixa);

        menuAjuda.setText("Ajuda");

        menuAjudaSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuAjudaSobre.setText("Sobre");
        menuAjuda.add(menuAjudaSobre);

        Menu.add(menuAjuda);

        menuOpcoes.setText("Opções");

        menuOpcoesConfiguracoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuOpcoesConfiguracoes.setText("Configurações");
        menuOpcoes.add(menuOpcoesConfiguracoes);

        menuOpcoesSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuOpcoesSair.setText("Sair");
        menuOpcoes.add(menuOpcoesSair);

        Menu.add(menuOpcoes);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDiaSemana;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblLogo;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuAjudaSobre;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuCadastroAluno;
    private javax.swing.JMenuItem menuCadastroFuncionario;
    private javax.swing.JMenuItem menuCadastroProduto;
    public static javax.swing.JMenuItem menuCadastroUsuario;
    private javax.swing.JMenu menuCaixa;
    private javax.swing.JMenu menuConsultar;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenuItem menuOpcoesConfiguracoes;
    private javax.swing.JMenuItem menuOpcoesSair;
    private javax.swing.JMenu menuRegistrar;
    private javax.swing.JMenuItem menuRegistrarCompraProduto;
    private javax.swing.JMenuItem menuRegistrarContribuicao;
    private javax.swing.JMenuItem menuRegistrarDespesa;
    private javax.swing.JMenuItem menuRegistrarVenda;
    public static javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenuItem menuRelatorioAlunos;
    private javax.swing.JMenuItem menuRelatorioServicos;
    public javax.swing.JPanel panelInfo;
    // End of variables declaration//GEN-END:variables
    private ControladorTelaPrincipal controlador;
}
