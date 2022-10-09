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

import com.mysql.cj.protocol.a.StringValueEncoder;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class TelaVisualizacao extends JFrame implements ActionListener {
		
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String JLabel = null;
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
	
	JLabel lblNewLabel = new JLabel("");
	JLabel lblNewLabel_1 = new JLabel("VOCÊ ESTÁ NA PÁGINA DE VISUALIZAÇÃO DE VAGAS!\r\n\r\n");
	JLabel lblNewLabel_1_1 = new JLabel("SELECIONE ABAIXO A VAGA DE INTERESSE \r\n\r\n");
	JLabel icon2 = new JLabel("");
	JLabel lblNewLabel_3 = new JLabel("");
	JLabel lblNewLabel_5 = new JLabel("");
	JLabel lblNewLabel_7 = new JLabel("");
	JLabel lblNewLabel_9 = new JLabel("");
	private final JButton btnNewButton = new JButton("Detalhes");
	
	
	
	
	
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
		
		lblNewLabel.setBounds(0, 0, 579, 109);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconPro4Tech.jpg"));
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1.setBounds(108, 119, 673, 46);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		getContentPane().add(lblNewLabel_1);
		
		
		lblNewLabel_1_1.setBounds(108, 159, 471, 46);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		getContentPane().add(lblNewLabel_1_1);
		
		vagasDAO c1 = new vagasDAO();
		ArrayList<String >vg = c1.vagas();
		
		

		JComboBox<String> cbxvaga = new JComboBox<String>();
		for(String item: vg) {
			cbxvaga.addItem(item);
		}
		cbxvaga.setBounds(409, 237, 726, 55);
		cbxvaga.addActionListener(this);
		contentPane.add(cbxvaga);
		
		
		icon2.setBounds(284, 633, 48, 55);
		getContentPane().add(icon2);
		
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\TI ADCe\\Documents\\Tobias\\Dev\\Projeto Thunder\\WhatsApp Unknown 2022-10-04 at 21.32.56\\WhatsApp Image 2022-10-03 at 21.01.43 (2).jpeg"));
		lblNewLabel_3.setBounds(307, 474, 53, 64);
		contentPane.add(lblNewLabel_3);
		
		

		
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\TI ADCe\\Documents\\Tobias\\Dev\\Projeto Thunder\\WhatsApp Unknown 2022-10-04 at 21.32.56\\WhatsApp Image 2022-10-03 at 21.01.43.jpeg"));
		lblNewLabel_5.setBounds(307, 635, 53, 53);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\TI ADCe\\Documents\\Tobias\\Dev\\Projeto Thunder\\WhatsApp Unknown 2022-10-04 at 21.32.56\\WhatsApp Image 2022-10-03 at 21.01.43 (1).jpeg"));
		lblNewLabel_7.setBounds(822, 474, 53, 64);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\TI ADCe\\Documents\\Tobias\\Dev\\Projeto Thunder\\WhatsApp Unknown 2022-10-04 at 21.32.56\\WhatsApp Image 2022-10-03 at 21.01.42.jpeg"));
		lblNewLabel_9.setBounds(822, 624, 53, 64);
		contentPane.add(lblNewLabel_9);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaDescVaga exibir = new TelaDescVaga();
				exibir.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(1174, 241, 169, 46);
		
		contentPane.add(btnNewButton);
		setLocationRelativeTo(null);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		CadastroVaga c1 = new CadastroVaga();
		JComboBox comboBox = (JComboBox) e.getSource();
		Object selected = comboBox.getSelectedItem();
		String nome = String.valueOf(selected);
		c1.setNome_vaga(nome);
        System.out.println("Selected Item  = " + selected);


	}
}
