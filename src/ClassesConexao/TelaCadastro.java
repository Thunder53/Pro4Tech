package ClassesConexao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Iterator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import com.toedter.calendar.JDateChooser;

import Atxy2k.CustomTextField.RestrictedTextField;


public class TelaCadastro extends JFrame implements ActionListener {

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
	private JTextField tfemail2;
	private JPasswordField pfsenha2;
	private JTextField tfquemsoueu;
	private JLabel lblCep;
	private JTextField tffcpf;
	private JTextField TextEndereco;
	private JTextField Textbairro;
	private JTextField cidade;
	private JComboBox comboBox;
	private JButton btnNewButton_1;
	private JTextField textCep;
	private JLabel lblNum;
	private JTextField textNum;

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
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		setExtendedState(MAXIMIZED_BOTH);
		
		JLabel lbfnome = new JLabel("NOME COMPLETO*");
		lbfnome.setBounds(47, 221, 182, 33);
		lbfnome.setForeground(Color.BLACK);
		lbfnome.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lbfnome);
		
		JLabel lbfemail = new JLabel("E-MAIL*");
		lbfemail.setBounds(154, 401, 87, 33);
		lbfemail.setForeground(Color.BLACK);
		lbfemail.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lbfemail);
		
		nome = new JTextField();
		nome.setBounds(239, 221, 489, 33);
		nome.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(nome);
		nome.setColumns(10);
		
		tfemail = new JTextField();
		tfemail.setBounds(239, 401, 489, 33);
		tfemail.setFont(new Font("Arial", Font.PLAIN, 18));
		tfemail.setColumns(10);
		contentPane.add(tfemail);
		
		JFormattedTextField tfcpf = new JFormattedTextField();
		tfcpf.setBounds(239, 265, 489, 33);
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
		tftelefone.setBounds(1009, 489, 351, 33);
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
		pfsenha.setBounds(1009, 401, 351, 33);
		pfsenha.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(pfsenha);
		
		JLabel lblCpf = new JLabel("CPF*");
		lblCpf.setBounds(173, 265, 56, 33);
		lblCpf.setForeground(Color.BLACK);
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblCpf);
		
		JLabel lblSenha = new JLabel("SENHA*");
		lblSenha.setBounds(927, 401, 87, 33);
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblSenha);
		
		tfformaçao = new JTextField();
		tfformaçao.setBounds(239, 533, 489, 81);
		tfformaçao.setHorizontalAlignment(SwingConstants.LEFT);
		tfformaçao.setFont(new Font("Arial", Font.PLAIN, 18));
		tfformaçao.setColumns(10);
		contentPane.add(tfformaçao);
		
		tfprentensaosalarial = new JTextField();
		tfprentensaosalarial.setBounds(239, 489, 489, 33);
		tfprentensaosalarial.setHorizontalAlignment(SwingConstants.LEFT);
	    tfprentensaosalarial.setFont(new Font("Arial", Font.PLAIN, 18));
	    tfprentensaosalarial.setColumns(10);
		contentPane.add(tfprentensaosalarial);
	    
		tfcargo = new JTextField();
		tfcargo.setBounds(1009, 357, 351, 33);
		tfcargo.setFont(new Font("Arial", Font.PLAIN, 18));
		tfcargo.setColumns(10);
		contentPane.add(tfcargo);
		
		JLabel lblDataNascimento = new JLabel("DATA NASCIMENTO*");
		lblDataNascimento.setBounds(820, 221, 194, 33);
		lblDataNascimento.setForeground(Color.BLACK);
		lblDataNascimento.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblDataNascimento);
		
		JLabel lblExperienciaProfissional = new JLabel("EXPERIÊNCIA PROFISSIONAL*");
		lblExperienciaProfissional.setBounds(738, 533, 267, 33);
		lblExperienciaProfissional.setForeground(Color.BLACK);
		lblExperienciaProfissional.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblExperienciaProfissional);
		
		JLabel lblCargo = new JLabel("CARGO DESEJADO");
		lblCargo.setBounds(827, 357, 182, 33);
		lblCargo.setForeground(Color.BLACK);
		lblCargo.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblCargo);
		
		tfexperiencia = new JTextField();
		tfexperiencia.setBounds(1009, 532, 351, 82);
		tfexperiencia.setFont(new Font("Arial", Font.PLAIN, 18));
		tfexperiencia.setColumns(10);
		contentPane.add(tfexperiencia);
		
		JLabel lblPretensoSalarial = new JLabel("PRETENSÃO SALARIAL");
		lblPretensoSalarial.setBounds(20, 489, 210, 33);
		lblPretensoSalarial.setForeground(Color.BLACK);
		lblPretensoSalarial.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblPretensoSalarial);
		
		JLabel lblFormaoAcadmica = new JLabel("FORMAÇÃO ACADÊMICA*");
		lblFormaoAcadmica.setBounds(0, 533, 241, 33);
		lblFormaoAcadmica.setForeground(Color.BLACK);
		lblFormaoAcadmica.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblFormaoAcadmica);
		
		JLabel lblTelefone = new JLabel("TELEFONE*");
		lblTelefone.setBounds(892, 489, 113, 33);
		lblTelefone.setForeground(Color.BLACK);
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblTelefone);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(0, 0, 517, 100);
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconPro4Tech.jpg"));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lbfemail2 = new JLabel("CONFIRMAÇÃO E-MAIL*");
		lbfemail2.setForeground(Color.BLACK);
		lbfemail2.setFont(new Font("Arial", Font.PLAIN, 18));
		lbfemail2.setBounds(20, 445, 221, 33);
		contentPane.add(lbfemail2);
		
		tfemail2 = new JTextField();
		tfemail2.setFont(new Font("Arial", Font.PLAIN, 18));
		tfemail2.setColumns(10);
		tfemail2.setBounds(239, 445, 489, 33);
		contentPane.add(tfemail2);
		
		JLabel lblSenha2 = new JLabel("CONFIRMAÇÃO SENHA*");
		lblSenha2.setForeground(Color.BLACK);
		lblSenha2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblSenha2.setBounds(791, 445, 223, 33);
		contentPane.add(lblSenha2);
		
		pfsenha2 = new JPasswordField();
		pfsenha2.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(pfsenha2);
		
		tfquemsoueu = new JTextField();
		tfquemsoueu.setHorizontalAlignment(SwingConstants.LEFT);
		tfquemsoueu.setFont(new Font("Arial", Font.PLAIN, 18));
		tfquemsoueu.setColumns(10);
		tfquemsoueu.setBounds(239, 625, 1121, 58);
		contentPane.add(tfquemsoueu);
		
		JLabel lblquemsoueu = new JLabel("QUEM SOU EU?*");
		lblquemsoueu.setForeground(Color.BLACK);
		lblquemsoueu.setFont(new Font("Arial", Font.PLAIN, 18));
		lblquemsoueu.setBounds(67, 638, 162, 33);
		contentPane.add(lblquemsoueu);
		pfsenha2.setBounds(1009, 445, 351, 33);
		contentPane.add(pfsenha2);
		
		JLabel lblCamposObrigatrios_1 = new JLabel("Campos obrigatórios *");
		lblCamposObrigatrios_1.setForeground(Color.RED);
		lblCamposObrigatrios_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblCamposObrigatrios_1.setBounds(1080, 694, 194, 33);
		contentPane.add(lblCamposObrigatrios_1);
		
		lblCep = new JLabel("CEP*");
		lblCep.setBackground(new Color(240, 240, 240));
		lblCep.setForeground(Color.BLACK);
		lblCep.setFont(new Font("Arial", Font.PLAIN, 18));
		lblCep.setBounds(173, 357, 56, 33);
		contentPane.add(lblCep);
		
		JLabel lblEndereco = new JLabel("ENDERECO*");
		lblEndereco.setForeground(Color.BLACK);
		lblEndereco.setFont(new Font("Arial", Font.PLAIN, 18));
		lblEndereco.setBackground(SystemColor.menu);
		lblEndereco.setBounds(111, 313, 182, 33);
		contentPane.add(lblEndereco);
		
		TextEndereco = new JTextField();
		TextEndereco.setBounds(239, 310, 489, 36);
		contentPane.add(TextEndereco);
		TextEndereco.setColumns(10);
		
		JLabel lblBairro = new JLabel("BAIRRO*");
		lblBairro.setForeground(Color.BLACK);
		lblBairro.setFont(new Font("Arial", Font.PLAIN, 18));
		lblBairro.setBounds(922, 267, 79, 33);
		contentPane.add(lblBairro);
		
		Textbairro = new JTextField();
		Textbairro.setBounds(1009, 265, 234, 33);
		contentPane.add(Textbairro);
		Textbairro.setColumns(10);
		
		JLabel lblCidade = new JLabel("CIDADE*");
		lblCidade.setForeground(Color.BLACK);
		lblCidade.setFont(new Font("Arial", Font.PLAIN, 18));
		lblCidade.setBounds(922, 313, 79, 33);
		contentPane.add(lblCidade);
		
		cidade = new JTextField();
		cidade.setBounds(1009, 310, 234, 36);
		contentPane.add(cidade);
		cidade.setColumns(10);
		
		textCep = new JTextField();
		textCep.setBounds(239, 357, 372, 33);
		contentPane.add(textCep);
		textCep.setColumns(8);
		 MaskFormatter mfCep = new MaskFormatter();
		    try {
		        mfCep.setMask("##.###-###");
		    } catch (ParseException f1) {
		        f1.printStackTrace();
		    }
		RestrictedTextField validar = new RestrictedTextField(textCep);
		validar.setOnlyNums(true);
		validar.setLimit(8);
		
		JLabel lblUf = new JLabel("UF*");
		lblUf.setForeground(Color.BLACK);
		lblUf.setFont(new Font("Arial", Font.PLAIN, 18));
		lblUf.setBounds(1253, 313, 38, 33);
		contentPane.add(lblUf);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] {"", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		comboBox.setBounds(1288, 313, 72, 33);
		contentPane.add(comboBox);
		
		btnNewButton_1 = new JButton("BUSCAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( textCep.getText().equals("")) {
					JOptionPane.showMessageDialog(null,  "Informe o CEP");
					textCep.requestFocus();
				} else {
					buscarCep();
					
				}
			}
		});
		
		btnNewButton_1.setBounds(621, 357, 107, 33);
		contentPane.add(btnNewButton_1);
		
		lblNum = new JLabel("N°*");
		lblNum.setForeground(Color.BLACK);
		lblNum.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNum.setBounds(1253, 265, 38, 33);
		contentPane.add(lblNum);
		
		textNum = new JTextField();
		textNum.setBounds(1288, 265, 72, 33);
		contentPane.add(textNum);
		textNum.setColumns(10);
		
		JDateChooser data_nasc = new JDateChooser();
		data_nasc.setDateFormatString("dd'/' MM '/' yyyy");
		data_nasc.setFont(new Font("Arial", Font.PLAIN, 18));
		data_nasc.setBounds(1009, 221, 351, 33);
		contentPane.add(data_nasc);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.setBounds(694, 717, 210, 71);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                CadastroUsuario c1 = new CadastroUsuario();
				
				c1.setNome(nome.getText());
				c1.setCpf(tfcpf.getText());
				c1.setData_nasc(data_nasc.getDate());
				c1.setFormaçao_acad(tfformaçao.getText());
				c1.setPretensao_salarial(tfprentensaosalarial.getText());
				c1.setCargo_interesse(tfcargo.getText());
				c1.setExperiencia_profissional(tfexperiencia.getText());
				c1.setTelefone(tftelefone.getText());
				c1.setQuemsoueu(tfquemsoueu.getText());
				c1.setCep(textCep.getText());
				c1.setEndereco(TextEndereco.getText());
				c1.setBairro(Textbairro.getText());
				c1.setCidade(cidade.getText());
				Object combo = comboBox.getSelectedItem();
				String Uf = String.valueOf(combo);
				c1.setUf(Uf);
				c1.setNumero(textNum.getText());
				
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

