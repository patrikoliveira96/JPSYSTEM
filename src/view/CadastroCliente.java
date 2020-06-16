
package view;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


public class CadastroCliente {
    
     
   private JFrame janela;
    private JPanel painelCadastro, painelPrincipal;
    private JLabel lblCodigo, lblNome,lblCNPJ,lblIE, lblFantasia, lblEstado, lblCidade;
    private JLabel lblRG,lblEndereco, lblNumero, lblBairro, lblComplemento, lblLogradouro, lblCEP,lblCadastro,lblCelular, lblTelefone, lblObservacao;
    private JLabel lblPrazo,lblEmail,lblCredito;
    private JTextField txtCodigo, txtNome,txtCNPJ,txtIE,txtFantasia, txtCadastro, txtRG, txtEndereco, txtNumero, txtBairro , txTComplmento, txtCEP ;
    private JTextField txtCelular, txtTelefone,txtPrazo, txtObservacao, txtEmail,txtCredito; 
    private JComboBox cbEstado, cbCidade; 
    private JButton btnGravar,btnCancelar,btnSair ;
    
    
    public void desenharTela(){
        
        
        janela = new JFrame("Cadastro de Clientes");        
        janela.setSize(560,645);
        janela.setLayout(null);
        janela.setLocationRelativeTo(null);
        
        
         //-------------- CRIANDO PAINEL --------------------//
         painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setBounds(0,05,560,645);
        painelPrincipal.setBorder(BorderFactory.createTitledBorder(""));
        janela.add(painelPrincipal);
        
        
     //-------------- CRIANDO PAINEL --------------------//
         painelCadastro = new JPanel();
        painelCadastro.setLayout(null);
        painelCadastro.setBounds(0,03,540,595);
        painelCadastro.setBorder(BorderFactory.createTitledBorder("Cadastro de Clientes"));
        painelPrincipal.add(painelCadastro);
        
        
        
        
        
       
        
         //---------------CODIGO-----------------//
         
        lblCodigo = new JLabel("Código ");
        lblCodigo.setBounds(30, 30, 60, 22);
        painelCadastro.add(lblCodigo);
        
        txtCodigo = new JTextField();
        txtCodigo.setBounds(30, 55, 60, 22);
        painelCadastro.add(txtCodigo);
        
        
        
          //---------------CNPJ / CPF-----------------//
         
        lblCNPJ = new JLabel("CNPJ / CPF ");
        lblCNPJ.setBounds(30, 80, 120, 22);
        painelCadastro.add(lblCNPJ);
        
        txtCNPJ = new JTextField();
        txtCNPJ.setBounds(30, 105, 150, 22);
        painelCadastro.add(txtCNPJ);
        
         //---------------INSCRIÇÃO ESTADUAL-----------------//
         
        lblIE = new JLabel("I.E ");
        lblIE.setBounds(205, 80, 120, 22);
        painelCadastro.add(lblIE);
        
        txtIE = new JTextField();
        txtIE.setBounds(200, 105, 150, 22);
        painelCadastro.add(txtIE);
        
         //----------------RG---------------//
        lblRG = new JLabel("RG: ");
        lblRG.setBounds(375, 80, 120, 22);
        painelCadastro.add(lblRG);
        
        
        txtRG = new JTextField();
        txtRG.setBounds(370, 105, 150, 22);
        painelCadastro.add(txtRG);
        
        
        
       //---------------NOME-----------------//
         
        lblNome = new JLabel("Nome ");
        lblNome.setBounds(30, 130, 120, 22);
        painelCadastro.add(lblNome);
        
        txtNome = new JTextField();
        txtNome.setBounds(30, 155, 320, 22);
        painelCadastro.add(txtNome);
        
        //---------------NOME FANTASIA-----------------//
         
        lblFantasia = new JLabel("Fantasia ");
        lblFantasia.setBounds(30, 180, 120, 22);
        painelCadastro.add(lblFantasia);
        
        txtFantasia= new JTextField();
        txtFantasia.setBounds(30, 205, 320, 22);
        painelCadastro.add(txtFantasia);
        
        //----------------ENDERECO---------------//
        lblEndereco = new JLabel("Endereço ");
        lblEndereco.setBounds(30, 230, 70, 22);
        painelCadastro.add(lblEndereco);
        
        txtEndereco = new JTextField();
        txtEndereco.setBounds(30, 255, 300, 22);
        painelCadastro.add(txtEndereco);
        
        
         //----------------NUMERO---------------//
        lblNumero = new JLabel("Número: ");
        lblNumero.setBounds(370, 230, 125, 22);
        painelCadastro.add(lblNumero);
        
        txtNumero = new JTextField();
        txtNumero.setBounds(370, 255, 50, 22);
        painelCadastro.add(txtNumero);
        
        //----------------COMPLEMENTO---------------//
        lblComplemento = new JLabel("Complemento: ");
        lblComplemento.setBounds(30, 280, 125, 22);
        painelCadastro.add(lblComplemento);
        
        txTComplmento = new JTextField();
        txTComplmento.setBounds(30, 305, 230, 22);
        painelCadastro.add(txTComplmento);
        
        
          //----------------BAIRRO---------------//
        lblBairro = new JLabel("Bairro: ");
        lblBairro.setBounds(280, 280, 125, 22);
        painelCadastro.add(lblBairro);
        
        txtBairro = new JTextField();
        txtBairro.setBounds(280, 305, 150, 22);
        painelCadastro.add(txtBairro);
        
         //----------------ESTADO---------------//
        lblEstado = new JLabel("UF ");
        lblEstado.setBounds(30, 330, 120, 22);
        painelCadastro.add(lblEstado);
        
        cbEstado = new JComboBox();
        cbEstado.setBounds(30, 355, 80, 20);
        painelCadastro.add(cbEstado);
        
        
        //----------------CIDADE ---------------//
        lblCidade = new JLabel("Cidade ");
        lblCidade.setBounds(125, 330, 150, 22);
        painelCadastro.add(lblCidade);
        
        cbCidade = new JComboBox();
        cbCidade.setBounds(120, 355, 170, 20);
        painelCadastro.add(cbCidade);
        
        
         //----------------CEP---------------//
        lblCEP = new JLabel("CEP: ");
        lblCEP.setBounds(300, 330, 70, 22);
        painelCadastro.add(lblCEP);
        
        txtCEP = new JTextField();
        txtCEP.setBounds(300, 355, 100, 22);
        painelCadastro.add(txtCEP);
        
        //----------------TELEFONE---------------//
        lblTelefone = new JLabel("Telefone ");
        lblTelefone.setBounds(30, 385, 80, 22);
        painelCadastro.add(lblTelefone);
        
        txtTelefone = new JTextField();
        txtTelefone.setBounds(30, 410, 120, 22);
        painelCadastro.add(txtTelefone);
        
          //----------------CELULAR---------------//
        lblCelular = new JLabel("Celular ");
        lblCelular.setBounds(160, 385, 80, 22);
        painelCadastro.add(lblCelular);
        
        txtCelular = new JTextField();
        txtCelular.setBounds(160, 410, 120, 22);
        painelCadastro.add(txtCelular);
        
        //----------------DATA DE CADASTRO---------------//
        lblCadastro = new JLabel("Data de Cadastro ");
        lblCadastro.setBounds(295, 385, 120, 22);
        painelCadastro.add(lblCadastro);
        
        txtCadastro = new JTextField();
        txtCadastro.setBounds(295, 410, 100, 22);
        painelCadastro.add(txtCadastro);
        
        
         //----------------PRAZO---------------//
        lblPrazo = new JLabel("Prazo ");
        lblPrazo.setBounds(420, 385, 120, 22);
        painelCadastro.add(lblPrazo);
        
        txtPrazo = new JTextField();
        txtPrazo.setBounds(420, 410, 50, 22);
        painelCadastro.add(txtPrazo);
        
           //----------------EMAIL---------------//
        lblEmail = new JLabel("Email: ");
        lblEmail.setBounds(30, 440, 125, 22);
        painelCadastro.add(lblEmail);
        
        txtEmail = new JTextField();
        txtEmail.setBounds(30, 465, 300, 22);
        painelCadastro.add(txtEmail);
        
        
         //----------------LIMITE DE CREDITO---------------//
        lblCredito = new JLabel("Limite de Crédito ");
        lblCredito.setBounds(350, 440, 120, 22);
        painelCadastro.add(lblCredito);
        
        txtCredito = new JTextField();
        txtCredito.setBounds(350,465 , 80, 22);
        painelCadastro.add(txtCredito);
      
      
        
        //----------------OBSERVACAO---------------//
        lblObservacao = new JLabel("Observação: ");
        lblObservacao.setBounds(30, 500, 125, 22);
        painelCadastro.add(lblObservacao);
        
        txtObservacao = new JTextField();
        txtObservacao.setBounds(115, 500, 308, 85);
        painelCadastro.add(txtObservacao);
        
        
        
        // ---------------- BOTAO GRAVAR-----//
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(430, 500, 90, 25);       
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelCadastro.add(btnGravar);
        
          // ---------------- BOTAO CANCELAR-----//
       btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(430, 530, 90, 25);       
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       painelCadastro.add(btnCancelar);
        
         // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(430, 560, 90, 25);       
       btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);        
       painelCadastro.add(btnSair);
         
       janela.add(painelPrincipal);
       janela.setVisible(true);
       
         
    }
     
}
