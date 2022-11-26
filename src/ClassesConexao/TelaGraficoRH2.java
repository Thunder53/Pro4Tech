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
import java.sql.Statement;

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
	public void consultar() {
		Statement s = null;
		Connection con = Conexao.faz_conexao();
		
		try {
			s = (Statement) connection.createStatement();
			ResultSet r = null;
			
			//como passar esse resutlado para a variavel Tempodeexperienciainsuficiente, da classe VariaveisGrafico?
			r = s.executeQuery("Select count(*) from incricao where feedback_pontual like 'Tempo de experiência insuficiente'");
			ResultSet t = null;
			t = s.executeQuery("Select count(*) from incricao where feedback_pontual like 'Formação irrelevante'");
			ResultSet u = null;
			u = s.executeQuery("Select count(*) from incricao where feedback_pontual like 'Perfil inadequado'");
			ResultSet v = null;
			v = s.executeQuery("Select count(*) from incricao where feedback_pontual like 'Modelo de trabalho incoerente com o desejado'");
			ResultSet x = null;
			x = s.executeQuery("Select count(*) from incricao where feedback_pontual like 'Salário incompatível'");
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void criarGrafico() {
		
		DefaultCategoryDataset barra = new DefaultCategoryDataset();
				
		/** esse primeiro valor após o setValue que vou ter que puxar do banco de dados a quantidade que o RH colocar na avaliação */
		
		barra.setValue(r,"Tempo de experiência insuficiente","");
		barra.setValue(t,"Formação irrelevante","");
		barra.setValue(u,"Perfil inadequado","");
		barra.setValue(v,"Modelo de trabalho incoerente com o desejado","");
		barra.setValue(x,"Salário incompatível","");
			
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


