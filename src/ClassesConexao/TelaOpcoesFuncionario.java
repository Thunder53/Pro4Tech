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

public class TelaOpcoesFuncionario extends JFrame {

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
	public TelaOpcoesFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setAutoscrolls(true);
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));

		setExtendedState(MAXIMIZED_BOTH);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JButton btnNewButton = new JButton("CADASTRAR VAGAS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroVagas exibir = new TelaCadastroVagas();
				exibir.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setAutoscrolls(true);
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBackground(new Color(241, 133, 36));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.setBounds(486, 341, 195, 72);
		contentPane.add(btnNewButton);
		
		JButton btnVisualizarStatus = new JButton("AVALIAR CANDIDATOS");
		btnVisualizarStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVagasCandidato exibir = new TelaVagasCandidato();
				exibir.setVisible(true);
				setVisible(false);
			}
		});
		btnVisualizarStatus.setForeground(Color.BLACK);
		btnVisualizarStatus.setActionCommand("VISUALIZAR STATUS");
		btnVisualizarStatus.setFont(new Font("Arial", Font.BOLD, 16));
		btnVisualizarStatus.setBorderPainted(false);
		btnVisualizarStatus.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnVisualizarStatus.setBackground(new Color(241, 133, 36));
		btnVisualizarStatus.setBounds(852, 340, 195, 75);
		contentPane.add(btnVisualizarStatus);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconPro4Tech.jpg"));
		lblNewLabel_1_2.setBounds(0, 0, 517, 100);
		contentPane.add(lblNewLabel_1_2);
		
		JButton btnEditarVagas = new JButton("EDITAR VAGAS");
		btnEditarVagas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEdicao exibir = new TelaEdicao();
				exibir.setVisible(true);
				setVisible(false);
			}
		});
		btnEditarVagas.setForeground(Color.BLACK);
		btnEditarVagas.setFont(new Font("Arial", Font.BOLD, 16));
		btnEditarVagas.setBorderPainted(false);
		btnEditarVagas.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnEditarVagas.setBackground(new Color(241, 133, 36));
		btnEditarVagas.setAutoscrolls(true);
		btnEditarVagas.setBounds(670, 524, 195, 72);
		contentPane.add(btnEditarVagas);
		
		JLabel TEXT1 = new JLabel("SEJA BEM VINDO!");
		TEXT1.setHorizontalAlignment(SwingConstants.LEFT);
		TEXT1.setFont(new Font("Arial", Font.BOLD, 18));
		TEXT1.setBounds(80, 146, 470, 65);
		contentPane.add(TEXT1);
		
		JLabel TEXT2 = new JLabel("SELECIONE NOS BOTÕES ABAIXO O QUE DESEJA FAZER:");
		TEXT2.setFont(new Font("Arial", Font.BOLD, 18));
		TEXT2.setBounds(79, 177, 577, 76);
		contentPane.add(TEXT2);
		
		JButton EditarVagas_1_1 = new JButton("SAIR");
		EditarVagas_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin exibir = new TelaLogin();
				exibir.setVisible(true);
				setVisible(false);
			}
		});
		EditarVagas_1_1.setForeground(Color.BLACK);
		EditarVagas_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		EditarVagas_1_1.setBorderPainted(false);
		EditarVagas_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		EditarVagas_1_1.setBackground(new Color(241, 133, 36));
		EditarVagas_1_1.setAutoscrolls(true);
		EditarVagas_1_1.setBounds(10, 729, 102, 54);
		contentPane.add(EditarVagas_1_1);
	}
}