<<<<<<< HEAD
						String sql = "insert into cadastro_usuario(email, senha, nome, cpf, data_nasc, formaçao_acad, pretensao_salarial, cargo_interesse, experiencia_profissional, telefone, quem_sou_eu) values (?, MD5(?), ?, ?, ?, ?, ?, ?, ?, ?, ?)";
=======
<<<<<<< HEAD
						String sql = "insert into cadastro_usuario(email, senha, nome, cpf, data_nasc, formaçao_acad, pretensao_salarial, cargo_interesse, experiencia_profissional, telefone, quem_sou_eu, cep, endereco, cidade, uf, numero, bairro) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
=======
						String sql = "insert into cadastro_usuario(email, senha, nome, cpf, data_nasc, formaçao_acad, pretensao_salarial, cargo_interesse, experiencia_profissional, telefone, quem_sou_eu) values (?, MD5(?), ?, ?, ?, ?, ?, ?, ?, ?, ?)";
>>>>>>> 322a9936030b9c344c21c16d7e507bc9f2e2c06f
>>>>>>> 9e39f517243bc70c0af4be67628828012637e400
						
						PreparedStatement stmt = con.prepareStatement(sql);
						stmt.setString(1, c1.getEmail());
						stmt.setString(2, c1.getSenha());
						stmt.setString(3, c1.getNome());
						stmt.setString(4, c1.getCpf());
						stmt.setDate(5, new Date(c1.getData_nasc().getTime()));
						stmt.setString(6, c1.getFormaçao_acad());
						stmt.setString(7, c1.getPretensao_salarial());
						stmt.setString(8, c1.getCargo_interesse());
						stmt.setString(9, c1.getExperiencia_profissional());
						stmt.setString(10, c1.getTelefone());
						stmt.setString(11, c1.getQuemsoueu());
						stmt.setString(12, c1.getCep());
						stmt.setString(13, c1.getEndereco());
						stmt.setString(14, c1.getCidade());
						stmt.setString(15, c1.getUf());
						stmt.setString(16, c1.getNumero());
						stmt.setString(17, c1.getBairro());
						
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
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 531, 120);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Pictures\\PRO4TECH 22.jpg"));
		contentPane.add(lblNewLabel_1);
	}
		
