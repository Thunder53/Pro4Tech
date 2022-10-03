package ClassesConexao;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

import javax.swing.border.LineBorder;

public class TelaVisualizacao extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TelaVisualizacao() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 21, 579, 109);
		lblNewLabel.setIcon(new ImageIcon("D:\\Users\\Henrique\\eclipse-workspace\\PRO4TECH 22.jpg"));
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
		
		JComboBox CAIXASELECAO = new JComboBox();
		CAIXASELECAO.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		CAIXASELECAO.setModel(new DefaultComboBoxModel(new String[] {"VAGAS"}));
		CAIXASELECAO.setToolTipText("");
		CAIXASELECAO.setBounds(184, 229, 405, 27);
		getContentPane().add(CAIXASELECAO);
		
		JLabel icon1 = new JLabel("");
		icon1.setLabelFor(icon1);
		icon1.setIcon(new ImageIcon("D:\\Users\\Henrique\\eclipse-workspace\\172584_clock_icon (1).png"));
		icon1.setBounds(20, 318, 48, 55);
		getContentPane().add(icon1);
		
		JLabel modelotrabalho = new JLabel("");
		modelotrabalho.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		modelotrabalho.setHorizontalAlignment(SwingConstants.CENTER);
		modelotrabalho.setFont(new Font("Arial", Font.PLAIN, 18));
		modelotrabalho.setBounds(78, 318, 176, 55);
		getContentPane().add(modelotrabalho);
		
		JLabel beneficios = new JLabel("");
		beneficios.setHorizontalAlignment(SwingConstants.CENTER);
		beneficios.setFont(new Font("Arial", Font.PLAIN, 18));
		beneficios.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		beneficios.setBounds(78, 384, 176, 55);
		getContentPane().add(beneficios);
		
		JLabel icon2 = new JLabel("");
		icon2.setIcon(new ImageIcon("D:\\Users\\Henrique\\eclipse-workspace\\9876808_hand_delivery box_box_interaction_package_icon.png"));
		icon2.setBounds(20, 384, 48, 55);
		getContentPane().add(icon2);
		
		JLabel icon3 = new JLabel("");
		icon3.setIcon(new ImageIcon("D:\\Users\\Henrique\\eclipse-workspace\\4579059_check_list_marketing_outline_todo_icon.png"));
		icon3.setBounds(327, 318, 64, 55);
		getContentPane().add(icon3);
		
		JLabel atividades = new JLabel("");
		atividades.setHorizontalAlignment(SwingConstants.CENTER);
		atividades.setFont(new Font("Arial", Font.PLAIN, 18));
		atividades.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		atividades.setBounds(400, 318, 176, 55);
		getContentPane().add(atividades);
		
		JLabel icon4 = new JLabel("");
		icon4.setIcon(new ImageIcon("D:\\Users\\Henrique\\eclipse-workspace\\9027041_student_thin_icon.png"));
		icon4.setBounds(327, 384, 64, 55);
		getContentPane().add(icon4);
		
		JLabel requisito = new JLabel("");
		requisito.setHorizontalAlignment(SwingConstants.CENTER);
		requisito.setFont(new Font("Arial", Font.PLAIN, 18));
		requisito.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		requisito.setBounds(400, 384, 176, 55);
		getContentPane().add(requisito);
	}
}
