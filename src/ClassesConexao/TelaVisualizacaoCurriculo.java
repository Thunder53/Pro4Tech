package ClassesConexao;

import java.awt.EventQueue;

import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class TelaVisualizacaoCurriculo extends JFrame {

	private JPanel contentPane;
	private JTextField tfQuemSouEu;
	private JTextField tfFormacao;
	private JTextField tfFeedback;
	private JTextField tfExperiencia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVisualizacaoCurriculo frame = new TelaVisualizacaoCurriculo();
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
	public TelaVisualizacaoCurriculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setExtendedState(MAXIMIZED_BOTH);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconPro4Tech.jpg"));
		lblNewLabel.setBounds(0, 0, 500, 109);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("VISUALIZAÇÃO CURRÍCULO");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(79, 129, 275, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("QUEM SOU EU?");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(79, 172, 157, 22);
		contentPane.add(lblNewLabel_2);
		
		tfQuemSouEu = new JTextField();
		tfQuemSouEu.setDisabledTextColor(Color.BLACK);
		tfQuemSouEu.setCaretColor(Color.BLACK);
		tfQuemSouEu.setHorizontalAlignment(SwingConstants.LEFT);
		tfQuemSouEu.setForeground(Color.BLACK);
		tfQuemSouEu.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				
				try {
					Connection con = Conexao.faz_conexao();
					String sql = "select * from cadastro_usuario where nome = '" + Singleton.getInstance().Candidato + "'";
					PreparedStatement stmt = con.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery();
					while(rs.next()) {
						tfQuemSouEu.setText(rs.getString("quem_sou_eu"));
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		tfQuemSouEu.setEnabled(false);
		tfQuemSouEu.setEditable(false);
		tfQuemSouEu.setColumns(10);
		tfQuemSouEu.setToolTipText("Sobre você!");
		tfQuemSouEu.setFont(new Font("Arial", Font.PLAIN, 20));
		tfQuemSouEu.setBounds(79, 204, 639, 98);
		contentPane.add(tfQuemSouEu);
		
		JLabel lblNewLabel_3 = new JLabel("FORMAÇÃO");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(843, 172, 121, 22);
		contentPane.add(lblNewLabel_3);
		
		tfFormacao = new JTextField();
		tfFormacao.setDisabledTextColor(Color.BLACK);
		tfFormacao.setCaretColor(Color.BLACK);
		tfFormacao.setForeground(Color.BLACK);
		tfFormacao.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				try {
					Connection con = Conexao.faz_conexao();
					String sql = "select * from cadastro_usuario where nome = '" + Singleton.getInstance().Candidato + "'";
					PreparedStatement stmt = con.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery();
					while(rs.next()) {
						tfFormacao.setText(rs.getString("formaçao_acad"));
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		tfFormacao.setEnabled(false);
		tfFormacao.setEditable(false);
		tfFormacao.setFont(new Font("Arial", Font.PLAIN, 18));
		tfFormacao.setToolTipText("Formação da mais recente até a mais antiga!");
		tfFormacao.setBounds(843, 206, 622, 96);
		contentPane.add(tfFormacao);
		tfFormacao.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("EXPERIÊNCIA PROFISSIONAL");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(79, 336, 262, 40);
		contentPane.add(lblNewLabel_4);
		
		JComboBox cbxFeedBack = new JComboBox();
		cbxFeedBack.setModel(new DefaultComboBoxModel(new String[] {"Tempo de experiência insuficiente", "Formação irrelevante ", "Perfil inadequado", "Modelo de trabalho incoerente com o desejado", "Salário incompatível"}));
		cbxFeedBack.setForeground(Color.BLACK);
		cbxFeedBack.setToolTipText("Feedback breve");
		cbxFeedBack.setMaximumRowCount(10);
		cbxFeedBack.setFont(new Font("Arial", Font.PLAIN, 18));
		cbxFeedBack.setBounds(79, 679, 867, 40);
		contentPane.add(cbxFeedBack);
		
		JButton btnNewButton_APROVADO = new JButton("APROVADO");
		btnNewButton_APROVADO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Connection con = Conexao.faz_conexao();
					String sql = "select * from cadastro_usuario where nome = '" + Singleton.getInstance().Candidato + "'";
					PreparedStatement stmt = con.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery();
					while(rs.next()) {
						Singleton.getInstance().CandidatoCPF = rs.getString("cpf");
						Connection con1 = Conexao.faz_conexao();
						String sql1 = "select * from cadastro_funcionario where nome = '" + Singleton.getInstance().nomeFuncionario + "'";
						PreparedStatement stmt1 = con1.prepareStatement(sql1);
						ResultSet rs1 = stmt1.executeQuery();
						while(rs1.next()) {
							Singleton.getInstance().FuncionarioEMAIL = rs1.getString("email");
						}
						stmt1.close();
						con1.close();
					}
					stmt.close();
					con.close();
					
					setVisible(false);
				} catch (SQLException e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "ERRO!");
				} 
				
				try {
					Connection con = Conexao.faz_conexao();
					String sql = "insert into inscricao(nome_vaga, avaliacao, status_vaga, feedback_geral, feedback_pontual, cpf, email) values (?, ?, ?, ?, ?, ?, ?)";
					PreparedStatement stmt = con.prepareStatement(sql);
					
					stmt.setString(1, Singleton.getInstance().nomeVaga);
					stmt.setString(2, "APROVADO");
					stmt.setString(3, "ABERTA");
					stmt.setString(4, tfFeedback.getText());
					stmt.setString(5, "-");
					stmt.setString(6, Singleton.getInstance().CandidatoCPF);
					stmt.setString(7, Singleton.getInstance().FuncionarioEMAIL);
					
					stmt.execute();
					stmt.close();
					con.close();
					JOptionPane.showMessageDialog(null, "Avaliação realizada. Voltando a tela de Opções!");
					TelaOpcoesFuncionario abrir = new TelaOpcoesFuncionario();
					abrir.setVisible(true);
					setVisible(false);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Faltando informações obrigatórias!!");
				}
				
			}
		});
		btnNewButton_APROVADO.setForeground(Color.BLACK);
		btnNewButton_APROVADO.setBackground(new Color(241, 133, 36));
		btnNewButton_APROVADO.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_APROVADO.setBounds(1140, 421, 156, 52);
		contentPane.add(btnNewButton_APROVADO);
		
		JButton btnReprovado = new JButton("REPROVADO");
		btnReprovado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					Connection con = Conexao.faz_conexao();
					String sql = "select * from cadastro_usuario where nome = '" + Singleton.getInstance().Candidato + "'";
					PreparedStatement stmt = con.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery();
					while(rs.next()) {
						Singleton.getInstance().CandidatoCPF = rs.getString("cpf");
						Connection con1 = Conexao.faz_conexao();
						String sql1 = "select * from cadastro_funcionario where nome = '" + Singleton.getInstance().nomeFuncionario + "'";
						PreparedStatement stmt1 = con1.prepareStatement(sql1);
						ResultSet rs1 = stmt1.executeQuery();
						while(rs1.next()) {
							Singleton.getInstance().FuncionarioEMAIL = rs1.getString("email");
						}
						stmt1.close();
						con1.close();
					}
					stmt.close();
					con.close();
					
					setVisible(false);
				} catch (SQLException e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "ERRO!");
				} 
				
				try {
					Connection con = Conexao.faz_conexao();
					String sql = "insert into inscricao(nome_vaga, avaliacao, status_vaga, feedback_geral, feedback_pontual, cpf, email) values (?, ?, ?, ?, ?, ?, ?)";
					PreparedStatement stmt = con.prepareStatement(sql);
					
					stmt.setString(1, Singleton.getInstance().nomeVaga);
					stmt.setString(2, "REPROVADO");
					stmt.setString(3, "ABERTA");
					stmt.setString(4, tfFeedback.getText());
					stmt.setString(5, cbxFeedBack.getToolTipText());
					stmt.setString(6, Singleton.getInstance().CandidatoCPF);
					stmt.setString(7, Singleton.getInstance().FuncionarioEMAIL);
					
					stmt.execute();
					stmt.close();
					con.close();
					JOptionPane.showMessageDialog(null, "Avaliação realizada. Voltando a tela de Opções!");
					TelaOpcoesFuncionario abrir = new TelaOpcoesFuncionario();
					abrir.setVisible(true);
					setVisible(false);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Faltando informações obrigatórias!!");
				}
			}
		});
		btnReprovado.setForeground(Color.BLACK);
		btnReprovado.setFont(new Font("Arial", Font.PLAIN, 18));
		btnReprovado.setBackground(new Color(241, 133, 36));
		btnReprovado.setBounds(1140, 528, 156, 52);
		contentPane.add(btnReprovado);
		
		JLabel lblNewLabel_9 = new JLabel("FEEDBACK GERAL:");
		lblNewLabel_9.setForeground(Color.BLACK);
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(79, 483, 191, 40);
		contentPane.add(lblNewLabel_9);
		
		tfFeedback = new JTextField();
		tfFeedback.setCaretColor(Color.BLACK);
		tfFeedback.setHorizontalAlignment(SwingConstants.LEFT);
		tfFeedback.setForeground(Color.BLACK);
		tfFeedback.setFont(new Font("Arial", Font.PLAIN, 18));
		tfFeedback.setBounds(79, 528, 867, 85);
		contentPane.add(tfFeedback);
		tfFeedback.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("FEEDBACK PONTUAL:");
		lblNewLabel_10.setForeground(Color.BLACK);
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(79, 647, 206, 22);
		contentPane.add(lblNewLabel_10);
		
		tfExperiencia = new JTextField();
		tfExperiencia.setDisabledTextColor(Color.BLACK);
		tfExperiencia.setCaretColor(Color.BLACK);
		tfExperiencia.setHorizontalAlignment(SwingConstants.LEFT);
		tfExperiencia.setForeground(Color.BLACK);
		tfExperiencia.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				try {
					Connection con = Conexao.faz_conexao();
					String sql = "select * from cadastro_usuario where nome = '" + Singleton.getInstance().Candidato + "'";
					PreparedStatement stmt = con.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery();
					while(rs.next()) {
						tfExperiencia.setText(rs.getString("experiencia_profissional"));
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		tfExperiencia.setToolTipText("Sobre você!");
		tfExperiencia.setFont(new Font("Arial", Font.PLAIN, 20));
		tfExperiencia.setEnabled(false);
		tfExperiencia.setEditable(false);
		tfExperiencia.setColumns(10);
		tfExperiencia.setBounds(79, 375, 639, 98);
		contentPane.add(tfExperiencia);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(208, 10, 553, 90);
		contentPane.add(lblNewLabel_5);
		
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaOpcoesFuncionario exibir = new TelaOpcoesFuncionario();
				exibir.setVisible(true);
				setVisible(false);
			}
		});
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 18));
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnVoltar.setBackground(Color.ORANGE);
		btnVoltar.setBounds(10, 729, 156, 52);
		contentPane.add(btnVoltar);
	}
}
