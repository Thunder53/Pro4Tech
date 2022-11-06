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
		
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		lblNewLabel.setBounds(0, 0, 579, 109);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconPro4Tech.jpg"));
		getContentPane().add(lblNewLabel);
		lblNewLabel_1.setBounds(108, 119, 673, 46);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		getContentPane().add(lblNewLabel_1);
		scrollPane.setBackground(new Color(255, 128, 0));
		scrollPane.setForeground(new Color(255, 255, 255));
		scrollPane.setFont(new Font("Tahoma", Font.BOLD, 16));
		scrollPane.setBounds(108, 211, 1147, 265);
		
		contentPane.add(scrollPane);
		tbStsCandidato.setBackground(Color.ORANGE);
		tbStsCandidato.setSelectionBackground(Color.ORANGE);
		tbStsCandidato.setSelectionForeground(Color.BLACK);
		tbStsCandidato.setForeground(Color.BLACK);
		tbStsCandidato.setFont(new Font("Arial", Font.PLAIN, 18));
		tbStsCandidato.setModel(new DefaultTableModel(
			new Object[][] {
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
		scrollPane.setViewportView(tbStsCandidato);
		
		
		DefaultTableModel modelo = (DefaultTableModel) tbStsCandidato.getModel();
		setLocationRelativeTo(null);
		
		
			try {
				Connection con = Conexao.faz_conexao();
				
				String sql1 = "select * from Inscricao";
				PreparedStatement stmt = con.prepareStatement(sql1);
				stmt.getString(2, c1.getAvaliacao());
				stmt.getString(3, c1.getStatus_vaga());
				stmt.getString(4, c1.getFeedback_pontual());
				stmt.getString(6, c1.getFeedback_geral());
				ResultSet rs = stmt.executeQuery();
				
				String sql2 = "select * from Vagas";
				PreparedStatement stmt = con.prepareStatement(sql2);
				stmt.getString(2, c1.getNome_vaga());
				ResultSet rs = stmt.executeQuery();
				
			} catch (SQLException e1) {
				e1.printStackTrace();
		}
	}
}
