package ClassesConexao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class TelaDescVaga extends JFrame {

	private JPanel contentPane;
	private JTable tbVagas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDescVaga frame = new TelaDescVaga();
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
	public TelaDescVaga() {
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconPro4Tech.jpg"));
		lblNewLabel.setBounds(0, 0, 579, 109);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("VOCÊ ESTÁ NA PÁGINA DE VISUALIZAÇÃO DE VAGAS!\r\n\r\n");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(153, 164, 673, 46);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(400, 292, 850, 94);
		contentPane.add(scrollPane);
		
		tbVagas = new JTable();
		tbVagas.setBorder(new LineBorder(new Color(0, 0, 0)));
		tbVagas.setForeground(Color.BLACK);
		tbVagas.setBackground(new Color(255, 204, 51));
		tbVagas.setCellSelectionEnabled(true);
		tbVagas.setFont(new Font("Arial", Font.PLAIN, 20));
		tbVagas.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"VAGA", "CARGA HOR\u00C1RIA", "REQUISITOS", "ESCOLARIDADE"
			}
		));
		scrollPane.setViewportView(tbVagas);
		
		JButton btnNewButton_1 = new JButton("VISUALIZAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CadastroVaga c1 = new CadastroVaga();
					Connection con = Conexao.faz_conexao();
					System.out.println(c1.getNome_vaga());
					String sql = "select nome_vaga, carga_horaria, requisitos, escolaridade from Vagas where nome_vaga = " + c1.getNome_vaga() + "'";
					PreparedStatement stmt = con.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery();
					
					
					DefaultTableModel modelo = (DefaultTableModel) tbVagas.getModel();
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
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_1.setBackground(new Color(255, 140, 0));
		btnNewButton_1.setBounds(734, 551, 210, 71);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("CASO ESTEJA TUDO CERTO CLIQUE EM \"CANDIDATAR\"");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_3.setBounds(153, 218, 732, 33);
		contentPane.add(lblNewLabel_3);
	}
}
