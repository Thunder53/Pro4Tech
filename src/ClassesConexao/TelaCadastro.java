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


public class TelaCadastro extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfnome;
	private JTextField tfemail;
	private JPasswordField pfsenha;
	private JTextField tfcargo;
	private JTextField tfexperiencia;
	private JTextField tfprentensaosalarial;
	private JTextField tfformaçao;
	private JTextField tfemail2;
	private JPasswordField pfsenha2;
	private JLabel lblQuemsoueu;
	private JTextField tfquemsoueu;
	private JTextField tfcep;
	private JButton btnNewButton_1;
	private JLabel lblendereco;
	private JTextField tfendereco;
	private JLabel lblnumero;
	private JTextField tfnumero;
	private JLabel lblbairro;
	private JTextField tfbairro;
	private JLabel lblcidade;
	private JTextField tfcidade;
	private JLabel lbluf;
	private JTextField tfuf;

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
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lbfnome = new JLabel("NOME COMPLETO *");
		lbfnome.setBounds(47, 149, 182, 33);
		lbfnome.setForeground(Color.BLACK);
		lbfnome.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lbfnome);
		
		JLabel lbfemail = new JLabel("E-MAIL *");
		lbfemail.setBounds(154, 280, 87, 33);
		lbfemail.setForeground(Color.BLACK);
		lbfemail.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lbfemail);
		
		tfnome = new JTextField();
		tfnome.setBounds(239, 149, 489, 33);
		tfnome.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(tfnome);
		tfnome.setColumns(10);
		
		tfemail = new JTextField();
		tfemail.setBounds(239, 280, 489, 33);
		tfemail.setFont(new Font("Arial", Font.PLAIN, 18));
		tfemail.setColumns(10);
		contentPane.add(tfemail);
		
		JFormattedTextField tfcpf = new JFormattedTextField();
		tfcpf.setBounds(239, 193, 489, 33);
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
		tftelefone.setBounds(239, 237, 489, 33);
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
		pfsenha.setBounds(1150, 239, 361, 33);
		pfsenha.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(pfsenha);
		
		JLabel lblCpf = new JLabel("CPF *");
		lblCpf.setBounds(173, 193, 56, 33);
		lblCpf.setForeground(Color.BLACK);
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblCpf);
		
		JLabel lblSenha = new JLabel("SENHA *");
		lblSenha.setBounds(1063, 239, 87, 33);
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblSenha);
		
		tfformaçao = new JTextField();
		tfformaçao.setBounds(239, 498, 489, 71);
		tfformaçao.setHorizontalAlignment(SwingConstants.LEFT);
		tfformaçao.setFont(new Font("Arial", Font.PLAIN, 18));
		tfformaçao.setColumns(10);
		contentPane.add(tfformaçao);
		
		tfprentensaosalarial = new JTextField();
		tfprentensaosalarial.setBounds(239, 371, 489, 33);
		tfprentensaosalarial.setHorizontalAlignment(SwingConstants.LEFT);
	    tfprentensaosalarial.setFont(new Font("Arial", Font.PLAIN, 18));
	    tfprentensaosalarial.setColumns(10);
		contentPane.add(tfprentensaosalarial);
	    
		tfcargo = new JTextField();
		tfcargo.setBounds(1150, 196, 361, 33);
		tfcargo.setFont(new Font("Arial", Font.PLAIN, 18));
		tfcargo.setColumns(10);
		contentPane.add(tfcargo);
		
		JDateChooser data_nasc = new JDateChooser();
		data_nasc.setDateFormatString("dd'/' MM '/' yyyy");
		data_nasc.setFont(new Font("Arial", Font.PLAIN, 18));
		data_nasc.setBounds(1150, 152, 361, 33);
		contentPane.add(data_nasc);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 531, 120);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Pictures\\PRO4TECH 22.jpg"));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDataNascimento = new JLabel("DATA NASCIMENTO *");
		lblDataNascimento.setBounds(956, 152, 194, 33);
		lblDataNascimento.setForeground(Color.BLACK);
		lblDataNascimento.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblDataNascimento);
		
		JLabel lblExperienciaProfissional = new JLabel("EXP. PROFISSIONAL");
		lblExperienciaProfissional.setBounds(47, 414, 213, 40);
		lblExperienciaProfissional.setForeground(Color.BLACK);
		lblExperienciaProfissional.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblExperienciaProfissional);
		
		JLabel lblCargo = new JLabel("CARGO DESEJADO");
		lblCargo.setBounds(966, 196, 182, 33);
		lblCargo.setForeground(Color.BLACK);
		lblCargo.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblCargo);
		
		tfexperiencia = new JTextField();
		tfexperiencia.setBounds(239, 416, 489, 71);
		tfexperiencia.setFont(new Font("Arial", Font.PLAIN, 18));
		tfexperiencia.setColumns(10);
		contentPane.add(tfexperiencia);
		
		JLabel lblPretensoSalarial = new JLabel("PRETENSÃO SALARIAL");
		lblPretensoSalarial.setBounds(20, 370, 210, 33);
		lblPretensoSalarial.setForeground(Color.BLACK);
		lblPretensoSalarial.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblPretensoSalarial);
		
		JLabel lblFormaoAcadmica = new JLabel("FORMAÇÃO ACADÊMICA *");
		lblFormaoAcadmica.setBounds(10, 497, 260, 33);
		lblFormaoAcadmica.setForeground(Color.BLACK);
		lblFormaoAcadmica.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblFormaoAcadmica);
		
		JLabel lblTelefone = new JLabel("TELEFONE");
		lblTelefone.setBounds(117, 237, 102, 33);
		lblTelefone.setForeground(Color.BLACK);
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(lblTelefone);
		
		JLabel lblCamposObrigatrios = new JLabel("Campos obrigatórios *");
		lblCamposObrigatrios.setBounds(239, 691, 194, 33);
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
		lbfemail2.setBounds(20, 324, 221, 33);
		contentPane.add(lbfemail2);
		
		tfemail2 = new JTextField();
		tfemail2.setFont(new Font("Arial", Font.PLAIN, 18));
		tfemail2.setColumns(10);
		tfemail2.setBounds(239, 327, 489, 33);
		contentPane.add(tfemail2);
		
		JLabel lblSenha2 = new JLabel("CONFIRMAÇÃO SENHA *");
		lblSenha2.setForeground(Color.BLACK);
		lblSenha2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblSenha2.setBounds(929, 283, 223, 33);
		contentPane.add(lblSenha2);
		
		pfsenha2 = new JPasswordField();
		pfsenha2.setFont(new Font("Arial", Font.PLAIN, 18));
		pfsenha2.setBounds(1150, 283, 361, 33);
		contentPane.add(pfsenha2);
		
		lblQuemsoueu = new JLabel("QUEM SOU EU? *");
		lblQuemsoueu.setFont(new Font("Arial", Font.PLAIN, 18));
		lblQuemsoueu.setBounds(83, 579, 158, 33);
		contentPane.add(lblQuemsoueu);
		
		tfquemsoueu = new JTextField();
		tfquemsoueu.setFont(new Font("Arial", Font.PLAIN, 18));
		tfquemsoueu.setBounds(239, 579, 1272, 102);
		contentPane.add(tfquemsoueu);
		tfquemsoueu.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CEP *");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setBounds(1089, 327, 61, 24);
		contentPane.add(lblNewLabel);
		
		tfcep = new JTextField();
		tfcep.setFont(new Font("Arial", Font.PLAIN, 18));
		tfcep.setBounds(1150, 327, 254, 33);
		contentPane.add(tfcep);
		tfcep.setColumns(10);
		
		btnNewButton_1 = new JButton("BUSCAR");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( tfcep.getText().equals("")) {
					JOptionPane.showMessageDialog(null,  "Informe o CEP");
					tfcep.requestFocus();
				} else {
					buscarCep();
					
				}
			}

			private void buscarCep() {

				String logradouro = "";
				String tipoLogradouro = "";
				String resultado = null;
				String cep = tfcep.getText();
				try {
					URL url = new URL("http://cep.republicavirtual.com.br/web_cep.php?cep=" + cep + "&formato=xml");
					SAXReader xml = new SAXReader();
					Document documento = xml.read(url);
					Element root = documento.getRootElement();
					for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
						Element element = it.next();
						if (element.getQualifiedName().equals("cidade")) {
							tfcidade.setText(element.getText());
						}
						if (element.getQualifiedName().equals("bairro")) {
							tfbairro.setText(element.getText());
						}
						if (element.getQualifiedName().equals("uf")) {
							tfuf.setText(element.getText());
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
					tfendereco.setText(tipoLogradouro + " " + logradouro);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
	});
	
		btnNewButton_1.setBounds(1414, 327, 87, 33);
		contentPane.add(btnNewButton_1);
		
		lblendereco = new JLabel("ENDEREÇO *");
		lblendereco.setFont(new Font("Arial", Font.PLAIN, 18));
		lblendereco.setBounds(1025, 373, 124, 33);
		contentPane.add(lblendereco);
		
		tfendereco = new JTextField();
		tfendereco.setFont(new Font("Arial", Font.PLAIN, 18));
		tfendereco.setBounds(1150, 374, 361, 62);
		contentPane.add(tfendereco);
		tfendereco.setColumns(10);
		
		lblnumero = new JLabel("NÚMERO *");
		lblnumero.setFont(new Font("Arial", Font.PLAIN, 18));
		lblnumero.setBounds(1048, 450, 102, 24);
		contentPane.add(lblnumero);
		
		tfnumero = new JTextField();
		tfnumero.setFont(new Font("Arial", Font.PLAIN, 18));
		tfnumero.setBounds(1150, 447, 229, 35);
		contentPane.add(tfnumero);
		tfnumero.setColumns(10);
		
		lblbairro = new JLabel("BAIRRO *");
		lblbairro.setFont(new Font("Arial", Font.PLAIN, 18));
		lblbairro.setBounds(1063, 492, 87, 33);
		contentPane.add(lblbairro);
		
		tfbairro = new JTextField();
		tfbairro.setFont(new Font("Arial", Font.PLAIN, 18));
		tfbairro.setBounds(1150, 494, 361, 33);
		contentPane.add(tfbairro);
		tfbairro.setColumns(10);
		
		lblcidade = new JLabel("CIDADE *");
		lblcidade.setFont(new Font("Arial", Font.PLAIN, 18));
		lblcidade.setBounds(1063, 538, 87, 33);
		contentPane.add(lblcidade);
		
		tfcidade = new JTextField();
		tfcidade.setFont(new Font("Arial", Font.PLAIN, 18));
		tfcidade.setBounds(1150, 538, 361, 33);
		contentPane.add(tfcidade);
		tfcidade.setColumns(10);
		
		lbluf = new JLabel("UF *");
		lbluf.setFont(new Font("Arial", Font.PLAIN, 18));
		lbluf.setBounds(1389, 447, 46, 33);
		contentPane.add(lbluf);
		
		tfuf = new JTextField();
		tfuf.setFont(new Font("Arial", Font.PLAIN, 18));
		tfuf.setBounds(1437, 447, 74, 34);
		contentPane.add(tfuf);
		tfuf.setColumns(10);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.setBounds(765, 739, 210, 71);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroUsuario c1 = new CadastroUsuario();
				
				c1.setNome(tfnome.getText());
				c1.setCpf(tfcpf.getText());
				c1.setData_nasc(data_nasc.getDate());
				c1.setFormaçao_acad(tfformaçao.getText());
				c1.setPretensao_salarial(tfprentensaosalarial.getText());
				c1.setCargo_interesse(tfcargo.getText());
				c1.setExperiencia_profissional(tfexperiencia.getText());
				c1.setTelefone(tftelefone.getText());
				c1.setQuemsoueu(tfquemsoueu.getText());
				c1.setCep(tfcep.getText());
				c1.setEndereco(tfendereco.getText());
				c1.setBairro(tfbairro.getText());
				c1.setCidade(tfcidade.getText());
				c1.setUf(tfuf.getText());
				c1.setNumero(tfnumero.getText());
				
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
						String sql = "insert into cadastro_usuario(email, senha, nome, cpf, data_nasc, formaçao_acad, pretensao_salarial, cargo_interesse, experiencia_profissional, telefone, quem_sou_eu, endereco, bairro, cep, cidade, uf, numero) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
						
						PreparedStatement stmt = con.prepareStatement(sql);
						stmt.setString(1, c1.getEmail());
						stmt.setString(2, c1.getSenha());
						stmt.setString(3, c1.getNome());
						stmt.setString(4, c1.getCpf());
						stmt.setDate(5, new Date(c1.getData_nasc().getTime()));
						stmt.setString(6, c1.getFormaçao_acad());
						stmt.setString(7, c1.getPretensao_salarial()); ;
						stmt.setString(8, c1.getCargo_interesse());
						stmt.setString(9, c1.getExperiencia_profissional());
						stmt.setString(10, c1.getTelefone());
						stmt.setString(11, c1.getQuemsoueu());
						stmt.setString(12, c1.getEndereco());
						stmt.setString(13, c1.getBairro());
						stmt.setString(14, c1.getCep());
						stmt.setString(15, c1.getCidade());
						stmt.setString(16, c1.getUf());
						stmt.setString(17, c1.getNumero());
					
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
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
	}
}
