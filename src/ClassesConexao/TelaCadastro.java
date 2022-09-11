package ClassesConexao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField tfnome;
	private JTextField tfemail;
	private JTextField tfcpf;
	private JPasswordField pfsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 530);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbfnome = new JLabel("NOME COMPLETO:");
		lbfnome.setFont(new Font("Arial", Font.PLAIN, 18));
		lbfnome.setBounds(26, 150, 168, 33);
		contentPane.add(lbfnome);
		
		JLabel lbfemail = new JLabel("E-MAIL:");
		lbfemail.setFont(new Font("Arial", Font.PLAIN, 18));
		lbfemail.setBounds(125, 197, 66, 33);
		contentPane.add(lbfemail);
		
		tfnome = new JTextField();
		tfnome.setFont(new Font("Arial", Font.PLAIN, 18));
		tfnome.setBounds(214, 150, 489, 33);
		contentPane.add(tfnome);
		tfnome.setColumns(10);
		
		tfemail = new JTextField();
		tfemail.setFont(new Font("Arial", Font.PLAIN, 18));
		tfemail.setColumns(10);
		tfemail.setBounds(214, 197, 489, 33);
		contentPane.add(tfemail);
		
		tfcpf = new JTextField();
		tfcpf.setFont(new Font("Arial", Font.PLAIN, 18));
		tfcpf.setColumns(10);
		tfcpf.setBounds(214, 248, 489, 33);
		contentPane.add(tfcpf);
		
		pfsenha = new JPasswordField();
		pfsenha.setFont(new Font("Arial", Font.PLAIN, 18));
		pfsenha.setBounds(214, 295, 489, 33);
		contentPane.add(pfsenha);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 18));
		lblCpf.setBounds(149, 248, 42, 33);
		contentPane.add(lblCpf);
		
		JLabel lblSenha = new JLabel("SENHA:");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 18));
		lblSenha.setBounds(125, 295, 76, 33);
		contentPane.add(lblSenha);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Connection con = Conexao.faz_conexao();
					String sql = "insert into dados_senhas(email, senha, nome, cpf) values (?, ?, ?, ?)";
					PreparedStatement stmt = con.prepareStatement(sql);
					stmt.setString(1, tfemail.getText());
					stmt.setString(2, new String(pfsenha.getPassword()));
					stmt.setString(3, tfnome.getText());
					stmt.setString(4, tfcpf.getText());
					stmt.execute();
					stmt.close();
					con.close();
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBackground(new Color(255, 140, 0));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.setBounds(328, 377, 170, 50);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\eclipse-workspace\\Pro4Tech\\src\\View\\img\\menorzinho.png"));
		lblNewLabel_1.setBounds(0, 0, 359, 60);
		contentPane.add(lblNewLabel_1);
	}

}
