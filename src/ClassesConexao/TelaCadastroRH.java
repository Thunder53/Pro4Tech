package ClassesConexao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

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
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class TelaCadastroRH extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfnome;
	private JTextField tfemail;
	private JPasswordField pfsenha;
	private JTextField tfemail2;
	private JPasswordField pfsenha2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroRH frame = new TelaCadastroRH();
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
	public TelaCadastroRH() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lbfnome = new JLabel("NOME COMPLETO *");
		lbfnome.setBounds(37, 303, 182, 33);
		lbfnome.setForeground(Color.BLACK);
		lbfnome.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lbfnome);
		
		JLabel lbfemail = new JLabel("E-MAIL *");
		lbfemail.setBounds(144, 390, 87, 33);
		lbfemail.setForeground(Color.BLACK);
		lbfemail.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lbfemail);
		
		tfnome = new JTextField();
		tfnome.setBounds(229, 303, 489, 33);
		tfnome.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(tfnome);
		tfnome.setColumns(10);
		
		tfemail = new JTextField();
		tfemail.setBounds(229, 390, 489, 33);
		tfemail.setFont(new Font("Arial", Font.PLAIN, 18));
		tfemail.setColumns(10);
		contentPane.add(tfemail);
		
		JFormattedTextField tfcpf = new JFormattedTextField();
		tfcpf.setBounds(229, 347, 489, 33);
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
		contentPane.add(tfcpf);
		 
		JFormattedTextField tftelefone = new JFormattedTextField();
		tftelefone.setBounds(999, 347, 361, 33);
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
		contentPane.add(tftelefone);
		
		pfsenha = new JPasswordField();
		pfsenha.setBounds(999, 390, 361, 33);
		pfsenha.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(pfsenha);
		
		JLabel lblCpf = new JLabel("CPF *");
		lblCpf.setBounds(163, 347, 56, 33);
		lblCpf.setForeground(Color.BLACK);
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblCpf);
		
		JLabel lblSenha = new JLabel("SENHA *");
		lblSenha.setBounds(912, 390, 87, 33);
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblSenha);
		
		JDateChooser data_nasc = new JDateChooser();
		data_nasc.setDateFormatString("dd'/' MM '/' yyyy");
		data_nasc.setFont(new Font("Arial", Font.PLAIN, 18));
		data_nasc.setBounds(999, 303, 361, 33);
		contentPane.add(data_nasc);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 531, 120);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Pictures\\PRO4TECH 22.jpg"));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDataNascimento = new JLabel("DATA NASCIMENTO *");
		lblDataNascimento.setBounds(805, 303, 194, 33);
		lblDataNascimento.setForeground(Color.BLACK);
		lblDataNascimento.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblDataNascimento);
		
		JLabel lblTelefone = new JLabel("TELEFONE");
		lblTelefone.setBounds(887, 347, 102, 33);
		lblTelefone.setForeground(Color.BLACK);
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblTelefone);
		
		JLabel lblCamposObrigatrios = new JLabel("Campos obrigatórios *");
		lblCamposObrigatrios.setBounds(1028, 699, 194, 33);
		lblCamposObrigatrios.setForeground(Color.RED);
		lblCamposObrigatrios.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblCamposObrigatrios);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(0, 0, 517, 100);
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconPro4Tech.jpg"));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lbfemail2 = new JLabel("CONFIRMAÇÃO E-MAIL *");
		lbfemail2.setForeground(Color.BLACK);
		lbfemail2.setFont(new Font("Arial", Font.PLAIN, 18));
		lbfemail2.setBounds(10, 434, 221, 33);
		contentPane.add(lbfemail2);
		
		tfemail2 = new JTextField();
		tfemail2.setFont(new Font("Arial", Font.PLAIN, 18));
		tfemail2.setColumns(10);
		tfemail2.setBounds(229, 434, 489, 33);
		contentPane.add(tfemail2);
		
		JLabel lblSenha2 = new JLabel("CONFIRMAÇÃO SENHA *");
		lblSenha2.setForeground(Color.BLACK);
		lblSenha2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblSenha2.setBounds(778, 434, 223, 33);
		contentPane.add(lblSenha2);
		
		pfsenha2 = new JPasswordField();
		pfsenha2.setFont(new Font("Arial", Font.PLAIN, 18));
		pfsenha2.setBounds(999, 434, 361, 33);
		contentPane.add(pfsenha2);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.setBounds(683, 661, 210, 71);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroRH c1 = new CadastroRH();
				
				c1.setNome(tfnome.getText());
				c1.setCpf(tfcpf.getText());
				c1.setData_nasc(data_nasc.getDate());
				c1.setTelefone(tftelefone.getText());
				
				
				if (tfemail.getText().equals(tfemail2.getText())) {
					c1.setEmail(tfemail.getText());
				}
			    else{
			        JOptionPane.showMessageDialog(null, "E-mail não confere.");
				}
				
				if (new String(pfsenha.getPassword()).equals(new String(pfsenha2.getPassword()))) {
					c1.setSenha(new String(pfsenha.getPassword()));
				}
			    else{
			        JOptionPane.showMessageDialog(null, "A senha não confere.");
				} 
				
				if (c1.isCPF()) {
					try {
						Connection con = Conexao.faz_conexao();
						String sql = "insert into cadastro_funcionario(email, senha, nome, cpf, data_nasc, telefone) values (?, ?, ?, ?, ?, ?)";
						
						PreparedStatement stmt = con.prepareStatement(sql);
						stmt.setString(1, c1.getEmail());
						stmt.setString(2, c1.getSenha());
						stmt.setString(3, c1.getNome());
						stmt.setString(4, c1.getCpf());
						stmt.setDate(5, new Date(c1.getData_nasc().getTime()));
						stmt.setString(6, c1.getTelefone());
						
						stmt.execute();
						stmt.close();
						con.close();
						JOptionPane.showMessageDialog(null, "Cadastrado com sucesso! Retornando a tela de Login.");
						TelaLogin abrir = new TelaLogin();
						abrir.setVisible(true);
						setVisible(false);
					} catch (SQLException e1) {
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
		contentPane.add(btnNewButton);	
	
	}
		
	public void actionPerformed(ActionEvent e) {
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
	}
}
