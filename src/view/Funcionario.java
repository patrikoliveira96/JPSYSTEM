
package view;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Funcionario {
    
    private JFrame janela;
    private JPanel painelCadastro, painelTipo, painelPermissao,painelComissao ;
    private JLabel lblCodigo, lblFuncionario, lblSenha;
    private JTextField txtCodigo, txtFuncionario, txtSenha;
    private JComboBox cbTipo;
    
    
    
    public void desenharTela(){
        
        
        janela = new JFrame("Cadastro de Funcionário"); 
         janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(560,645);
        janela.setLayout(null);
        janela.setLocationRelativeTo(null);
        
     //-------------- CRIANDO PAINEL --------------------//
         painelCadastro = new JPanel();
        painelCadastro.setLayout(null);
        painelCadastro.setSize(370,100);
        painelCadastro.setBorder(BorderFactory.createTitledBorder("Cadastro de Funcionário"));
        janela.add(painelCadastro);
        
        
        
        janela.setVisible(true);
        
        
        //---------------CODIGO-----------------//
         
        lblCodigo = new JLabel("Código: ");
        lblCodigo.setBounds(30, 30, 60, 22);
        painelCadastro.add(lblCodigo);
        
        txtCodigo = new JTextField();
        txtCodigo.setBounds(80, 30, 60, 22);
        painelCadastro.add(txtCodigo);
        
        
         //---------------FUNCIONARIO-----------------//
         
        lblFuncionario = new JLabel("Funcionário: ");
        lblFuncionario.setBounds(160, 30, 80, 22);
        painelCadastro.add(lblFuncionario);
        
        txtFuncionario = new JTextField();
        txtFuncionario.setBounds(240, 30, 110, 22);
        painelCadastro.add(txtFuncionario);
        
        
        //---------------SENHA-----------------//
         
        lblSenha = new JLabel("Senha: ");
        lblSenha.setBounds(30, 60, 80, 22);
        painelCadastro.add(lblSenha);
        
        txtSenha = new JTextField();
        txtSenha.setBounds(80, 60, 90, 22);
        painelCadastro.add(txtSenha);
        
        
        //------------CRIANDO PAINEL PARAMETRO ----------------//
        
        painelTipo = new JPanel();
        painelTipo.setLayout(null);        
        painelTipo.setBorder(BorderFactory.createTitledBorder("Tipo"));
        painelTipo.setBounds(0,110 , 200, 80);
        janela.add(painelTipo);
        
        
        //-------------COMBO TIPO---------------//
        cbTipo = new JComboBox();
        cbTipo.setBounds(20, 20, 60, 22);
        painelTipo.add(cbTipo);
        
    }
}
