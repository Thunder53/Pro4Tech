package ClassesConexao;

import java.awt.EventQueue;

import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Color;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.SwingConstants;

public class TelaVisualizacaoCurriculo extends JFrame {

	private JPanel contentPane;
	private JTextField tfQuemSouEu;
	private JTextField tfFormacao;
	private JTextField txtFeedbackSobreO;
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
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(79, 154, 275, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("QUEM SOU EU?");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(79, 197, 157, 22);
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
					String sql = "select * from cadastro_usuario where nome = '" + Singleton.getInstance().VisuCurriculo + "'";
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
		tfQuemSouEu.setBounds(79, 229, 639, 98);
		contentPane.add(tfQuemSouEu);
		
		JLabel lblNewLabel_3 = new JLabel("FORMAÇÃO");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(843, 197, 121, 22);
		contentPane.add(lblNewLabel_3);
		
		tfFormacao = new JTextField();
		tfFormacao.setDisabledTextColor(Color.BLACK);
		tfFormacao.setCaretColor(Color.BLACK);
		tfFormacao.setForeground(Color.BLACK);
		tfFormacao.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				try {
					Connection con = Conexao.faz_conexao();
					String sql = "select * from cadastro_usuario where nome = '" + Singleton.getInstance().VisuCurriculo + "'";
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
		tfFormacao.setBounds(843, 229, 622, 96);
		contentPane.add(tfFormacao);
		tfFormacao.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("EXPERIÊNCIA PROFISSIONAL");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(79, 364, 262, 40);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_APROVADO = new JButton("APROVADO");
		btnNewButton_APROVADO.setForeground(Color.BLACK);
		btnNewButton_APROVADO.setBackground(new Color(241, 133, 36));
		btnNewButton_APROVADO.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_APROVADO.setBounds(1309, 419, 156, 52);
		contentPane.add(btnNewButton_APROVADO);
		
		JButton btnReprovado = new JButton("REPROVADO");
		btnReprovado.setForeground(Color.BLACK);
		btnReprovado.setFont(new Font("Arial", Font.PLAIN, 18));
		btnReprovado.setBackground(new Color(241, 133, 36));
		btnReprovado.setBounds(1309, 529, 156, 52);
		contentPane.add(btnReprovado);
		
		JLabel lblNewLabel_9 = new JLabel("FEEDBACK GERAL:");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(79, 554, 191, 40);
		contentPane.add(lblNewLabel_9);
		
		txtFeedbackSobreO = new JTextField();
		txtFeedbackSobreO.setCaretColor(Color.BLACK);
		txtFeedbackSobreO.setHorizontalAlignment(SwingConstants.LEFT);
		txtFeedbackSobreO.setForeground(Color.BLACK);
		txtFeedbackSobreO.setFont(new Font("Arial", Font.PLAIN, 18));
		txtFeedbackSobreO.setBounds(79, 593, 867, 63);
		contentPane.add(txtFeedbackSobreO);
		txtFeedbackSobreO.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("FEEDBACK PONTUAL:");
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(79, 691, 206, 22);
		contentPane.add(lblNewLabel_10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.BLACK);
		comboBox.setToolTipText("Feedback breve");
		comboBox.setMaximumRowCount(10);
		comboBox.setFont(new Font("Arial", Font.PLAIN, 18));
		comboBox.setBounds(79, 734, 867, 21);
		contentPane.add(comboBox);
		
		tfExperiencia = new JTextField();
		tfExperiencia.setDisabledTextColor(Color.BLACK);
		tfExperiencia.setCaretColor(Color.BLACK);
		tfExperiencia.setHorizontalAlignment(SwingConstants.LEFT);
		tfExperiencia.setForeground(Color.BLACK);
		tfExperiencia.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				try {
					Connection con = Conexao.faz_conexao();
					String sql = "select * from cadastro_usuario where nome = '" + Singleton.getInstance().VisuCurriculo + "'";
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
		tfExperiencia.setBounds(79, 421, 639, 98);
		contentPane.add(tfExperiencia);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(208, 10, 553, 90);
		contentPane.add(lblNewLabel_5);
	}
}
