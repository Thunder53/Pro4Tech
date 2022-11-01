package ClassesConexao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class TelaVagasCandidato extends JFrame {

	private JPanel contentPane;
	private JTable tbCandidato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVagasCandidato frame = new TelaVagasCandidato();
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
	public TelaVagasCandidato() {
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
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ariane Sousa\\Desktop\\PROJETOS\\Pro4Tech\\icons\\iconPro4Tech.jpg"));
		lblNewLabel.setBounds(0, 0, 553, 90);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("VOCÊ ESTÁ NA PÁGINA DE AVALIZAÇÃO DE CANDIDATOS");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(89, 158, 569, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SELECIONE ABAIXO A VAGA PARA INICIAR O PROCESSO");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(89, 187, 569, 33);
		contentPane.add(lblNewLabel_1_1);
		
		JComboBox cbxVaga = new JComboBox();
		cbxVaga.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				 vagasDAO dao = new vagasDAO();
			        
			        ArrayList <String> vgc = dao.vagas();
			        cbxVaga.removeAll();
			        for(String f:vgc){
			            cbxVaga.addItem(f);
			        }
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		cbxVaga.setBounds(293, 360, 309, 42);
		contentPane.add(cbxVaga);
		
		JComboBox cbxCandidato = new JComboBox();
		cbxCandidato.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				 vagasDAO dao = new vagasDAO();
			        
			        ArrayList <String> candidato = dao.candidato();
			        cbxCandidato.removeAll();
			        for(String f:candidato){
			            
			            cbxCandidato.addItem(f);
			            
			        }
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		cbxCandidato.setBounds(751, 360, 247, 42);
		contentPane.add(cbxCandidato);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(405, 500, 593, 175);
		contentPane.add(scrollPane);
		
		tbCandidato = new JTable();
		tbCandidato.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"NOME", "DATA DE NASCIMENTO", "E-MAIL/TELEFONE", "ENDERE\u00C7O RESIDENCIAL", "STATUS"
			}
		));
		tbCandidato.getColumnModel().getColumn(1).setPreferredWidth(139);
		tbCandidato.getColumnModel().getColumn(2).setPreferredWidth(187);
		tbCandidato.getColumnModel().getColumn(3).setPreferredWidth(224);
		scrollPane.setViewportView(tbCandidato);
	}
}
