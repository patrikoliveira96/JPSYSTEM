package view;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Funcionario {

    private JFrame janela;
    private JPanel painelCadastro, painelTipo, painelPermissao, painelComissao;
    private JLabel lblCodigo, lblFuncionario, lblSenha, lblComissao;
    private JTextField txtCodigo, txtFuncionario, txtSenha, txtComissao;
    private JComboBox cbTipo;

    //-------------PAINEL COM ABAS-----------//
    private JPanel cadastro, baixa, alteracao, exclusao, visualizacao;

    //----------------ABA CADASTRO---------------//
    private JCheckBox cadProduto, cadCliente, cadProdForn, cadFornecedor, cadMotorista;
    private JCheckBox fluxoCaixa, cadCheque, cadProdutoEst, liberResCaixa, liberFinanceira, libeCaixa, Tabelas;

    //----------------ABA BAIXA---------------//
    private JCheckBox baixaCompra, baixaContasPag, baixaFrete, baixaLavacao, baixaMaquinacao;
    private JCheckBox baixaSaidaSac, baixaEntradaSac, baixaCamaraFria, baixaCompraDiv, baixaVendaDiv;

    //----------------ABA ALTERAÇÃO---------------//
    //----------------ABA EXCLUSAO---------------//
    //----------------ABA VISUALIZAÇÃO---------------//
    public void desenharTela() {

        janela = new JFrame("Cadastro de Funcionário");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(560, 645);
        janela.setLayout(null);
        janela.setLocationRelativeTo(null);

        //-------------- CRIANDO PAINEL --------------------//
        painelCadastro = new JPanel();
        painelCadastro.setLayout(null);
        painelCadastro.setSize(370, 100);
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
        painelTipo.setBounds(0, 110, 220, 80);
        janela.add(painelTipo);

        //-------------COMBO TIPO---------------//
        cbTipo = new JComboBox();
        cbTipo.setBounds(20, 30, 140, 22);
        painelTipo.add(cbTipo);

        //------------CRIANDO PAINEL COMISSAO ----------------//
        painelComissao = new JPanel();
        painelComissao.setLayout(null);
        painelComissao.setBorder(BorderFactory.createTitledBorder("Comissão %"));
        painelComissao.setBounds(220, 110, 150, 80);
        janela.add(painelComissao);

        //----------------BONIFICAÇÃO---------------//
        txtComissao = new JTextField();
        txtComissao.setBounds(20, 30, 110, 22);
        painelComissao.add(txtComissao);

        //------------CRIANDO PAINEL PERMISSAO ----------------//
        /* painelPermissao = new JPanel();
        painelPermissao.setLayout(null);        
        painelPermissao.setBorder(BorderFactory.createTitledBorder("Permissões"));
        painelPermissao.setBounds(0,200 , 500, 500);
        janela.add(painelPermissao);*/
        //----------- PAINEL COM ABAS-----------------//
        cadastro = new JPanel();
        cadastro.setLayout(null);
        cadastro.setSize(680, 500);

        baixa = new JPanel();
        baixa.setLayout(null);
        baixa.setSize(680, 500);

        alteracao = new JPanel();
        alteracao.setLayout(null);
        alteracao.setSize(680, 500);

        exclusao = new JPanel();
        exclusao.setLayout(null);
        exclusao.setSize(680, 500);

        visualizacao = new JPanel();
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(0, 250, 450, 300);
        tp.add("Cadastro", cadastro);
        tp.add("Baixa", baixa);
        tp.add("Alteração", alteracao);
        tp.add("Exclusão", exclusao);
        tp.add("Visualização", visualizacao);

        janela.add(tp);

        //----------------ABA CADASTRO---------------//
        //-------------CHECKBOX CADASTRO DE PRODUTO----------//
        cadProduto = new JCheckBox("Cad.Produtos");
        cadProduto.setBounds(10, 10, 120, 22);
        cadastro.add(cadProduto);

        //-------------CHECKBOX CADASTRO DE CLIENTE----------//
        cadCliente = new JCheckBox("Cad.Clientes");
        cadCliente.setBounds(10, 30, 120, 22);
        cadastro.add(cadCliente);

        //-------------CHECKBOX CADASTRO DE PRODUTO/ FORNECEDOR----------//
        cadProdForn = new JCheckBox("Cad.Produto/Fornecedor");
        cadProdForn.setBounds(10, 50, 170, 22);
        cadastro.add(cadProdForn);

        //-------------CHECKBOX CADASTRO FORNECEDOR----------//
        cadFornecedor = new JCheckBox("Cad.Fornecedor");
        cadFornecedor.setBounds(10, 70, 120, 22);
        cadastro.add(cadFornecedor);

        //-------------CHECKBOX CADASTRO MOTORISTA----------//
        cadMotorista = new JCheckBox("Cad.Motorista");
        cadMotorista.setBounds(10, 90, 120, 22);
        cadastro.add(cadMotorista);

        //-------------CHECKBOX CADASTRO CAIXA----------//
        fluxoCaixa = new JCheckBox("Fluxo de Caixa");
        fluxoCaixa.setBounds(10, 110, 120, 22);
        cadastro.add(fluxoCaixa);

        //-------------CHECKBOX CADASTRO CHEQUE----------//
        cadCheque = new JCheckBox("Cad.Cheque");
        cadCheque.setBounds(190, 10, 120, 22);
        cadastro.add(cadCheque);

        //-------------CHECKBOX CADASTRO DE PRODUTO ESTOQUE----------//
        cadProdutoEst = new JCheckBox("Cad.Produ Estoque");
        cadProdutoEst.setBounds(190, 30, 140, 22);
        cadastro.add(cadProdutoEst);

        //-------------CHECKBOX CADASTRO DE RESTRIÇÃO CAIXA----------//
        liberResCaixa = new JCheckBox("Liberação Restrição Caixa");
        liberResCaixa.setBounds(190, 50, 190, 22);
        cadastro.add(liberResCaixa);

        //-------------CHECKBOX LIBERAÇÃO FINANCEIRA----------//
        liberFinanceira = new JCheckBox("Liberação Financeira");
        liberFinanceira.setBounds(190, 70, 160, 22);
        cadastro.add(liberFinanceira);

        //-------------CHECKBOX LIBERAÇÃO CAIXA----------//
        libeCaixa = new JCheckBox("Liberação Caixa");
        libeCaixa.setBounds(190, 90, 160, 22);
        cadastro.add(libeCaixa);

        //-------------CHECKBOX CADASTRO DE TABELAS----------//
        Tabelas = new JCheckBox("Tabelas");
        Tabelas.setBounds(190, 110, 140, 22);
        cadastro.add(Tabelas);

        //----------------ABA BAIXA---------------//
        //-------------CHECKBOX BAIXA COMPRAS----------//
        baixaCompra = new JCheckBox("Baixa Compra");
        baixaCompra.setBounds(10, 20, 120, 22);
        baixa.add(baixaCompra);

        //-------------CHECKBOX BAIXA CONTAS A PAGAR----------//
        baixaContasPag = new JCheckBox("Baixa Contas a Pagar");
        baixaContasPag.setBounds(0, 0, 0, 00);
        alteracao.add(baixaContasPag);

    }
}
