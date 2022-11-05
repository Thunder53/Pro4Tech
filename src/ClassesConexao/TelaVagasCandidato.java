package ClassesConexao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class TelaVagasCandidato extends JFrame {

	private JPanel contentPane;
	private JTable tbCandidato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVagasCandidato frame = new TelaVagasCandidato();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaVagasCandidato() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		setExtendedState(MAXIMIZED_BOTH);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconPro4Tech.jpg"));
		lblNewLabel.setBounds(0, 0, 553, 90);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("VOCÊ ESTÁ NA PÁGINA DE AVALIAÇÃO DE CANDIDATOS");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(89, 158, 569, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SELECIONE ABAIXO A VAGA PARA INICIAR O PROCESSO");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(89, 187, 569, 33);
		contentPane.add(lblNewLabel_1_1);
		
		JComboBox cbxVaga = new JComboBox();
		cbxVaga.setFont(new Font("Arial", Font.PLAIN, 18));
		cbxVaga.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				 vagasDAO dao = new vagasDAO();   
			     ArrayList <String> vgc = dao.vagas();
			        
			        for(String f:vgc){
			            cbxVaga.addItem(f);
			        }
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		cbxVaga.setBounds(517, 288, 400, 45);
		contentPane.add(cbxVaga);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(332, 375, 773, 311);
		contentPane.add(scrollPane);
		
		tbCandidato = new JTable();
		tbCandidato.setBackground(Color.WHITE);
		tbCandidato.setFont(new Font("Arial", Font.PLAIN, 13));
		tbCandidato.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NOME", "DATA DE NASCIMENTO", "EMAIL", "TELEFONE"
			}
		));
		tbCandidato.getColumnModel().getColumn(1).setPreferredWidth(139);
		tbCandidato.getColumnModel().getColumn(2).setPreferredWidth(246);
		tbCandidato.getColumnModel().getColumn(3).setPreferredWidth(114);
		scrollPane.setViewportView(tbCandidato);
		
		JButton btnNewButton = new JButton("CANDIDATOS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Object vaga = cbxVaga.getSelectedItem();
				try {
				
				Connection con = Conexao.faz_conexao();
				
				String sql = "select cpf from candidato_vaga where nome_vaga = '" + vaga + "'";
				PreparedStatement stmt = con.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();
				
				
				DefaultTableModel modelo = (DefaultTableModel) tbCandidato.getModel();
				modelo.setNumRows(0);
				
				while (rs.next()) {
					Connection con1 = Conexao.faz_conexao();
					String sql1 = "select * from cadastro_usuario where cpf = '" + rs.getString("cpf") + "'";
					PreparedStatement stmt1 = con.prepareStatement(sql1);
					ResultSet rs1 = stmt1.executeQuery();
					while(rs1.next()) {
						modelo.addRow(new Object[] {rs1.getString("nome"), rs1.getString("data_nasc"), rs1.getString("email"), rs1.getString("telefone") });
					}
					rs1.close();
					con1.close();
				}
				rs.close();
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnNewButton.setBounds(1160, 288, 180, 45);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("VAGAS");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2.setBounds(420, 288, 87, 45);
		contentPane.add(lblNewLabel_2);
		
		JButton btnVisualizarCurrculo = new JButton("VISUALIZAR CURRÍCULO");
		btnVisualizarCurrculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVisuCurriculo exibir = new TelaVisuCurriculo();
				exibir.setVisible(true);
				setVisible(false);
			}
		});
		btnVisualizarCurrculo.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnVisualizarCurrculo.setBackground(Color.ORANGE);
		btnVisualizarCurrculo.setBounds(566, 759, 297, 45);
		contentPane.add(btnVisualizarCurrculo);
	}
}
