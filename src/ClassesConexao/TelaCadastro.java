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


public class TelaCadastro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nome;
	private JTextField tfemail;
	private JPasswordField pfsenha;
	private JTextField tfcargo;
	private JTextField tfexperiencia;
	private JTextField tfprentensaosalarial;
	private JTextField tfformaçao;

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
		
		JLabel lbfnome = new JLabel("NOME COMPLETO *");
		lbfnome.setForeground(Color.BLACK);
		lbfnome.setFont(new Font("Arial", Font.PLAIN, 18));
		lbfnome.setBounds(47, 193, 182, 33);
		contentPane.add(lbfnome);
		
		JLabel lbfemail = new JLabel("E-MAIL *");
		lbfemail.setForeground(Color.BLACK);
		lbfemail.setFont(new Font("Arial", Font.PLAIN, 18));
		lbfemail.setBounds(922, 236, 87, 33);
		contentPane.add(lbfemail);
		
		nome = new JTextField();
		nome.setFont(new Font("Arial", Font.PLAIN, 18));
		nome.setBounds(239, 193, 489, 33);
		contentPane.add(nome);
		nome.setColumns(10);
		
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
		
		JLabel lblCpf = new JLabel("CPF *");
		lblCpf.setForeground(Color.BLACK);
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 18));
		lblCpf.setBounds(173, 236, 56, 33);
		contentPane.add(lblCpf);
		
		JLabel lblSenha = new JLabel("SENHA *");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 18));
		lblSenha.setBounds(922, 279, 87, 33);
		contentPane.add(lblSenha);
		
		tfformaçao = new JTextField();
		tfformaçao.setHorizontalAlignment(SwingConstants.LEFT);
		tfformaçao.setFont(new Font("Arial", Font.PLAIN, 18));
		tfformaçao.setColumns(10);
		tfformaçao.setBounds(239, 369, 489, 131);
		contentPane.add(tfformaçao);
		
		tfprentensaosalarial = new JTextField();
		tfprentensaosalarial.setHorizontalAlignment(SwingConstants.LEFT);
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
				
				CadastroUsuario c1 = new CadastroUsuario();
				c1.setEmail(tfemail.getText());
				c1.setSenha(new String(pfsenha.getPassword()));
				c1.setNome(nome.getText());
				c1.setCpf(tfcpf.getText());
				c1.setData_nasc(tfdatanasc.getText());
				c1.setFormaçao_acad(tfformaçao.getText());
				c1.setPretensao_salarial(tfprentensaosalarial.getText());
				c1.setCargo_interesse(tfcargo.getText());
				c1.setExperiencia_profissional(tfexperiencia.getText());
				c1.setTelefone(tftelefone.getText());
				
				if (c1.isCPF()) {
					try {
						
						Connection con = Conexao.faz_conexao();
						String sql = "insert into cadastro_usuario(email, senha, nome, cpf, data_nasc, formaçao_acad, pretensao_salarial, cargo_interesse, experiencia_profissional, telefone) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
						
						PreparedStatement stmt = con.prepareStatement(sql);
						stmt.setString(1, c1.getEmail());
						stmt.setString(2, c1.getSenha());
						stmt.setString(3, c1.getNome());
						stmt.setString(4, c1.getCpf());
						stmt.setString(5, c1.getData_nasc());
						stmt.setString(6, c1.getFormaçao_acad());
						stmt.setString(7, c1.getPretensao_salarial());
						stmt.setString(8, c1.getCargo_interesse());
						stmt.setString(9, c1.getExperiencia_profissional());
						stmt.setString(10, c1.getTelefone());
					
						stmt.execute();
						stmt.close();
						con.close();
						JOptionPane.showMessageDialog(null, "Cadastrado com sucesso! Retornando a tela de Login.");
						TelaLogin abrir = new TelaLogin();
						abrir.setVisible(true);
						setVisible(false);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "Faltando informações obrigatórias!!");
					} 
				} else {
					JOptionPane.showMessageDialog(null, "CPF INVÁLIDO");
				}
				
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
		
		JLabel lblDataNascimento = new JLabel("DATA NASCIMENTO *");
		lblDataNascimento.setForeground(Color.BLACK);
		lblDataNascimento.setFont(new Font("Arial", Font.PLAIN, 18));
		lblDataNascimento.setBounds(815, 193, 194, 33);
		contentPane.add(lblDataNascimento);
		
		JLabel lblExperienciaProfissional = new JLabel("EXPERIÊNCIA PROFISSIONAL");
		lblExperienciaProfissional.setForeground(Color.BLACK);
		lblExperienciaProfissional.setFont(new Font("Arial", Font.PLAIN, 18));
		lblExperienciaProfissional.setBounds(742, 365, 267, 33);
		contentPane.add(lblExperienciaProfissional);
		
		JLabel lblCargo = new JLabel("CARGO DESEJADO");
		lblCargo.setForeground(Color.BLACK);
		lblCargo.setFont(new Font("Arial", Font.PLAIN, 18));
		lblCargo.setBounds(47, 279, 182, 33);
		contentPane.add(lblCargo);
		
		tfexperiencia = new JTextField();
		tfexperiencia.setFont(new Font("Arial", Font.PLAIN, 18));
		tfexperiencia.setColumns(10);
		tfexperiencia.setBounds(1009, 369, 489, 131);
		contentPane.add(tfexperiencia);
		
		JLabel lblPretensoSalarial = new JLabel("PRETENSÃO SALARIAL");
		lblPretensoSalarial.setForeground(Color.BLACK);
		lblPretensoSalarial.setFont(new Font("Arial", Font.PLAIN, 18));
		lblPretensoSalarial.setBounds(20, 322, 210, 33);
		contentPane.add(lblPretensoSalarial);
		
		JLabel lblFormaoAcadmica = new JLabel("FORMAÇÃO ACADÊMICA *");
		lblFormaoAcadmica.setForeground(Color.BLACK);
		lblFormaoAcadmica.setFont(new Font("Arial", Font.PLAIN, 18));
		lblFormaoAcadmica.setBounds(0, 365, 241, 33);
		contentPane.add(lblFormaoAcadmica);
		
		JLabel lblTelefone = new JLabel("TELEFONE");
		lblTelefone.setForeground(Color.BLACK);
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 18));
		lblTelefone.setBounds(897, 322, 102, 33);
		contentPane.add(lblTelefone);
		
		JLabel lblCamposObrigatrios = new JLabel("Campos obrigatórios *");
		lblCamposObrigatrios.setForeground(Color.RED);
		lblCamposObrigatrios.setFont(new Font("Arial", Font.PLAIN, 18));
		lblCamposObrigatrios.setBounds(1007, 510, 194, 33);
		contentPane.add(lblCamposObrigatrios);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconPro4Tech.jpg"));
		lblNewLabel_1_1.setBounds(0, 0, 517, 100);
		contentPane.add(lblNewLabel_1_1);
		
		
		
		
		
		
	}
}
