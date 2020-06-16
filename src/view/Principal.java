
package view;

import java.awt.MenuItem;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class Principal {
    
    private JFrame janela;
    private JMenuBar barra;
    private JMenu cadastro, vendas, compras, lavacao,cliente; 
    private JMenuItem clientes,relatorio, relatorioCred, produtoforn, fornecedor, produtos,motorista,sacarias,camarafria,tabela,funcionarios,empresa,sair,teste;
    private JPanel painelIcon;
    
   
    
    public void desenharTela(){
        
        
        janela = new JFrame("JPSYSTEM");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janela.setLayout(null);
        janela.setLocationRelativeTo(null);
        
       
        // ---------------CRIANDO BARRA DO MENU--------------// 
        barra = new JMenuBar();
        
        // ---------------CRIANDO O MENU --------------//
        
        
        
        
        cadastro = new JMenu("Cadastros");       
        vendas = new JMenu("Vendas");
        compras = new JMenu("Compras");
        lavacao = new JMenu("Lavação");
        
        //----------- CRIANDO PAINEL ICONES -----------------------//
        
        painelIcon = new JPanel();
        painelIcon.setLayout(null);
        painelIcon.setSize(1500,45);
        painelIcon.setBorder(BorderFactory.createTitledBorder(""));
        janela.add(painelIcon);
        
        painelIcon.setVisible(true);
            
        // ---------------CRIANDO O SUB MENU--------------//
         cliente = new JMenu("Cliente");      
         clientes = new JMenuItem("Clientes");
         relatorio = new JMenuItem("Relatório");
         relatorioCred= new JMenuItem("Relatório Limite de Crédito");
         
         cliente.add(clientes);
         cliente.add(relatorio);
         cliente.add(relatorioCred);
         
          //----------CHAMANDO CADASTRO DE CLIENTE----------------//
         clientes.addActionListener((java.awt.event.ActionEvent evt)->{
             ConsultaCliente cadConsCliente = new ConsultaCliente();
             cadConsCliente.desenharTela(); 
             
         });
         
        
         produtoforn = new JMenuItem("Produto/Fornecedor");
         fornecedor = new JMenuItem("Fornecedor");
         produtos = new JMenuItem("Produtos");
         motorista = new JMenuItem("Motorista");
         sacarias = new JMenuItem("Sacarias");
         camarafria = new JMenuItem("Câmara Fria");
         tabela = new JMenuItem("Tabelas");
         
         
         funcionarios = new JMenuItem("Funcionários");         
          //----------CHAMANDO CADASTRO DE FUNCIONARIO----------------//
         funcionarios.addActionListener((java.awt.event.ActionEvent evt)->{
             CadastroFuncionario cadFuncionario = new CadastroFuncionario();
             cadFuncionario.desenharTela();   
          });
         
         
         empresa = new JMenuItem("Empresa"); 
         //----------CHAMANDO CADASTRO DE EMPRESA----------------//
         empresa.addActionListener((java.awt.event.ActionEvent evt)->{
             CadastroEmpresa cadEmpresa = new CadastroEmpresa();
             cadEmpresa.desenharTela();         
         });
         sair = new JMenuItem("Sair");
         
         
        barra.add(cadastro);
        barra.add(vendas);
        barra.add(compras);
        barra.add(lavacao);
     
        teste = new JMenuItem("te11ste");
        
        
        
        //------------------- ADICIONANDO OS COMPONENTES AO SUB MENU  ------------------//
        
        cadastro.add(cliente);        
        cadastro.add(produtoforn);
        cadastro.add(fornecedor);
        cadastro.add(produtos);
        cadastro.add(motorista);
        cadastro.add(sacarias);
        cadastro.add(camarafria);
        cadastro.add(tabela);
        cadastro.add(funcionarios);
        cadastro.add(empresa);
        cadastro.add(sair);
        
        
        janela.setJMenuBar(  barra );
        janela.setVisible(true);
    }
    
}
