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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
<<<<<<< HEAD
import javax.swing.border.BevelBorder;
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
import javax.swing.border.BevelBorder;
>>>>>>> afe0cdae6d49d8007ca0ed4ba6870dd284a2e912
=======
import javax.swing.border.BevelBorder;


public class TelaVagasCandidato extends JFrame {

	private JPanel contentPane;
	private JTable tbCandidato;
	private JTextField tfCandidato;

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
		contentPane.setForeground(Color.BLACK);
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
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(89, 158, 569, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SELECIONE ABAIXO A VAGA PARA INICIAR O PROCESSO");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(89, 187, 569, 33);
		contentPane.add(lblNewLabel_1_1);
		
		JComboBox cbxVaga = new JComboBox();			
		cbxVaga.setForeground(Color.BLACK);
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
		cbxVaga.setBounds(541, 289, 400, 45);
		contentPane.add(cbxVaga);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(247, 375, 950, 352);
		contentPane.add(scrollPane);
		
		tbCandidato = new JTable();
		tbCandidato.setForeground(Color.BLACK);
		tbCandidato.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				tfCandidato.setText(tbCandidato.getValueAt(tbCandidato.getSelectedRow(), 0).toString());
			}
		});
		tbCandidato.setBackground(Color.WHITE);
		tbCandidato.setFont(new Font("Arial", Font.PLAIN, 13));
		tbCandidato.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NOME", "DATA DE NASCIMENTO", "EMAIL", "TELEFONE"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tbCandidato.getColumnModel().getColumn(0).setResizable(false);
		tbCandidato.getColumnModel().getColumn(0).setPreferredWidth(225);
		tbCandidato.getColumnModel().getColumn(1).setResizable(false);
		tbCandidato.getColumnModel().getColumn(1).setPreferredWidth(141);
		tbCandidato.getColumnModel().getColumn(2).setResizable(false);
		tbCandidato.getColumnModel().getColumn(2).setPreferredWidth(266);
		tbCandidato.getColumnModel().getColumn(3).setResizable(false);
		scrollPane.setViewportView(tbCandidato);
		
		JButton btnNewButton = new JButton("CANDIDATOS");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Object vaga = cbxVaga.getSelectedItem();
				Singleton.getInstance().nomeVaga = vaga.toString();
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
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2.setBounds(453, 289, 87, 45);
		contentPane.add(lblNewLabel_2);
		
		JButton btnVisualizarCurrculo = new JButton("VISUALIZAR CURRÍCULO");
		btnVisualizarCurrculo.setForeground(Color.BLACK);
		btnVisualizarCurrculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Singleton.getInstance().Candidato = tfCandidato.getText();
				TelaVisualizacaoCurriculo exibir = new TelaVisualizacaoCurriculo();
				exibir.setVisible(true);
				setVisible(false);
			}
		});
		btnVisualizarCurrculo.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnVisualizarCurrculo.setBackground(Color.ORANGE);
		btnVisualizarCurrculo.setBounds(900, 759, 297, 45);
		contentPane.add(btnVisualizarCurrculo);
		
		JLabel lblNewLabel_2_1 = new JLabel("Candidato:");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(247, 760, 104, 45);
		contentPane.add(lblNewLabel_2_1);
		
		tfCandidato = new JTextField();
		tfCandidato.setForeground(Color.BLACK);
		tfCandidato.setFont(new Font("Arial", Font.BOLD, 18));
		tfCandidato.setEditable(false);
		tfCandidato.setBounds(361, 760, 318, 45);
		contentPane.add(tfCandidato);
		tfCandidato.setColumns(10);

		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaOpcoesFuncionario exibir = new TelaOpcoesFuncionario();
				exibir.setVisible(true);
				setVisible(false);
			}
		});
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 18));
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnVoltar.setBackground(Color.ORANGE);
		btnVoltar.setBounds(10, 774, 156, 52);
		contentPane.add(btnVoltar);

	}
}
