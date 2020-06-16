
package view;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class CadastroProdutoFornecedor {
    
      private JFrame janela;
    private JPanel  painelPrincipal,painelPesssoa, painelBancario;
    private JLabel lblCodigo,lblRazao,lblEndereco,lblBairro, lblCidade,lblEstado,lblCEP,lblTelefone,lblRG,lblCPF,lblEmail;
    private JLabel lblBanco,lblAgencia,lblCorrente,lblTitular,lblCPFBANCO;
    private JTextField txtBanco, txtAgencia,txtCorrente,txtTitular,txtCPFBANCO;
    private JTextField txtCodigo,txtRazao, txtEndereco, txtBairro, txtCidade, txtEstado, txtCEP, txtTelefone, txtRG, txtCPF, txtEmail;
    private JButton btnGravarBanco,btnCancelarBanco,btnAlterarBanco,btnExcluirBanco, btnGravar,btnCancelar,btnSair; 
   private DefaultTableModel modelo;
    private JTable tblBanco;
    private JScrollPane scrollTable;
    
    
    
    
    public void desenharTela(){
        
        
        janela = new JFrame("Cadastro de Produto/Fornecedor");        
        janela.setSize(560,645);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);
        janela.setLocationRelativeTo(null);
        
        
         //-------------- CRIANDO PAINEL --------------------//
         painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setBounds(0,05,560,645);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        
        
        
         //---------------CODIGO-----------------//
         
        lblCodigo = new JLabel("Código ");
        lblCodigo.setBounds(20, 10, 60, 22);
        painelPrincipal.add(lblCodigo);
        
        txtCodigo = new JTextField();
        txtCodigo.setBounds(20, 30, 60, 22);
        painelPrincipal.add(txtCodigo);
        
         //---------------RAZAO SOCIAL-----------------//
         
        lblRazao = new JLabel("Razão Social ");
        lblRazao.setBounds(20, 50, 100, 22);
        painelPrincipal.add(lblRazao);
        
        txtRazao = new JTextField();
        txtRazao.setBounds(20, 70, 300, 22);
        painelPrincipal.add(txtRazao);
        
        
        //---------------CNPJ-----------------//
         
        lblRG = new JLabel("RG / CNPJ ");
        lblRG.setBounds(20, 90, 100, 22);
        painelPrincipal.add(lblRG);
        
        txtRG = new JTextField();
        txtRG.setBounds(20, 110, 140, 22);
        painelPrincipal.add(txtRG);
        
        //---------------CPF-----------------//
         
        lblCPF = new JLabel("CPF / IE ");
        lblCPF.setBounds(180, 90, 100, 22);
        painelPrincipal.add(lblCPF);
        
        txtCPF = new JTextField();
        txtCPF.setBounds(180, 110, 140, 22);
        painelPrincipal.add(txtCPF);
        
        
         //---------------ENDERECO-----------------//
         
        lblEndereco = new JLabel("Endereço ");
        lblEndereco.setBounds(20, 130, 100, 22);
        painelPrincipal.add(lblEndereco);
        
        txtEndereco = new JTextField();
        txtEndereco.setBounds(20, 150, 160, 22);
        painelPrincipal.add(txtEndereco);
        
        //---------------BAIRRO-----------------//
         
        lblBairro = new JLabel("Bairro ");
        lblBairro.setBounds(190, 130, 100, 22);
        painelPrincipal.add(lblBairro);
        
        txtBairro = new JTextField();
        txtBairro.setBounds(190, 150, 130, 22);
        painelPrincipal.add(txtBairro);
        
        
         //---------------CIDADE-----------------//
         
        lblCidade = new JLabel("Cidade ");
        lblCidade.setBounds(20, 170, 100, 22);
        painelPrincipal.add(lblCidade);
        
        txtCidade = new JTextField();
        txtCidade.setBounds(20, 190, 150, 22);
        painelPrincipal.add(txtCidade);
        
        //---------------ESTADO-----------------//
         
        lblEstado = new JLabel("UF");
        lblEstado.setBounds(180, 170, 100, 22);
        painelPrincipal.add(lblEstado);
        
        txtEstado = new JTextField();
        txtEstado.setBounds(180, 190, 30, 22);
        painelPrincipal.add(txtEstado);
        
        //---------------CEP-----------------//
         
        lblCEP = new JLabel("CEP");
        lblCEP.setBounds(220, 170, 100, 22);
        painelPrincipal.add(lblCEP);
        
        txtCEP = new JTextField();
        txtCEP.setBounds(220, 190, 100, 22);
        painelPrincipal.add(txtCEP);
        
        
        //---------------TELEFONE-----------------//
         
        lblTelefone = new JLabel("Telefone");
        lblTelefone.setBounds(20, 210, 100, 22);
        painelPrincipal.add(lblTelefone);
        
        txtTelefone = new JTextField();
        txtTelefone.setBounds(20, 230, 120, 22);
        painelPrincipal.add(txtTelefone);
        
         //---------------Email-----------------//
         
        lblEmail = new JLabel("Email");
        lblEmail.setBounds(150, 210, 100, 22);
        painelPrincipal.add(lblEmail);
        
        txtEmail = new JTextField();
        txtEmail.setBounds(150, 230, 170, 22);
        painelPrincipal.add(txtEmail);
        
        
        //-------------- CRIANDO PAINEL  BANCARIO--------------------//
         painelBancario = new JPanel();
        painelBancario.setLayout(null);
        painelBancario.setBounds(0,260,500,400);
        painelBancario.setBorder(BorderFactory.createTitledBorder("Dados Bancários"));
        painelPrincipal.add(painelBancario);
        
        
        //--------------BANCO-------------------//
        lblBanco = new JLabel("Banco");
        lblBanco.setBounds(20, 20, 100, 22);
        painelBancario.add(lblBanco);
        
        txtBanco = new JTextField();
        txtBanco.setBounds(20, 40, 100, 22);
        painelBancario.add(txtBanco);
        
        
        //--------------AGENCIA-------------------//
        lblAgencia = new JLabel("Agência");
        lblAgencia.setBounds(130, 20, 100, 22);
        painelBancario.add(lblAgencia);
        
        txtAgencia = new JTextField();
        txtAgencia.setBounds(130, 40, 50, 22);
        painelBancario.add(txtAgencia);
        
        //--------------CONTA CORRENTE-------------------//
        lblCorrente = new JLabel("Conta Corrente");
        lblCorrente.setBounds(190, 20, 100, 22);
        painelBancario.add(lblCorrente);
        
        txtCorrente = new JTextField();
        txtCorrente.setBounds(190, 40, 100, 22);
        painelBancario.add(txtCorrente);
        
        
         //--------------TITULAR-------------------//
        lblTitular = new JLabel("Titular");
        lblTitular.setBounds(20, 60, 100, 22);
        painelBancario.add(lblTitular);
        
        txtTitular = new JTextField();
        txtTitular.setBounds(20, 80, 260, 22);
        painelBancario.add(txtTitular);
        
        
         //--------------CPF BANCO-------------------//
        lblCPFBANCO = new JLabel("C.P.F");
        lblCPFBANCO.setBounds(290, 60, 100, 22);
        painelBancario.add(lblCPFBANCO);
        
        txtCPFBANCO = new JTextField();
        txtCPFBANCO.setBounds(290, 80, 120, 22);
        painelBancario.add(txtCPFBANCO);
        
        
         // ---------------- BOTAO OK-----//
       btnGravarBanco = new JButton("Gravar");
       btnGravarBanco.setBounds(20, 110, 90, 25);       
       btnGravarBanco.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelBancario.add(btnGravarBanco);
        
          // ---------------- BOTAO CANCELAR-----//
       btnCancelarBanco = new JButton("Cancelar");
       btnCancelarBanco.setBounds(120, 110, 90, 25);       
       btnCancelarBanco.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelBancario.add(btnCancelarBanco);
       
       
        // ---------------- BOTAO CANCELAR-----//
       btnAlterarBanco = new JButton("Alterar");
       btnAlterarBanco.setBounds(220, 110, 90, 25);       
       btnAlterarBanco.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelBancario.add(btnAlterarBanco);
       
       
        // ---------------- BOTAO CANCELAR-----//
       btnExcluirBanco = new JButton("Excluir");
       btnExcluirBanco.setBounds(320, 110, 90, 25);       
       btnExcluirBanco.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelBancario.add(btnExcluirBanco);
        
       
       janela.add(painelPrincipal);
        janela.setVisible(true); 
        
    }
    
     private void criarTabela() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        modelo.addColumn("Banco");
        modelo.addColumn("Agência");
        modelo.addColumn("C/C");
        modelo.addColumn("Titular");
        modelo.addColumn("C.P.F");
    

        tblBanco = new JTable();
        tblBanco.setModel(modelo);
        tblBanco.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblBanco.getColumnModel().getColumn(1).setPreferredWidth(220);
        tblBanco.getColumnModel().getColumn(2).setPreferredWidth(220);
        tblBanco.getColumnModel().getColumn(3).setPreferredWidth(220);
        

        tblBanco.getTableHeader().setResizingAllowed(false);
        tblBanco.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblBanco.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 14));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblBanco.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblBanco.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblBanco.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        tblBanco.getColumnModel().getColumn(3).setCellRenderer(centralizaColunas);
      

        tblBanco.setFont(new Font("Arial", 0, 14));

        scrollTable = new JScrollPane(tblBanco,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 160, 120, 120);
        tblBanco.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelBancario.add(scrollTable);
        
    }
}
