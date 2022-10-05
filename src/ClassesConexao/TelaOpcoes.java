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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Users\\Vitoria Brancatti\\Documents\\FATEC\\PRO4TEC\\PRO4TECH 22.jpg"));
		lblNewLabel.setBounds(20, 11, 819, 140);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SEJA BEM VINDO!");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(424, 205, 169, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SELECIONE \r\nNOS BOTÕES ABAIXO O QUE DESEJA FAZER:");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(424, 246, 591, 52);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("VISUALIZAR VAGAS");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setAutoscrolls(true);
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.setBounds(614, 320, 194, 35);
		contentPane.add(btnNewButton);
		
		JButton btnVisualizarStatus = new JButton("VISUALIZAR STATUS");
		btnVisualizarStatus.setActionCommand("VISUALIZAR STATUS");
		btnVisualizarStatus.setFont(new Font("Arial", Font.BOLD, 16));
		btnVisualizarStatus.setBorderPainted(false);
		btnVisualizarStatus.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnVisualizarStatus.setBackground(Color.ORANGE);
		btnVisualizarStatus.setBounds(614, 366, 194, 35);
		contentPane.add(btnVisualizarStatus);
	}
}
