package ClassesConexao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class TelaCadastroVagas extends JFrame {

	private JPanel contentPane;
	private JTextField tNome;
	private JTextField tCargaHr;
	private JTextField tModelo;
	private JTextField tSalario;
	private JTextField tRequisitos;
	private JTextField tEscolaridade;
	private JTextField tSoft;
	private JTextField tHard;
	private JTextField tResponsavel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroVagas frame = new TelaCadastroVagas();
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
	public TelaCadastroVagas() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBorder(null);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setExtendedState(MAXIMIZED_BOTH);
		
		JLabel lblNewLabel_1 = new JLabel("VOCÊ ESTÁ NA PÁGINA DE CADASTRO DE VAGAS!\r\n");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(357, 151, 591, 52);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("INSIRA ABAIXO AS INFORMAÇÕES DA VAGA QUE DESEJA CADASTRAR:");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setToolTipText("");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(357, 180, 629, 52);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NOME VAGA");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(459, 248, 143, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CARGA HORÁRIA ");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(422, 286, 180, 28);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("MODELO DE TRABALHO");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(360, 327, 247, 35);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("SALÁRIO");
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(492, 372, 115, 28);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("REQUISITOS");
		lblNewLabel_7.setForeground(Color.BLACK);
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(462, 410, 156, 28);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("ESCOLARIDADE");
		lblNewLabel_8.setForeground(Color.BLACK);
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(433, 448, 156, 28);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("SOFT SKILLS DESEJADAS");
		lblNewLabel_9.setForeground(Color.BLACK);
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(346, 486, 247, 28);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("HARD SKILLS DESEJADAS");
		lblNewLabel_10.setForeground(Color.BLACK);
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(346, 531, 247, 28);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("RESPONSÁVEL");
		lblNewLabel_11.setForeground(Color.BLACK);
		lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_11.setBounds(433, 569, 156, 28);
		contentPane.add(lblNewLabel_11);
		
		tNome = new JTextField();
		tNome.setFont(new Font("Arial", Font.PLAIN, 20));
		tNome.setForeground(Color.BLACK);
		tNome.setBounds(589, 250, 400, 28);
		contentPane.add(tNome);
		tNome.setColumns(10);
		
		tCargaHr = new JTextField();
		tCargaHr.setFont(new Font("Arial", Font.PLAIN, 20));
		tCargaHr.setForeground(Color.BLACK);
		tCargaHr.setColumns(10);
		tCargaHr.setBounds(589, 289, 400, 28);
		contentPane.add(tCargaHr);
		
		tModelo = new JTextField();
		tModelo.setFont(new Font("Arial", Font.PLAIN, 20));
		tModelo.setForeground(Color.BLACK);
		tModelo.setColumns(10);
		tModelo.setBounds(589, 328, 400, 28);
		contentPane.add(tModelo);
		
		tSalario = new JTextField();
		tSalario.setFont(new Font("Arial", Font.PLAIN, 20));
		tSalario.setForeground(Color.BLACK);
		tSalario.setColumns(10);
		tSalario.setBounds(589, 367, 400, 28);
		contentPane.add(tSalario);
		
		tRequisitos = new JTextField();
		tRequisitos.setFont(new Font("Arial", Font.PLAIN, 20));
		tRequisitos.setForeground(Color.BLACK);
		tRequisitos.setColumns(10);
		tRequisitos.setBounds(589, 406, 400, 28);
		contentPane.add(tRequisitos);
		
		tEscolaridade = new JTextField();
		tEscolaridade.setFont(new Font("Arial", Font.PLAIN, 20));
		tEscolaridade.setForeground(Color.BLACK);
		tEscolaridade.setColumns(10);
		tEscolaridade.setBounds(589, 445, 400, 28);
		contentPane.add(tEscolaridade);
		
		tSoft = new JTextField();
		tSoft.setFont(new Font("Arial", Font.PLAIN, 20));
		tSoft.setForeground(Color.BLACK);
		tSoft.setColumns(10);
		tSoft.setBounds(589, 489, 400, 28);
		contentPane.add(tSoft);
		
		tHard = new JTextField();
		tHard.setFont(new Font("Arial", Font.PLAIN, 20));
		tHard.setForeground(Color.BLACK);
		tHard.setColumns(10);
		tHard.setBounds(589, 531, 400, 28);
		contentPane.add(tHard);
		
		tResponsavel = new JTextField();
		tResponsavel.setText(Singleton.getInstance().nomeFuncionario);
		tResponsavel.setEditable(false);
		tResponsavel.setFont(new Font("Arial", Font.PLAIN, 20));
		tResponsavel.setForeground(Color.BLACK);
		tResponsavel.setColumns(10);
		tResponsavel.setBounds(589, 568, 400, 28);
		contentPane.add(tResponsavel);
		
		JLabel lblNewLabel_2_1 = new JLabel("SE ESTIVER TUDO CERTO, CLIQUE NO BOTÃO \"OK\"");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setBackground(Color.ORANGE);
		lblNewLabel_2_1.setToolTipText("");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(357, 623, 460, 52);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroVaga c1 = new CadastroVaga();
				c1.setNome_vaga(tNome.getText());
				c1.setCarga_horaria(tCargaHr.getText());
				c1.setModelo(tModelo.getText());
				c1.setSalario(tSalario.getText());
				c1.setRequisitos(tRequisitos.getText());
				c1.setEscolaridade(tEscolaridade.getText());
				c1.setSoft_skills(tSoft.getText());
				c1.setHard_skills(tHard.getText());
				c1.setResponsavel(Singleton.getInstance().nomeFuncionario);			
				
				try {
					Connection con = Conexao.faz_conexao();
					String sql = "insert into Vagas(nome_vaga, carga_horaria, modelo, salario, responsavel, requisitos, escolaridade, soft_skills, hard_skills) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
					
					PreparedStatement stmt = con.prepareStatement(sql);
					stmt.setString(1, c1.getNome_vaga());
					stmt.setString(2, c1.getCarga_horaria());
					stmt.setString(3, c1.getModelo());
					stmt.setString(4, c1.getSalario());
					stmt.setString(6, c1.getRequisitos());
					stmt.setString(5, c1.getResponsavel());
					stmt.setString(7, c1.getEscolaridade());
					stmt.setString(8, c1.getSoft_skills());
					stmt.setString(9, c1.getHard_skills());
					
				stmt.execute();
				stmt.close();
				con.close();
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso! Visualizando Vagas");
<<<<<<< HEAD
				TelaOpcoes exibir = new TelaOpcoes();
				exibir.setVisible(true);
				setVisible(false);

=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
				TelaOpcoes exibir = new TelaOpcoes();
				exibir.setVisible(true);
				setVisible(false);
>>>>>>> afe0cdae6d49d8007ca0ed4ba6870dd284a2e912
=======
				TelaOpcoes exibir = new TelaOpcoes();
				exibir.setVisible(true);
				setVisible(false);
>>>>>>> 322a9936030b9c344c21c16d7e507bc9f2e2c06f
>>>>>>> 9e39f517243bc70c0af4be67628828012637e400
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, "Faltando informações obrigatórias!!");
					
				}
				
			}
		});
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(833, 623, 156, 52);
		btnNewButton.setForeground(Color.BLACK);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconPro4Tech.jpg"));
		lblNewLabel_1_1.setBounds(0, 0, 500, 95);
		contentPane.add(lblNewLabel_1_1);
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 322a9936030b9c344c21c16d7e507bc9f2e2c06f
		
>>>>>>> 9e39f517243bc70c0af4be67628828012637e400
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
		btnVoltar.setBounds(10, 783, 156, 52);
		contentPane.add(btnVoltar);
<<<<<<< HEAD

=======
<<<<<<< HEAD
>>>>>>> afe0cdae6d49d8007ca0ed4ba6870dd284a2e912
=======
>>>>>>> 322a9936030b9c344c21c16d7e507bc9f2e2c06f
>>>>>>> 9e39f517243bc70c0af4be67628828012637e400
	}
}