<<<<<<< HEAD
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
	}
	
	private void buscarCep() {
		String logradouro = "";
		String tipoLogradouro = "";
		String resultado = null;
		String cep = textCep.getText();
		try {
			URL url = new URL("http://cep.republicavirtual.com.br/web_cep.php?cep=" + cep + "&formato=xml");
			SAXReader xml = new SAXReader();
			Document documento = xml.read(url);
			Element root = documento.getRootElement();
			for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
				Element element = it.next();
				if (element.getQualifiedName().equals("cidade")) {
					cidade.setText(element.getText());
				}
				if (element.getQualifiedName().equals("bairro")) {
					Textbairro.setText(element.getText());
				}
				if (element.getQualifiedName().equals("uf")) {
					comboBox.setSelectedItem(element.getText());
				}
				if (element.getQualifiedName().equals("tipo_logradouro")) {
					tipoLogradouro = element.getText();
				}
				if (element.getQualifiedName().equals("logradouro")) {
					logradouro = element.getText();
				}
				if (element.getQualifiedName().equals("resultado")) {
					resultado = element.getText();
					if (resultado.equals("1")) {
					
					} else {
						JOptionPane.showMessageDialog(null, "CEP não encontrado");
					}
				}
			}
			TextEndereco.setText(tipoLogradouro + " " + logradouro);
		} catch (Exception e) {
			System.out.println(e);
		}
