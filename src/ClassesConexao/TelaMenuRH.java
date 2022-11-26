

package ClassesConexao;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaMenuRH extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenuRH frame = new TelaMenuRH();
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
	public TelaMenuRH() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LOGO = new JLabel("");
		LOGO.setIcon(new ImageIcon("C:\\Users\\TI ADCe\\Documents\\Tobias\\Dev\\Projeto\\Pro4Tech\\icons\\iconPro4Tech.jpg"));
		LOGO.setBounds(28, 31, 555, 105);
		contentPane.add(LOGO);
		
		JLabel TEXT1 = new JLabel("SEJA BEM VINDO!");
		TEXT1.setHorizontalAlignment(SwingConstants.LEFT);
		TEXT1.setFont(new Font("Arial", Font.PLAIN, 18));
		TEXT1.setBounds(126, 169, 470, 65);
		contentPane.add(TEXT1);
		
		JLabel TEXT2 = new JLabel("SELECIONE NOS BOTÕES ABAIXO O QUE DESEJA FAZER:");
		TEXT2.setFont(new Font("Arial", Font.PLAIN, 18));
		TEXT2.setBounds(125, 200, 577, 76);
		contentPane.add(TEXT2);
		
		JButton AvaliarCandidatos = new JButton("AVALIAR CANDIDATOS");
		AvaliarCandidatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVisualizacaoCurriculo exibir = new TelaVisualizacaoCurriculo();
				exibir.setVisible(true);
				setVisible(false);
			}
		});
		AvaliarCandidatos.setForeground(Color.BLACK);
		AvaliarCandidatos.setFont(new Font("Arial", Font.BOLD, 16));
		AvaliarCandidatos.setBorderPainted(false);
		AvaliarCandidatos.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		AvaliarCandidatos.setBackground(new Color(241, 133, 36));
		AvaliarCandidatos.setAutoscrolls(true);
		AvaliarCandidatos.setBounds(825, 503, 245, 65);
		contentPane.add(AvaliarCandidatos);
		
		JButton CadastrarVagas_1 = new JButton("CADASTRAR VAGAS");
		CadastrarVagas_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroVagas exibir = new TelaCadastroVagas();
				exibir.setVisible(true);
				setVisible(false);
			}
		});
		CadastrarVagas_1.setForeground(Color.BLACK);
		CadastrarVagas_1.setFont(new Font("Arial", Font.BOLD, 16));
		CadastrarVagas_1.setBorderPainted(false);
		CadastrarVagas_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		CadastrarVagas_1.setBackground(new Color(241, 133, 36));
		CadastrarVagas_1.setAutoscrolls(true);
		CadastrarVagas_1.setBounds(427, 363, 245, 65);
		contentPane.add(CadastrarVagas_1);
		
		JButton GerarRelatorios_1 = new JButton("GERAR RELATÓRIOS");
		GerarRelatorios_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaGraficoRH exibir = new TelaGraficoRH();
				exibir.setVisible(true);
				setVisible(false);
			}
		});
		GerarRelatorios_1.setForeground(Color.BLACK);
		GerarRelatorios_1.setFont(new Font("Arial", Font.BOLD, 16));
		GerarRelatorios_1.setBorderPainted(false);
		GerarRelatorios_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		GerarRelatorios_1.setBackground(new Color(241, 133, 36));
		GerarRelatorios_1.setAutoscrolls(true);
		GerarRelatorios_1.setBounds(825, 363, 245, 65);
		contentPane.add(GerarRelatorios_1);
		
		JButton EditarVagas_1 = new JButton("EDITAR VAGAS");
		EditarVagas_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEdicao exibir = new TelaEdicao();
				exibir.setVisible(true);
				setVisible(false);
			}
		});
		EditarVagas_1.setForeground(Color.BLACK);
		EditarVagas_1.setFont(new Font("Arial", Font.BOLD, 16));
		EditarVagas_1.setBorderPainted(false);
		EditarVagas_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		EditarVagas_1.setBackground(new Color(241, 133, 36));
		EditarVagas_1.setAutoscrolls(true);
		EditarVagas_1.setBounds(427, 503, 245, 65);
		contentPane.add(EditarVagas_1);
		setLocationRelativeTo(null);
		setExtendedState(MAXIMIZED_BOTH);
	}
}
