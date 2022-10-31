package ClassesConexao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class TelaVisuCurriculo extends JFrame {

	private JPanel contentPane;
	private JTextField txtEscrevaBrevementeSobre;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtFeedbackSobreO;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVisuCurriculo frame = new TelaVisuCurriculo();
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
	public TelaVisuCurriculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JLabel lblNewLabel_5 = new JLabel("PERÍODO");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(89, 403, 93, 33);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CARGO");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(275, 403, 75, 33);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("EMPRESA");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(438, 403, 109, 33);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("ATIVIDADES");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(627, 403, 111, 33);
		contentPane.add(lblNewLabel_8);
		
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
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("Período");
		textField_3.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_3.setBounds(89, 435, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("Período");
		textField_4.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(89, 464, 96, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("Período");
		textField_5.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(89, 493, 96, 19);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setToolTipText("Período");
		textField_6.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(89, 525, 96, 19);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setToolTipText("Cargo");
		textField_7.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(258, 438, 96, 19);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setToolTipText("Cargo");
		textField_8.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_8.setColumns(10);
		textField_8.setBounds(258, 467, 96, 19);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setToolTipText("Cargo");
		textField_9.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_9.setColumns(10);
		textField_9.setBounds(258, 496, 96, 19);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setToolTipText("Cargo");
		textField_10.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_10.setColumns(10);
		textField_10.setBounds(258, 528, 96, 19);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setToolTipText("Empresa");
		textField_11.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_11.setColumns(10);
		textField_11.setBounds(433, 438, 96, 19);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setToolTipText("Empresa");
		textField_12.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_12.setColumns(10);
		textField_12.setBounds(433, 467, 96, 19);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setToolTipText("Empresa");
		textField_13.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_13.setColumns(10);
		textField_13.setBounds(433, 496, 96, 19);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setToolTipText("Empresa");
		textField_14.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_14.setColumns(10);
		textField_14.setBounds(433, 528, 96, 19);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setToolTipText("Atividades");
		textField_15.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_15.setColumns(10);
		textField_15.setBounds(626, 438, 315, 19);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setToolTipText("Atividades");
		textField_16.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_16.setColumns(10);
		textField_16.setBounds(627, 470, 315, 19);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setToolTipText("Atividades");
		textField_17.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_17.setColumns(10);
		textField_17.setBounds(627, 496, 315, 19);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setToolTipText("Atividades");
		textField_18.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_18.setColumns(10);
		textField_18.setBounds(626, 528, 315, 19);
		contentPane.add(textField_18);
	}
}