=======
		JLabel lblDataNascimento = new JLabel("DATA NASCIMENTO *");
		lblDataNascimento.setBounds(815, 193, 194, 33);
		lblDataNascimento.setForeground(Color.BLACK);
		lblDataNascimento.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblDataNascimento);
		
		JLabel lblExperienciaProfissional = new JLabel("EXPERIÊNCIA PROFISSIONAL");
		lblExperienciaProfissional.setBounds(742, 413, 267, 33);
		lblExperienciaProfissional.setForeground(Color.BLACK);
		lblExperienciaProfissional.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblExperienciaProfissional);
		
		JLabel lblCargo = new JLabel("CARGO DESEJADO");
		lblCargo.setBounds(827, 236, 182, 33);
		lblCargo.setForeground(Color.BLACK);
		lblCargo.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblCargo);
		
		tfexperiencia = new JTextField();
		tfexperiencia.setBounds(1009, 417, 351, 82);
		tfexperiencia.setBounds(1009, 417, 489, 131);
		tfexperiencia.setFont(new Font("Arial", Font.PLAIN, 18));
		tfexperiencia.setColumns(10);
		contentPane.add(tfexperiencia);
		
		JLabel lblPretensoSalarial = new JLabel("PRETENSÃO SALARIAL");
		lblPretensoSalarial.setBounds(20, 370, 210, 33);
		lblPretensoSalarial.setForeground(Color.BLACK);
		lblPretensoSalarial.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblPretensoSalarial);
		
		JLabel lblFormaoAcadmica = new JLabel("FORMAÇÃO ACADÊMICA *");
		lblFormaoAcadmica.setBounds(0, 413, 241, 33);
		lblFormaoAcadmica.setForeground(Color.BLACK);
		lblFormaoAcadmica.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblFormaoAcadmica);
		
		JLabel lblTelefone = new JLabel("TELEFONE");
		lblTelefone.setBounds(897, 370, 102, 33);
		lblTelefone.setForeground(Color.BLACK);
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblTelefone);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(0, 0, 517, 100);
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconPro4Tech.jpg"));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lbfemail2 = new JLabel("CONFIRMAÇÃO E-MAIL*");
		lbfemail2.setForeground(Color.BLACK);
		lbfemail2.setFont(new Font("Arial", Font.PLAIN, 18));
		lbfemail2.setBounds(20, 324, 221, 33);
		contentPane.add(lbfemail2);
		
		tfemail2 = new JTextField();
		tfemail2.setFont(new Font("Arial", Font.PLAIN, 18));
		tfemail2.setColumns(10);
		tfemail2.setBounds(239, 324, 351, 33);
		tfemail2.setBounds(239, 324, 489, 33);
		contentPane.add(tfemail2);
		
		JLabel lblSenha2 = new JLabel("CONFIRMAÇÃO SENHA *");
		lblSenha2.setForeground(Color.BLACK);
		lblSenha2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblSenha2.setBounds(786, 323, 223, 33);
		contentPane.add(lblSenha2);
		
		pfsenha2 = new JPasswordField();
		pfsenha2.setFont(new Font("Arial", Font.PLAIN, 18));
		pfsenha2.setBounds(1009, 323, 351, 33);
		contentPane.add(pfsenha2);
		
		tfquemsoueu = new JTextField();
		tfquemsoueu.setHorizontalAlignment(SwingConstants.LEFT);
		tfquemsoueu.setFont(new Font("Arial", Font.PLAIN, 18));
		tfquemsoueu.setColumns(10);
		tfquemsoueu.setBounds(239, 585, 1259, 58);
		contentPane.add(tfquemsoueu);
		
		JLabel lblquemsoueu = new JLabel("QUEM SOU EU? *");
		lblquemsoueu.setForeground(Color.BLACK);
		lblquemsoueu.setFont(new Font("Arial", Font.PLAIN, 18));
		lblquemsoueu.setBounds(79, 585, 162, 33);
		contentPane.add(lblquemsoueu);
		pfsenha2.setBounds(1009, 323, 489, 33);
		contentPane.add(pfsenha2);
		
		JLabel lblCamposObrigatrios_1 = new JLabel("Campos obrigatórios *");
		lblCamposObrigatrios_1.setForeground(Color.RED);
		lblCamposObrigatrios_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblCamposObrigatrios_1.setBounds(1009, 663, 194, 33);
		contentPane.add(lblCamposObrigatrios_1);
<<<<<<< HEAD

=======
		
>>>>>>> 9e39f517243bc70c0af4be67628828012637e400
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin exibir = new TelaLogin();
				exibir.setVisible(true);
				setVisible(false);
			}
		});
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 18));
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnVoltar.setBackground(Color.ORANGE);
		btnVoltar.setBounds(20, 793, 156, 52);
		contentPane.add(btnVoltar);
		
>>>>>>> 322a9936030b9c344c21c16d7e507bc9f2e2c06f
	}
}
