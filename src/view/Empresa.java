
package view;

import java.awt.TextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Empresa {
    
    private JFrame janela;
    private JPanel painelCadastro, painelParametro;
    private JLabel lblEmpresa, lblFantasia,lblCNPJ,lblIE,lblEndereco,lblEstado,lblBairro, lblCidade,lblCEP,lblTelefone,lblBonificacao;
    private JTextField txtEmpresa, txtFantasia, txtCNPJ, txtIE, txtEndereco, txtEstado, txtBairro, txtCidade, txtCEP, txtTelefone,txtbonificacao;
    private JButton btnGravar,btnCancelar,btnSair,btnAlterar ;
    
    //painel com abas//
    
    private JPanel cadastro, baixa,alteracao,exclusao,vizualizao;

  public void desenharTela(){
        
        
        janela = new JFrame("Cadastro de Empresa");
        janela.setSize(530,330);
        janela.setLayout(null);
        janela.setLocationRelativeTo(null);
        
     //-------------- CRIANDO PAINEL --------------------//
         painelCadastro = new JPanel();
        painelCadastro.setLayout(null);
        painelCadastro.setSize(380,280);
        painelCadastro.setBorder(BorderFactory.createTitledBorder("Cadastro de Empresa"));
        janela.add(painelCadastro);
        
        
        //-----------------NOME EMPRESA--------------//
       lblEmpresa = new JLabel("Empresa: ");
        lblEmpresa.setBounds(30, 30, 120, 22);
        painelCadastro.add(lblEmpresa);
        
        txtEmpresa = new JTextField();
        txtEmpresa.setBounds(90, 30, 260, 22);
        painelCadastro.add(txtEmpresa);
        
        
         //---------------NOME FANTASIA-----------------//
         
        lblFantasia = new JLabel("Fantasia: ");
        lblFantasia.setBounds(30, 60, 120, 22);
        painelCadastro.add(lblFantasia);
        
        txtFantasia= new JTextField();
        txtFantasia.setBounds(90, 60, 260, 22);
        painelCadastro.add(txtFantasia);        
         
        
        
          //---------------CNPJ / CPF-----------------//
         
        lblCNPJ = new JLabel("CNPJ: ");
        lblCNPJ.setBounds(50, 90, 120, 22);
        painelCadastro.add(lblCNPJ);
        
        txtCNPJ = new JTextField();
        txtCNPJ.setBounds(90, 90, 260, 22);
        painelCadastro.add(txtCNPJ);
        
         //---------------INSCRIÇÃO ESTADUAL-----------------//
         
        lblIE = new JLabel("I.E: ");
        lblIE.setBounds(70, 120, 120, 22);
        painelCadastro.add(lblIE);
        
        txtIE = new JTextField();
        txtIE.setBounds(90, 120, 260, 22);
        painelCadastro.add(txtIE);     
        
        
        //----------------ENDERECO---------------//
        lblEndereco = new JLabel("Endereço: ");
        lblEndereco.setBounds(25, 150, 70, 22);
        painelCadastro.add(lblEndereco);
        
        txtEndereco = new JTextField();
        txtEndereco.setBounds(90, 150, 260, 22);
        painelCadastro.add(txtEndereco);     
        
        
          //----------------BAIRRO---------------//
        lblBairro = new JLabel("Bairro: ");
        lblBairro.setBounds(45, 180, 125, 22);
        painelCadastro.add(lblBairro);
        
        txtBairro = new JTextField();
        txtBairro.setBounds(90, 180, 170, 22);
        painelCadastro.add(txtBairro);
        
        
         //----------------CIDADE ---------------//
        lblCidade = new JLabel("Cidade: ");
        lblCidade.setBounds(40, 210, 150, 22);
        painelCadastro.add(lblCidade);
        
        txtCidade = new JTextField();
        txtCidade.setBounds(90, 210, 170, 22);
        painelCadastro.add(txtCidade);
        
        
         //----------------ESTADO---------------//
        lblEstado = new JLabel("UF: ");
        lblEstado.setBounds(280, 210, 50, 22);
        painelCadastro.add(lblEstado);
        
        txtEstado = new JTextField();
        txtEstado.setBounds(305, 210, 40, 22);
        painelCadastro.add(txtEstado);
        
         //----------------CEP---------------//
        lblCEP = new JLabel("CEP: ");
        lblCEP.setBounds(55, 240, 70, 22);
        painelCadastro.add(lblCEP);
        
        txtCEP = new JTextField();
        txtCEP.setBounds(90, 240, 90, 22);
        painelCadastro.add(txtCEP);      
       
        
        
        //----------------TELEFONE---------------//
        lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(190, 240, 80, 22);
        painelCadastro.add(lblTelefone);
        
        txtTelefone = new JTextField();
        txtTelefone.setBounds(245, 240, 100, 22);
        painelCadastro.add(txtTelefone);
        
          
        //------------CRIANDO PAINEL PARAMETRO ----------------//
        
        painelParametro = new JPanel();
        painelParametro.setLayout(null);        
        painelParametro.setBorder(BorderFactory.createTitledBorder("Parametro"));
        painelParametro.setBounds(390,0 , 110, 80);
        janela.add(painelParametro);
        
        
        
         //----------------BONIFICAÇÃO---------------//
         
        lblBonificacao = new JLabel("Bonificação ");
        lblBonificacao.setBounds(20, 20, 100, 22);
        painelParametro.add(lblBonificacao);
        
        txtbonificacao = new JTextField();
        txtbonificacao.setBounds(20, 45, 70, 22);
        painelParametro.add(txtbonificacao);  
        
        
        // ---------------- BOTAO GRAVAR-----//
        btnGravar = new JButton("Gravar");
       btnGravar.setBounds(400, 160, 90, 25);       
       btnGravar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       janela.add(btnGravar);
       
       
        // ---------------- BOTAO ALTERAR-----//
        btnAlterar = new JButton("Alterar");
       btnAlterar.setBounds(400, 190, 90, 25);       
       btnAlterar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       janela.add(btnAlterar);
        
          // ---------------- BOTAO CANCELAR-----//
       btnCancelar = new JButton("Cancelar");
       btnCancelar.setBounds(400, 220, 90, 25);       
       btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        
       janela.add(btnCancelar);
        
         // ---------------- BOTAO SAIR-----//
       btnSair = new JButton("Sair");
       btnSair.setBounds(400, 250, 90, 25);       
       btnSair.setHorizontalTextPosition(SwingConstants.RIGHT);        
       janela.add(btnSair);
         
       
          janela.setVisible(true);
    }
         
        
}
