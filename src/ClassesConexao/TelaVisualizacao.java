package ClassesConexao;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaVisualizacao extends JFrame {
		
		
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVisualizacao frame = new TelaVisualizacao();
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
	public TelaVisualizacao() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 21, 579, 109);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconPro4Tech.jpg"));
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("VOCÊ ESTÁ NA PÁGINA DE VISUALIZAÇÃO DE VAGAS!\r\n\r\n");
		lblNewLabel_1.setBounds(20, 141, 476, 46);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SELECIONE ABAIXO A VAGA DE INTERESSE \r\n\r\n");
		lblNewLabel_1_1.setBounds(20, 162, 476, 46);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel icon1 = new JLabel("");
		icon1.setLabelFor(icon1);
		icon1.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconTelaVizualizacao (4).jpeg"));
		icon1.setBounds(20, 318, 48, 55);
		getContentPane().add(icon1);
		
		

		JComboBox cbxvaga = new JComboBox();
		cbxvaga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vagasDAO c1 = new vagasDAO();
				ArrayList vg;
				vg = c1.vagas();
			}
		});
		cbxvaga.setBounds(461, 301, 646, 45);
		contentPane.add(cbxvaga);
		
		
		JLabel icon2 = new JLabel("");
		icon2.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconTelaVizualizacao (2).jpeg"));
		icon2.setBounds(20, 384, 48, 55);
		getContentPane().add(icon2);
		
		JLabel icon3 = new JLabel("");
		icon3.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconTelaVizualizacao (1).jpeg"));
		icon3.setBounds(327, 318, 64, 55);
		getContentPane().add(icon3);
	
		
		JLabel lblNewLabel_2 = new JLabel("SELECIONE A VAGA DE SEU INTERESSE!");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2.setBounds(127, 180, 646, 70);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\TI ADCe\\Documents\\Tobias\\Dev\\Projeto Thunder\\WhatsApp Unknown 2022-10-04 at 21.32.56\\WhatsApp Image 2022-10-03 at 21.01.43 (2).jpeg"));
		lblNewLabel_3.setBounds(307, 474, 53, 64);
		contentPane.add(lblNewLabel_3);
		

		JLabel icon4 = new JLabel("");
		icon4.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconTelaVizualizacao (3).jpeg"));
		icon4.setBounds(327, 384, 64, 55);
		getContentPane().add(icon4);
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_4.setBounds(370, 461, 339, 83);
		contentPane.add(lblNewLabel_4);

		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\TI ADCe\\Documents\\Tobias\\Dev\\Projeto Thunder\\WhatsApp Unknown 2022-10-04 at 21.32.56\\WhatsApp Image 2022-10-03 at 21.01.43.jpeg"));
		lblNewLabel_5.setBounds(307, 635, 53, 53);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_6.setBounds(375, 616, 339, 83);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\TI ADCe\\Documents\\Tobias\\Dev\\Projeto Thunder\\WhatsApp Unknown 2022-10-04 at 21.32.56\\WhatsApp Image 2022-10-03 at 21.01.43 (1).jpeg"));
		lblNewLabel_7.setBounds(822, 474, 53, 64);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_8.setBounds(899, 461, 339, 83);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\TI ADCe\\Documents\\Tobias\\Dev\\Projeto Thunder\\WhatsApp Unknown 2022-10-04 at 21.32.56\\WhatsApp Image 2022-10-03 at 21.01.42.jpeg"));
		lblNewLabel_9.setBounds(822, 624, 53, 64);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_10.setBounds(899, 616, 339, 83);
		contentPane.add(lblNewLabel_10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(626, 141, 195, 83);
		contentPane.add(comboBox);
		setLocationRelativeTo(null);
	}
}
