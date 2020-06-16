
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
    //-------------------COMPONENTE DO MENU PRINCIPAL----------------//
    private JMenu Mcadastro, Mvendas, Mcompras, Mlavacao,Mmaquinacao,Mfrete,Msacarias,Mcheque,Mbalanco,Mcontapagar,Mcaixa,Mfluxo,Mfinanceiro,Mestoque,Mviagem,Mconfiguracao,Mnfe,Msobre,Msair; 
    
    //----------------COMPONENTES DO SUB MENU COM MAIS COMPONENTES-------------//
    private JMenu cliente,produtoforn, fornecedor, produtos,motorista,sacarias,camarafria,tabela,SCcadastro,CFestocagem;
    private JMenuItem Cclientes,Crelatorio, CrelatorioCred, ProdForn, relatProdForn,funcionarios,empresa,sair;
    
    private JMenuItem Ffornecedor, Frelatorio, Fcategoria;
    
    private JMenuItem Pproduto,Prelatorio;
    
    private JMenuItem MTmotorista,MTrelatorio;
    
    private JMenuItem SCroduto,SCrelatorio, SCcliente,SCsacarias;
    
     private JMenuItem CFestoq,CFrelatorio;
    
    
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
        
        
        Mcadastro = new JMenu("Cadastros");       
        Mvendas = new JMenu("Vendas");
        Mcompras = new JMenu("Compras");
        Mlavacao = new JMenu("Lavação");        
        Mmaquinacao = new JMenu("Maquinação");       
        Mfrete = new JMenu("Frete");
        Msacarias = new JMenu("Sacarias");
        Mcheque = new JMenu("Cheque");        
        Mbalanco = new JMenu("Balanço");       
        Mcontapagar = new JMenu("Contas a Pagar");
        Mcaixa = new JMenu("Caixa");
        Mfluxo = new JMenu("Fluxo");  
        Mfinanceiro = new JMenu("Financeiro");       
        Mestoque = new JMenu("Estoque");
        Mviagem = new JMenu("Viagem");
        Mconfiguracao = new JMenu("Configuração");
        Mnfe = new JMenu("NF-e");       
        Msobre = new JMenu("Sobre");
        Msair = new JMenu("Sair");
       
        
        //----------- CRIANDO PAINEL ICONES -----------------------//
        
        painelIcon = new JPanel();
        painelIcon.setLayout(null);
        painelIcon.setSize(1500,45);
        painelIcon.setBorder(BorderFactory.createTitledBorder(""));
        janela.add(painelIcon);
        
        painelIcon.setVisible(true);
            
        // ---------------CRIANDO O SUB MENU--------------//
         cliente = new JMenu("Cliente");      
         Cclientes = new JMenuItem("Clientes");
         Crelatorio = new JMenuItem("Relatório");
         CrelatorioCred= new JMenuItem("Relatório Limite de Crédito");
         
         cliente.add(Cclientes);
         cliente.add(Crelatorio);
         cliente.add(CrelatorioCred);
         
          //----------CHAMANDO CADASTRO DE CLIENTE----------------//
         Cclientes.addActionListener((java.awt.event.ActionEvent evt)->{
             ConsultaCliente cadConsCliente = new ConsultaCliente();
             cadConsCliente.desenharTela(); 
             
         });
         
        
         produtoforn = new JMenu("Produto/Fornecedor");
         ProdForn= new JMenuItem("Produto / Fornecedor");
         relatProdForn = new JMenuItem("Relatório");
         
         produtoforn.add(ProdForn);
         produtoforn.add(relatProdForn);
         
    
        
          fornecedor = new JMenu("Fornecedor");
          Ffornecedor = new JMenuItem("Fornecedores");
          Frelatorio = new JMenuItem("Relatório");
          Fcategoria = new JMenuItem("Categoria/Ramo Atividade");
          
          fornecedor.add(Ffornecedor);
          fornecedor.add(Frelatorio);
          fornecedor.add(Fcategoria);
          
          
         produtos = new JMenu("Produtos");
         Pproduto = new JMenuItem("Produtos");
         Prelatorio = new JMenuItem("Relatório");
         
         produtos.add(Pproduto);
         produtos.add(Prelatorio);
         
         motorista = new JMenu("Motorista");
         MTmotorista = new JMenuItem("Motorista");
         MTrelatorio = new JMenuItem("Relatório");
         
         motorista.add(MTmotorista);
         motorista.add(MTrelatorio);
         
         sacarias = new JMenu("Sacarias");      
         SCcadastro = new JMenu("Cadastro");   
         SCcliente= new JMenuItem("Cliente");
         SCsacarias = new JMenuItem("Sacarias");
         SCrelatorio = new JMenuItem("Relatório de Estoque");
         
         
         
         sacarias.add(SCcadastro);
         sacarias.add(SCrelatorio);
         SCcadastro.add(SCcliente);
         SCcadastro.add(SCsacarias);
         
         camarafria = new JMenu("Câmara Fria");
         CFestocagem = new JMenu("Estocagem");
         
         tabela = new JMenu("Tabelas");
         
         
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
         
        //------ MENU BARRA ----------------// 
        barra.add(Mcadastro);
        barra.add(Mvendas);
        barra.add(Mcompras);
        barra.add(Mlavacao);
        barra.add(Mmaquinacao);
        barra.add(Mfrete);
        barra.add(Msacarias);
        barra.add(Mcheque); 
        barra.add(Mbalanco);
        barra.add(Mcontapagar);
        barra.add(Mcaixa);
        barra.add(Mfluxo);
        barra.add(Mfinanceiro);
        barra.add(Mestoque);
        barra.add(Mviagem);
        barra.add(Mconfiguracao);
        barra.add(Mnfe);
        barra.add(Msobre);
        barra.add(Msair);
        
        
        
        
        
        //------------------- ADICIONANDO OS COMPONENTES AO SUB MENU  ------------------//
        
        Mcadastro.add(cliente);        
        Mcadastro.add(produtoforn);
        Mcadastro.add(fornecedor);
        Mcadastro.add(produtos);
        Mcadastro.add(motorista);
        Mcadastro.add(sacarias);
        Mcadastro.add(camarafria);
        Mcadastro.add(tabela);
        Mcadastro.add(funcionarios);
        Mcadastro.add(empresa);
        Mcadastro.add(sair);
        
        
        janela.setJMenuBar(  barra );
        janela.setVisible(true);
    }
    
}
