package ClassesConexao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;

public class TelaCadastro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfnome;
	private JTextField tfemail;
	private JTextField tfcpf;
	private JPasswordField pfsenha;
	private JTextField tfdatanasc;
	private JTextField tfcargo;
	private JTextField tfexperiencia;
	private JTextField tfprentensaosalarial;
	private JTextField tfformaçao;
	private JTextField tftelefone;

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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lbfnome = new JLabel("NOME COMPLETO:");
		lbfnome.setForeground(Color.BLACK);
		lbfnome.setFont(new Font("Arial", Font.PLAIN, 18));
		lbfnome.setBounds(61, 193, 168, 33);
		contentPane.add(lbfnome);
		
		JLabel lbfemail = new JLabel("E-MAIL:");
		lbfemail.setForeground(Color.BLACK);
		lbfemail.setFont(new Font("Arial", Font.PLAIN, 18));
		lbfemail.setBounds(933, 236, 66, 33);
		contentPane.add(lbfemail);
		
		tfnome = new JTextField();
		tfnome.setFont(new Font("Arial", Font.PLAIN, 18));
		tfnome.setBounds(239, 193, 489, 33);
		contentPane.add(tfnome);
		tfnome.setColumns(10);
		
		tfemail = new JTextField();
		tfemail.setFont(new Font("Arial", Font.PLAIN, 18));
		tfemail.setColumns(10);
		tfemail.setBounds(1009, 236, 489, 33);
		contentPane.add(tfemail);
		
		JFormattedTextField tfcpf = new JFormattedTextField();
	    MaskFormatter mfCPF = new MaskFormatter();
	    try {
	        mfCPF.setMask("###.###.###-##");
	        mfCPF.install(tfcpf);
	        tfcpf.setText("");
	    } catch (ParseException e1) {
	        e1.printStackTrace();
	    }
	    contentPane.add(tfcpf, "cell 0 1,growx");
		tfcpf.setFont(new Font("Arial", Font.PLAIN, 18));
		tfcpf.setColumns(10);
		tfcpf.setBounds(239, 236, 489, 33);
		contentPane.add(tfcpf);
		 
		JFormattedTextField tftelefone = new JFormattedTextField();
	    MaskFormatter mfTELEFONE = new MaskFormatter();
	    try {
	        mfTELEFONE.setMask("(##)#####-####");
	        mfTELEFONE.install(tftelefone);
	        tftelefone.setText("");
	    } catch (ParseException e1) {
	        e1.printStackTrace();
	    }
	    contentPane.add(tftelefone, "cell 0 1,growx");
		tftelefone.setFont(new Font("Arial", Font.PLAIN, 18));
		tftelefone.setColumns(10);
		tftelefone.setBounds(1009, 322, 489, 33);
		contentPane.add(tftelefone);
		
		pfsenha = new JPasswordField();
		pfsenha.setFont(new Font("Arial", Font.PLAIN, 18));
		pfsenha.setBounds(1009, 279, 489, 33);
		contentPane.add(pfsenha);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setForeground(Color.BLACK);
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 18));
		lblCpf.setBounds(181, 236, 50, 33);
		contentPane.add(lblCpf);
		
		JLabel lblSenha = new JLabel("SENHA:");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 18));
		lblSenha.setBounds(933, 279, 76, 33);
		contentPane.add(lblSenha);
		
		tfformaçao = new JTextField();
		tfformaçao.setHorizontalAlignment(SwingConstants.LEFT);
		tfformaçao.setFont(new Font("Arial", Font.PLAIN, 18));
		tfformaçao.setColumns(10);
		tfformaçao.setBounds(239, 369, 489, 131);
		contentPane.add(tfformaçao);
		
		JFormattedTextField tfprentensaosalarial = new JFormattedTextField();
	    MaskFormatter mfSALARIO = new MaskFormatter();
	    try {
	        mfSALARIO.setMask("");
	        mfSALARIO.install(tfprentensaosalarial);
	        tfprentensaosalarial.setText("");
	    } catch (ParseException e1) {
	        e1.printStackTrace();
	    }
	    contentPane.add(tfprentensaosalarial, "cell 0 1,growx");
	    tfprentensaosalarial.setFont(new Font("Arial", Font.PLAIN, 18));
	    tfprentensaosalarial.setColumns(10);
	    tfprentensaosalarial.setBounds(239, 322, 489, 33);
		contentPane.add(tfprentensaosalarial);
		
		JFormattedTextField tfdatanasc = new JFormattedTextField();
	    MaskFormatter mfDATA = new MaskFormatter();
	    try {
	        mfDATA.setMask("##/##/####");
	        mfDATA.install(tfdatanasc);
	        tfdatanasc.setText("");
	    } catch (ParseException e1) {
	        e1.printStackTrace();
	    }
	    contentPane.add(tfdatanasc, "cell 0 1,growx");
		tfdatanasc.setFont(new Font("Arial", Font.PLAIN, 18));
		tfdatanasc.setColumns(10);
		tfdatanasc.setBounds(1009, 193, 489, 33);
		contentPane.add(tfdatanasc);
		
		tfcargo = new JTextField();
		tfcargo.setFont(new Font("Arial", Font.PLAIN, 18));
		tfcargo.setColumns(10);
		tfcargo.setBounds(239, 279, 489, 33);
		contentPane.add(tfcargo);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(tftelefone.getText());
				try {
					
					Connection con = Conexao.faz_conexao();
					String sql = "insert into login_usuario(email, senha, nome, cpf, data_nasc, formaçao_acad, pretensao_salarial, cargo_interesse, experiencia_profissional, telefone) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
					PreparedStatement stmt = con.prepareStatement(sql);
					stmt.setString(1, tfemail.getText());
					stmt.setString(2, new String(pfsenha.getPassword()));
					stmt.setString(4, tfcpf.getText());
					stmt.setString(3, tfnome.getText());
					stmt.setString(5, tfdatanasc.getText());
					stmt.setString(6, tfformaçao.getText());
					stmt.setString(7, tfprentensaosalarial.getText());
					stmt.setString(8, tfcargo.getText());
					stmt.setString(9, tfexperiencia.getText());
					stmt.setString(10, tftelefone.getText());
					stmt.execute();
					stmt.close();
					con.close();
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso! Retornando a tela de Login.");
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				TelaLogin abrir = new TelaLogin();
				abrir.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(255, 140, 0));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.setBounds(685, 623, 210, 71);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Pictures\\PRO4TECH 22.jpg"));
		lblNewLabel_1.setBounds(0, 0, 531, 120);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDataNascimento = new JLabel("DATA NASCIMENTO:");
		lblDataNascimento.setForeground(Color.BLACK);
		lblDataNascimento.setFont(new Font("Arial", Font.PLAIN, 18));
		lblDataNascimento.setBounds(826, 193, 182, 33);
		contentPane.add(lblDataNascimento);
		
		JLabel lblExperienciaProfissional = new JLabel("EXPERIÊNCIA PROFISSIONAL:");
		lblExperienciaProfissional.setForeground(Color.BLACK);
		lblExperienciaProfissional.setFont(new Font("Arial", Font.PLAIN, 18));
		lblExperienciaProfissional.setBounds(742, 365, 267, 33);
		contentPane.add(lblExperienciaProfissional);
		
		JLabel lblCargo = new JLabel("CARGO:");
		lblCargo.setForeground(Color.BLACK);
		lblCargo.setFont(new Font("Arial", Font.PLAIN, 18));
		lblCargo.setBounds(153, 279, 76, 33);
		contentPane.add(lblCargo);
		
		tfexperiencia = new JTextField();
		tfexperiencia.setFont(new Font("Arial", Font.PLAIN, 18));
		tfexperiencia.setColumns(10);
		tfexperiencia.setBounds(1009, 369, 489, 131);
		contentPane.add(tfexperiencia);
		
		JLabel lblPretensoSalarial = new JLabel("PRETENSÃO SALARIAL:");
		lblPretensoSalarial.setForeground(Color.BLACK);
		lblPretensoSalarial.setFont(new Font("Arial", Font.PLAIN, 18));
		lblPretensoSalarial.setBounds(20, 322, 210, 33);
		contentPane.add(lblPretensoSalarial);
		
		JLabel lblFormaoAcadmica = new JLabel("FORMAÇÃO ACADÊMICA:");
		lblFormaoAcadmica.setForeground(Color.BLACK);
		lblFormaoAcadmica.setFont(new Font("Arial", Font.PLAIN, 18));
		lblFormaoAcadmica.setBounds(10, 365, 231, 33);
		contentPane.add(lblFormaoAcadmica);
		
		JLabel lblTelefone = new JLabel("TELEFONE:");
		lblTelefone.setForeground(Color.BLACK);
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 18));
		lblTelefone.setBounds(897, 322, 102, 33);
		contentPane.add(lblTelefone);
		
		
	}
}
