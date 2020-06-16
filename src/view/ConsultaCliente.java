/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Guilherme
 */
public class ConsultaCliente {

    private JFrame janela;
    private JPanel painelConsultaCliente, painelPequisa;
    private JTable tblCliente;
    private JScrollPane scrollTable;
    private DefaultTableModel modelo;
    private JButton btnExcluir,btnAlterar,btnNovo,btnSair;
    private ButtonGroup groupPesquisa;
    private JRadioButton rdInicio,rdParte;
    private JLabel lblConsulta;
    private JTextField txtConsulta;

    public void desenharTela() {

        janela = new JFrame("Clientes");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(800, 410);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        painelConsultaCliente = new JPanel();
        painelConsultaCliente.setLayout(null);
        painelConsultaCliente.setSize(800, 410);
        painelConsultaCliente.setLocation(0, 0);
        
        criarTabela();
        
        btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(10, 317, 60, 53);
        btnExcluir.setFont(new Font("Arial", 0, 8));
        btnExcluir.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelConsultaCliente.add(btnExcluir);
        
        
        painelPequisa = new JPanel();
        painelPequisa.setLayout(null);
        painelPequisa.setBorder(BorderFactory.createTitledBorder("Pesquisa por:"));
        painelPequisa.setSize(120, 65);
        painelPequisa.setLocation(86, 307);
        
        rdInicio = new JRadioButton("Inicio do Nome");
        rdInicio.setBounds(8, 22, 100, 13);
        rdInicio.setFont(new Font("Arial", 0, 10));
        painelPequisa.add(rdInicio);
        
        rdParte = new JRadioButton("Parte do Nome");
        rdParte.setBounds(8, 40, 100, 13);
        rdParte.setFont(new Font("Arial", 0, 10));
        painelPequisa.add(rdParte);
        
        groupPesquisa = new ButtonGroup();
        groupPesquisa.add(rdInicio);
        groupPesquisa.add(rdParte);
        
        painelConsultaCliente.add(painelPequisa);
        
        lblConsulta = new JLabel("Nova Consulta:");
        lblConsulta.setBounds(220, 305, 150, 40);
        lblConsulta.setFont(new Font("Arial", 1, 12));
        painelConsultaCliente.add(lblConsulta);
        
        txtConsulta = new JTextField();
        txtConsulta.setBounds(220, 337, 325, 25);
        painelConsultaCliente.add(txtConsulta);
        
        btnAlterar = new JButton("Alterar");
        btnAlterar.setBounds(565, 317, 60, 53);
        btnAlterar.setFont(new Font("Arial", 0, 8));
        btnAlterar.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelConsultaCliente.add(btnAlterar);
        
        btnNovo = new JButton("Novo");
        btnNovo.setBounds(645, 317, 60, 53);
        btnNovo.setFont(new Font("Arial", 0, 8)); 
        btnNovo.addActionListener((java.awt.event.ActionEvent evt)->{
             CadastroCliente cadCliente = new CadastroCliente();
             cadCliente.desenharTela(); 
             janela.dispose();
        });
        painelConsultaCliente.add(btnNovo);
        
        btnSair = new JButton("Sair");
        btnSair.setBounds(725, 317, 60, 53);
        btnSair.setFont(new Font("Arial", 0, 8));
        btnSair.addActionListener((java.awt.event.ActionEvent evt) -> {  
        });
        painelConsultaCliente.add(btnSair);
        
        janela.add(painelConsultaCliente);
        janela.setVisible(true);

    }
    
    private void criarTabela() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        modelo.addColumn("Fone");
        modelo.addColumn("CNPJ/CPF");
        modelo.addColumn("I.E");
        modelo.addColumn("RG");
        modelo.addColumn("Endereço");
        modelo.addColumn("Cidade");
        modelo.addColumn("CEP");
        modelo.addColumn("UF");
        modelo.addColumn("Data Cadastro");
        modelo.addColumn("Observação");
        modelo.addColumn("Usuário");
        modelo.addColumn("FAX");
        modelo.addColumn("Celular");
        modelo.addColumn("Email");

        tblCliente = new JTable();
        tblCliente.setModel(modelo);
        tblCliente.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblCliente.getColumnModel().getColumn(1).setPreferredWidth(220);
        tblCliente.getColumnModel().getColumn(2).setPreferredWidth(220);
        tblCliente.getColumnModel().getColumn(3).setPreferredWidth(220);

        tblCliente.getTableHeader().setResizingAllowed(false);
        tblCliente.getTableHeader().setReorderingAllowed(false);

        JTableHeader cabecalho = tblCliente.getTableHeader();
        cabecalho.setFont(new Font("Arial", 1, 14));

        DefaultTableCellRenderer centralizaColunas = new DefaultTableCellRenderer();
        centralizaColunas.setHorizontalAlignment(SwingConstants.CENTER);
        tblCliente.getColumnModel().getColumn(0).setCellRenderer(centralizaColunas);
        tblCliente.getColumnModel().getColumn(1).setCellRenderer(centralizaColunas);
        tblCliente.getColumnModel().getColumn(2).setCellRenderer(centralizaColunas);
        tblCliente.getColumnModel().getColumn(3).setCellRenderer(centralizaColunas);

        tblCliente.setFont(new Font("Arial", 0, 14));

        scrollTable = new JScrollPane(tblCliente,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTable.setBounds(10, 20, 775, 280);
        tblCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        painelConsultaCliente.add(scrollTable);
    }
}
