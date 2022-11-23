package ClassesConexao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class TelaGraficoRH extends JFrame {
			
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public TelaGraficoRH() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Gráfico Feedback Pontual");
		setSize(1920, 1080);
		setLocationRelativeTo(null);
		criarGrafico();
		setVisible(true);
		setExtendedState(MAXIMIZED_BOTH);
	}	
	
	public void criarGrafico() {
		
		DefaultCategoryDataset barra = new DefaultCategoryDataset();
				
		/** esse primeiro valor após o setValue que vou ter que puxar do banco de dados a quantidade que o RH colocar na avaliação */
		
		barra.setValue(50,"Tempo de experiência insuficiente","");
		barra.setValue(40,"Formação irrelevante","");
		barra.setValue(30,"Perfil inadequado","");
		barra.setValue(20,"Modelo de trabalho incoerente com o desejado","");
		barra.setValue(10,"Salário incompatível","");
			
		JFreeChart grafico = ChartFactory.createBarChart3D("Motivos de reprovação setados pelo RH","Feedback pontual","Quanrtidade de reprovações",barra,PlotOrientation.VERTICAL,true,true,false);
		
		CategoryPlot barraItem = grafico.getCategoryPlot();
		barraItem.getRenderer().setSeriesPaint(0,Color.ORANGE);
		barraItem.getRenderer().setSeriesPaint(1,Color.ORANGE);
		barraItem.getRenderer().setSeriesPaint(2,Color.ORANGE);
		barraItem.getRenderer().setSeriesPaint(3,Color.ORANGE);
		barraItem.getRenderer().setSeriesPaint(4,Color.ORANGE);
		
		ChartPanel painel = new ChartPanel(grafico);
		add(painel);
	}
		public static void main(String[] args) {
			
		new TelaGraficoRH();
	}
}


