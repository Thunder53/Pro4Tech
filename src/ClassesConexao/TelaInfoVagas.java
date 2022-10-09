package ClassesConexao;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

public class TelaInfoVagas extends JFrame {

	private JPanel contentPane;
	private JTable tbVaga;
	private JTextField tfNomeVaga;
	private JTable tbDescVaga;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInfoVagas frame = new TelaInfoVagas();
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
	public TelaInfoVagas() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconPro4Tech.jpg"));
		lblNewLabel.setBounds(0, 0, 553, 90);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("VOCÊ ESTÁ NA PÁGINA DE VISUALIZAÇÃO DE VAGAS!");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(144, 138, 634, 33);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("CANDIDATAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBackground(new Color(255, 128, 64));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.setBounds(645, 746, 247, 60);
		contentPane.add(btnNewButton);
		
		JButton btnBuscar = new JButton("BUSCAR VAGAS");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = Conexao.faz_conexao();
					String sql = "select * from Vagas";
					PreparedStatement stmt = con.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery();
					
					
					DefaultTableModel modelo = (DefaultTableModel) tbVaga.getModel();
					modelo.setNumRows(0);
					
					while (rs.next()) {
						modelo.addRow(new Object[] {rs.getString("nome_vaga")});
					}
					rs.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnBuscar.setForeground(Color.BLACK);
		btnBuscar.setFont(new Font("Arial", Font.BOLD, 18));
		btnBuscar.setBackground(new Color(255, 128, 64));
		btnBuscar.setBounds(1228, 319, 241, 43);
		contentPane.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Arial", Font.PLAIN, 18));
		scrollPane.setBounds(321, 384, 878, 101);
		contentPane.add(scrollPane);
		
		tbVaga = new JTable();
		tbVaga.setSelectionForeground(Color.WHITE);
		tbVaga.setBackground(Color.WHITE);
		tbVaga.setFont(new Font("Arial", Font.PLAIN, 20));
		tbVaga.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"VAGAS"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tbVaga.getColumnModel().getColumn(0).setMinWidth(50);
		scrollPane.setViewportView(tbVaga);
		
		tfNomeVaga = new JTextField();
		tfNomeVaga.setFont(new Font("Arial", Font.PLAIN, 18));
		tfNomeVaga.setBounds(321, 321, 878, 43);
		contentPane.add(tfNomeVaga);
		tfNomeVaga.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("APERTE NO BOTÃO DE BUSCAR PARA VIZUALIZAR AS VAGAS ABERTAS!");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(144, 166, 840, 33);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("DIGITE A VAGA DESEJADA E APERTE O BOTÃO CANDIDATAR OU VISUZALIZAR!");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(144, 243, 910, 33);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnVizualizar = new JButton("VIZUALIZAR");
		btnVizualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					CadastroVaga c1 = new CadastroVaga();
					c1.setNome_vaga(tfNomeVaga.getText());
					try {
					
					Connection con = Conexao.faz_conexao();
					System.out.println(c1.getNome_vaga());
					String sql = "select nome_vaga, carga_horaria, requisitos, escolaridade from Vagas where nome_vaga = '" + c1.getNome_vaga() + "'";
					PreparedStatement stmt = con.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery();
					
					
					DefaultTableModel modelo = (DefaultTableModel) tbDescVaga.getModel();
					modelo.setNumRows(0);
					
					while (rs.next()) {
						modelo.addRow(new Object[] {rs.getString("nome_vaga"), rs.getString("carga_horaria"), rs.getString("requisitos"), rs.getString("escolaridade") });
					}
					rs.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnVizualizar.setForeground(Color.BLACK);
		btnVizualizar.setFont(new Font("Arial", Font.BOLD, 18));
		btnVizualizar.setBackground(new Color(255, 128, 64));
		btnVizualizar.setBounds(1228, 441, 241, 43);
		contentPane.add(btnVizualizar);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setFont(new Font("Arial", Font.PLAIN, 20));
		scrollPane_1.setBounds(321, 513, 878, 187);
		contentPane.add(scrollPane_1);
		
		tbDescVaga = new JTable();
		tbDescVaga.setBackground(Color.WHITE);
		tbDescVaga.setFont(new Font("Arial", Font.PLAIN, 20));
		tbDescVaga.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NOME VAGA", "CARGA HOR\u00C1RIA", "REQUISITOS", "ESCOLARIDADE"
			}
		));
		scrollPane_1.setViewportView(tbDescVaga);
	}
}
