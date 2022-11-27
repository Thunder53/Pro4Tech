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
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.event.AncestorListener;

import javax.swing.event.AncestorEvent;
import javax.swing.border.BevelBorder;

import javax.swing.event.AncestorEvent;

import javax.swing.border.BevelBorder;

import javax.swing.border.BevelBorder;

public class TelaStatusCandidato extends JFrame {
		
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String JLabel = null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaStatusCandidato frame = new TelaStatusCandidato();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	JLabel lblNewLabel = new JLabel("");
	JLabel lblNewLabel_1 = new JLabel("VOCÊ ESTÁ NA PÁGINA DE STATUS DE CANDIDATURA!\r\n\r\n");
	private final JTable tbStsCandidato = new JTable();

	private final JScrollPane scrollPane = new JScrollPane();
	private final JButton btnVoltar = new JButton("VOLTAR");
	private final JLabel lblNewLabel_1_1 = new JLabel("Em andamento!");
	private final JLabel lblNewLabel_1_1_1 = new JLabel("Concluida!");
	private JTable tbVaga;


	
	
	/**
	 * Create the frame.
	 */
	public TelaStatusCandidato() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setExtendedState(MAXIMIZED_BOTH);
		
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		lblNewLabel.setBounds(0, 0, 579, 109);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconPro4Tech.jpg"));
		getContentPane().add(lblNewLabel);
		lblNewLabel_1.setBounds(108, 119, 673, 46);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		getContentPane().add(lblNewLabel_1);
		scrollPane.setBackground(Color.LIGHT_GRAY);
		scrollPane.setForeground(new Color(255, 255, 255));
		scrollPane.setFont(new Font("Arial", Font.BOLD, 18));
		scrollPane.setBounds(242, 239, 1147, 194);
		
		contentPane.add(scrollPane);
		tbStsCandidato.setBackground(Color.WHITE);
		tbStsCandidato.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				try {
					
					Connection con = Conexao.faz_conexao();
					
					String sql = "select * from candidato_vaga where cpf = '" + Singleton.getInstance().cpfUsuario + "'";
					PreparedStatement stmt = con.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery();
					
					
					DefaultTableModel modelo = (DefaultTableModel) tbStsCandidato.getModel();
					modelo.setNumRows(0);
					
					while (rs.next()) {
						modelo.addRow(new Object[] {rs.getString("nome_vaga"), rs.getString("cpf"), rs.getString("status") });
					}
					rs.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		tbStsCandidato.setSelectionBackground(Color.LIGHT_GRAY);
		tbStsCandidato.setSelectionForeground(Color.BLACK);
		tbStsCandidato.setForeground(Color.BLACK);
		tbStsCandidato.setFont(new Font("Arial", Font.PLAIN, 15));
		tbStsCandidato.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Nome vaga", "Cpf", "Status"
			}
		));
		tbStsCandidato.getColumnModel().getColumn(0).setPreferredWidth(131);
		tbStsCandidato.getColumnModel().getColumn(1).setPreferredWidth(159);

		scrollPane.setViewportView(tbStsCandidato);

		scrollPane.setViewportView(tbStsCandidato);

		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaOpcoes exibir = new TelaOpcoes();
				exibir.setVisible(true);
				setVisible(false);
			}
		});
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 18));
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnVoltar.setBackground(new Color(255, 140, 0));
		btnVoltar.setBounds(10, 771, 156, 52);
		contentPane.add(btnVoltar);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(242, 192, 673, 46);
		
		contentPane.add(lblNewLabel_1_1);
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(242, 456, 673, 46);
		
		contentPane.add(lblNewLabel_1_1_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setForeground(Color.WHITE);
		scrollPane_1.setFont(new Font("Arial", Font.BOLD, 18));
		scrollPane_1.setBackground(Color.LIGHT_GRAY);
		scrollPane_1.setBounds(242, 530, 1147, 194);
		contentPane.add(scrollPane_1);
		
		tbVaga = new JTable();
		tbVaga.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				try {
					Connection con = Conexao.faz_conexao();
					
					String sql = "select * from inscricao where cpf = '" + Singleton.getInstance().cpfUsuario + "'";
					PreparedStatement stmt = con.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery();
					
					
					DefaultTableModel modelo1 = (DefaultTableModel) tbVaga.getModel();
					modelo1.setNumRows(0);
					
					while (rs.next()) {
						modelo1.addRow(new Object[] {rs.getString("nome_vaga"), rs.getString("avaliacao"), rs.getString("feedback_geral") });
					}
					rs.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		tbVaga.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Nome vaga", "Feedback", "Avalia\u00E7\u00E3o"
			}
		));
		tbVaga.getColumnModel().getColumn(0).setPreferredWidth(142);
		tbVaga.getColumnModel().getColumn(1).setPreferredWidth(182);
		tbVaga.setFont(new Font("Arial", Font.PLAIN, 10));
		scrollPane_1.setViewportView(tbVaga);

		
		
		DefaultTableModel modelo = (DefaultTableModel) tbStsCandidato.getModel();
		setLocationRelativeTo(null);
		
		
		}
	}

