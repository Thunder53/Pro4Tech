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
import java.awt.Color;

public class TelaVisualizacaoCurriculo extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtEscrevaBrevementeSobre;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtFeedbackSobreO;

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
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(102, 414, 563, 138);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Arial", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"PER\u00CDODO", "CARGO", "EMPRESA", "ATIVIDADES"
			}
		));
		scrollPane.setViewportView(table);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\TI ADCe\\Documents\\Tobias\\Dev\\Projeto Thunder\\Pro4Tech\\Pro4Tech\\Pro4Tech\\icons\\iconPro4Tech.jpg"));
		lblNewLabel.setBounds(10, 10, 500, 109);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("VISUALIZAÇÃO CURRÍCULO");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(79, 154, 275, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("QUEM SOU EU?");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(89, 197, 157, 22);
		contentPane.add(lblNewLabel_2);
		
		txtEscrevaBrevementeSobre = new JTextField();
		txtEscrevaBrevementeSobre.setDropMode(DropMode.INSERT);
		txtEscrevaBrevementeSobre.setColumns(10);
		txtEscrevaBrevementeSobre.setToolTipText("Sobre você!");
		txtEscrevaBrevementeSobre.setText("Escreva brevemente sobre você");
		txtEscrevaBrevementeSobre.setFont(new Font("Arial", Font.PLAIN, 20));
		txtEscrevaBrevementeSobre.setBounds(102, 229, 639, 98);
		contentPane.add(txtEscrevaBrevementeSobre);
		
		JLabel lblNewLabel_3 = new JLabel("FORMAÇÃO");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(843, 197, 121, 22);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 18));
		textField.setToolTipText("Formação da mais recente até a mais antiga!");
		textField.setBounds(853, 235, 386, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Formação da mais recente até a mais antiga!");
		textField_1.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(853, 278, 386, 33);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("Formação da mais recente até a mais antiga!");
		textField_2.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(853, 321, 386, 33);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_4 = new JLabel("EXPERIÊNCIA PROFISSIONAL");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(89, 364, 262, 40);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_APROVADO = new JButton("APROVADO");
		btnNewButton_APROVADO.setForeground(Color.BLACK);
		btnNewButton_APROVADO.setBackground(new Color(241, 133, 36));
		btnNewButton_APROVADO.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_APROVADO.setBounds(1167, 402, 156, 52);
		contentPane.add(btnNewButton_APROVADO);
		
		JButton btnReprovado = new JButton("REPROVADO");
		btnReprovado.setForeground(Color.BLACK);
		btnReprovado.setFont(new Font("Arial", Font.PLAIN, 18));
		btnReprovado.setBackground(new Color(241, 133, 36));
		btnReprovado.setBounds(1167, 525, 156, 52);
		contentPane.add(btnReprovado);
		
		JLabel lblNewLabel_9 = new JLabel("FEEDBACK GERAL:");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(89, 554, 191, 40);
		contentPane.add(lblNewLabel_9);
		
		txtFeedbackSobreO = new JTextField();
		txtFeedbackSobreO.setFont(new Font("Arial", Font.PLAIN, 18));
		txtFeedbackSobreO.setText("Feedback sobre o candidato");
		txtFeedbackSobreO.setBounds(132, 593, 867, 63);
		contentPane.add(txtFeedbackSobreO);
		txtFeedbackSobreO.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("FEEDBACK PONTUAL:");
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(89, 691, 206, 22);
		contentPane.add(lblNewLabel_10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Feedback breve");
		comboBox.setMaximumRowCount(10);
		comboBox.setFont(new Font("Arial", Font.PLAIN, 18));
		comboBox.setBounds(132, 735, 867, 21);
		contentPane.add(comboBox);
	}

}
