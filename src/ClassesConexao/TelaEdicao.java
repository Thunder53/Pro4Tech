package ClassesConexao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.JComboBox;

public class TelaEdicao extends JFrame {

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
					TelaEdicao frame = new TelaEdicao();
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
	public TelaEdicao() {
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
		
		JLabel lblNewLabel_1 = new JLabel("VOCÊ ESTÁ NA PÁGINA DE EDIÇÃO DE VAGAS!\r\n");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(357, 151, 591, 52);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("NOME VAGA");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(538, 325, 143, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CARGA HORÁRIA ");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(498, 360, 180, 28);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("MODELO DE TRABALHO");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(436, 401, 247, 35);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("SALÁRIO");
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(568, 446, 115, 28);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("REQUISITOS");
		lblNewLabel_7.setForeground(Color.BLACK);
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(538, 484, 156, 28);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("ESCOLARIDADE");
		lblNewLabel_8.setForeground(Color.BLACK);
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(509, 522, 156, 28);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("SOFT SKILLS DESEJADAS");
		lblNewLabel_9.setForeground(Color.BLACK);
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(422, 560, 247, 28);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("HARD SKILLS DESEJADAS");
		lblNewLabel_10.setForeground(Color.BLACK);
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(422, 605, 247, 28);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("RESPONSÁVEL");
		lblNewLabel_11.setForeground(Color.BLACK);
		lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_11.setBounds(509, 643, 156, 28);
		contentPane.add(lblNewLabel_11);
		
		JComboBox cbxvagas = new JComboBox();
		cbxvagas.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				 vagasDAO dao = new vagasDAO();
			        
			        ArrayList <String> vg = dao.vagas();
			        cbxvagas.removeAll();
			        for(String f:vg){
			            
			            cbxvagas.addItem(f);
			            
			        }
				
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		cbxvagas.setBounds(524, 225, 541, 54);
		contentPane.add(cbxvagas);
		
		tNome = new JTextField();
		tNome.setFont(new Font("Arial", Font.PLAIN, 20));
		tNome.setForeground(Color.BLACK);
		tNome.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				Object vaga = cbxvagas.getSelectedItem();
				Singleton.getInstance().nomeVaga = String.valueOf(vaga);
				try {
					Connection con = Conexao.faz_conexao();
					String sql = "select * from vagas where nome = '" + Singleton.getInstance().nomeVaga + "'";
					PreparedStatement stmt = con.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery();
					while(rs.next()) {
						tNome.setText(rs.getString("experiencia_profissional"));
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
		tNome.setBounds(665, 324, 400, 28);
		contentPane.add(tNome);
		tNome.setColumns(10);
		
		tCargaHr = new JTextField();
		tCargaHr.setFont(new Font("Arial", Font.PLAIN, 20));
		tCargaHr.setForeground(Color.BLACK);
		tCargaHr.setColumns(10);
		tCargaHr.setBounds(665, 363, 400, 28);
		contentPane.add(tCargaHr);
		
		tModelo = new JTextField();
		tModelo.setFont(new Font("Arial", Font.PLAIN, 20));
		tModelo.setForeground(Color.BLACK);
		tModelo.setColumns(10);
		tModelo.setBounds(665, 402, 400, 28);
		contentPane.add(tModelo);
		
		tSalario = new JTextField();
		tSalario.setFont(new Font("Arial", Font.PLAIN, 20));
		tSalario.setForeground(Color.BLACK);
		tSalario.setColumns(10);
		tSalario.setBounds(665, 441, 400, 28);
		contentPane.add(tSalario);
		
		tRequisitos = new JTextField();
		tRequisitos.setFont(new Font("Arial", Font.PLAIN, 20));
		tRequisitos.setForeground(Color.BLACK);
		tRequisitos.setColumns(10);
		tRequisitos.setBounds(665, 480, 400, 28);
		contentPane.add(tRequisitos);
		
		tEscolaridade = new JTextField();
		tEscolaridade.setFont(new Font("Arial", Font.PLAIN, 20));
		tEscolaridade.setForeground(Color.BLACK);
		tEscolaridade.setColumns(10);
		tEscolaridade.setBounds(665, 519, 400, 28);
		contentPane.add(tEscolaridade);
		
		tSoft = new JTextField();
		tSoft.setFont(new Font("Arial", Font.PLAIN, 20));
		tSoft.setForeground(Color.BLACK);
		tSoft.setColumns(10);
		tSoft.setBounds(665, 563, 400, 28);
		contentPane.add(tSoft);
		
		tHard = new JTextField();
		tHard.setFont(new Font("Arial", Font.PLAIN, 20));
		tHard.setForeground(Color.BLACK);
		tHard.setColumns(10);
		tHard.setBounds(665, 605, 400, 28);
		contentPane.add(tHard);
		
		tResponsavel = new JTextField();
		tResponsavel.setEditable(false);
		tResponsavel.setText(Singleton.getInstance().nomeFuncionario);
		tResponsavel.setFont(new Font("Arial", Font.PLAIN, 20));
		tResponsavel.setForeground(Color.BLACK);
		tResponsavel.setColumns(10);
		tResponsavel.setBounds(665, 642, 400, 28);
		contentPane.add(tResponsavel);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\TI ADCe\\Documents\\Tobias\\Dev\\Projeto\\Pro4Tech\\icons\\iconPro4Tech.jpg"));
		lblNewLabel_1_1.setBounds(0, 0, 500, 95);
		contentPane.add(lblNewLabel_1_1);
		
		
		JButton FinalizarVaga = new JButton("FINALIZAR VAGA");
		FinalizarVaga.setForeground(Color.BLACK);
		FinalizarVaga.setFont(new Font("Arial", Font.BOLD, 18));
		FinalizarVaga.setBorderPainted(false);
		FinalizarVaga.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		FinalizarVaga.setBackground(new Color(241, 133, 36));
		FinalizarVaga.setBounds(525, 709, 192, 52);
		contentPane.add(FinalizarVaga);
		
		JButton Salvar = new JButton("SALVAR");
		Salvar.setForeground(Color.BLACK);
		Salvar.setFont(new Font("Arial", Font.BOLD, 18));
		Salvar.setBorderPainted(false);
		Salvar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Salvar.setBackground(new Color(241, 133, 36));
		Salvar.setBounds(873, 709, 192, 52);
		contentPane.add(Salvar);
	}
}
