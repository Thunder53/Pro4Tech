package ClassesConexao;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;

public class TelaPesquisa extends JFrame {

	
	
	private static final long serialVersionUID = 1L;
	private JTextField nome;
	private JPanel contentPane;
	private JTextField pesquisa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPesquisa frame = new TelaPesquisa();
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
	public TelaPesquisa() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		setExtendedState(MAXIMIZED_BOTH);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("d:\\Users\\Henrique\\Desktop\\Pro4Tech-dev\\icons\\iconPro4Tech.jpg"));
		lblNewLabel.setBounds(47, 0, 505, 109);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("VOCÊ ESTÁ NA PÁGINA PARA PESQUISA DE VAGAS!");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(79, 120, 491, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DIGITE ABAIXO A VAGA DE INTERESSE!");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2.setBounds(79, 146, 496, 39);
		contentPane.add(lblNewLabel_2);
		
		pesquisa = new JTextField();
		pesquisa.setBounds(187, 283, 611, 46);
		contentPane.add(pesquisa);
		pesquisa.setColumns(10);
		
		JButton btnNewButton = new JButton("BUSCAR");
		btnNewButton.setBackground(new Color(255, 140, 0));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.setBounds(849, 277, 175, 54);
		contentPane.add(btnNewButton);
	}
}
