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

import com.mysql.cj.protocol.a.StringValueEncoder;

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
		scrollPane.setBounds(279, 211, 1147, 218);
		
		contentPane.add(scrollPane);
		tbStsCandidato.setBackground(Color.WHITE);
		tbStsCandidato.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				try {
					
					Connection con = Conexao.faz_conexao();
					
					String sql = "select * from inscricao where cpf = '" + Singleton.getInstance().cpfUsuario + "'";
					PreparedStatement stmt = con.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery();
					
					
					DefaultTableModel modelo = (DefaultTableModel) tbStsCandidato.getModel();
					modelo.setNumRows(0);
					
					while (rs.next()) {
						modelo.addRow(new Object[] {rs.getString("nome_vaga"), rs.getString("avaliacao"), rs.getString("feedback_pontual"), rs.getString("feedback_geral") });
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
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Nome vaga", "Status", "Motivo", "Feedback"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tbStsCandidato.getColumnModel().getColumn(0).setMinWidth(30);
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
		btnVoltar.setBackground(Color.ORANGE);
		btnVoltar.setBounds(10, 771, 156, 52);
		
		contentPane.add(btnVoltar);
		
		
		DefaultTableModel modelo = (DefaultTableModel) tbStsCandidato.getModel();
		setLocationRelativeTo(null);
		
		
		}
	}

