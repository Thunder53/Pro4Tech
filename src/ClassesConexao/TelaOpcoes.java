package ClassesConexao;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaOpcoes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaOpcoes frame = new TelaOpcoes();
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
	public TelaOpcoes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setAutoscrolls(true);
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel_1 = new JLabel("SEJA BEM VINDO!");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(490, 206, 211, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SELECIONE \r\nNOS BOTÕES ABAIXO O QUE DESEJA FAZER:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(0, 246, 1540, 52);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("VISUALIZAR VAGAS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInfoVagas exibir = new TelaInfoVagas();
				exibir.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setAutoscrolls(true);
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.setBounds(506, 360, 195, 72);
		contentPane.add(btnNewButton);
		
		JButton btnVisualizarStatus = new JButton("VISUALIZAR STATUS");
		btnVisualizarStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaStatusCandidato exibir = new TelaStatusCandidato();
				exibir.setVisible(true);
				setVisible(false);
			}
		});
		btnVisualizarStatus.setForeground(Color.BLACK);
		btnVisualizarStatus.setActionCommand("VISUALIZAR STATUS");
		btnVisualizarStatus.setFont(new Font("Arial", Font.BOLD, 16));
		btnVisualizarStatus.setBorderPainted(false);
		btnVisualizarStatus.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnVisualizarStatus.setBackground(Color.ORANGE);
		btnVisualizarStatus.setBounds(783, 359, 195, 75);
		contentPane.add(btnVisualizarStatus);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconPro4Tech.jpg"));
		lblNewLabel_1_2.setBounds(0, 0, 517, 100);
		contentPane.add(lblNewLabel_1_2);
	}
}