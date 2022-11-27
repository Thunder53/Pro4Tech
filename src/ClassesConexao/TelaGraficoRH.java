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
	
	public void criarGrafico() {
		
		
		try {
			
			Connection con = Conexao.faz_conexao();
			
			String sql = "select count(feedback_pontual) from Inscricao where feedback_pontual = 'Tempo de experiência insuficiente'";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
					
			while (rs.next()) {
				String a = rs.getString("count(feedback_pontual)");
				int numeroConvertido = Integer.parseInt(a);
				Singleton.getInstance().tempo = numeroConvertido;
				System.out.println(a);
			}
			rs.close();
			con.close();
			}
			
		catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			
			Connection con = Conexao.faz_conexao();
			
			String sql = "select count(feedback_pontual) from Inscricao where feedback_pontual = 'Formação irrelevante'";
			PreparedStatement stmt1 = con.prepareStatement(sql);
			ResultSet rs1 = stmt1.executeQuery();
		
			while (rs1.next()) {
				String a1 = rs1.getString("count(feedback_pontual)");
				int numeroConvertido1 = Integer.parseInt(a1);
				Singleton.getInstance().formacao = numeroConvertido1;
				System.out.println(a1);
			}
			rs1.close();
			con.close();
			}
			
		catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			
			Connection con = Conexao.faz_conexao();
			
			String sql = "select count(feedback_pontual) from Inscricao where feedback_pontual = 'Perfil inadequado'";
			PreparedStatement stmt2 = con.prepareStatement(sql);
			ResultSet rs2 = stmt2.executeQuery();
		
			while (rs2.next()) {
				String a2 = rs2.getString("count(feedback_pontual)");
				int numeroConvertido2 = Integer.parseInt(a2);
				Singleton.getInstance().perfil = numeroConvertido2;
				System.out.println(a2);
			}
			rs2.close();
			con.close();
			}
			
		catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			
			Connection con = Conexao.faz_conexao();
			
			String sql = "select count(feedback_pontual) from Inscricao where feedback_pontual = 'Modelo de trabalho incoerente com o desejado'";
			PreparedStatement stmt3 = con.prepareStatement(sql);
			ResultSet rs3 = stmt3.executeQuery();
		
			while (rs3.next()) {
				String a3 = rs3.getString("count(feedback_pontual)");
				int numeroConvertido3 = Integer.parseInt(a3);
				Singleton.getInstance().modelo = numeroConvertido3;
				System.out.println(a3);
			}
			rs3.close();
			con.close();
			}
			
		catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			
			Connection con = Conexao.faz_conexao();
			
			String sql = "select count(feedback_pontual) from Inscricao where feedback_pontual = 'Salário incompatível'";
			PreparedStatement stmt4 = con.prepareStatement(sql);
			ResultSet rs4 = stmt4.executeQuery();
		
			while (rs4.next()) {
				String a4 = rs4.getString("count(feedback_pontual)");
				int numeroConvertido4 = Integer.parseInt(a4);
				Singleton.getInstance().salario = numeroConvertido4;
				System.out.println(a4);	
			}
			rs4.close();
			con.close();
			}
			
		catch (SQLException e1) {
			e1.printStackTrace();
		}
	
					
		DefaultCategoryDataset barra = new DefaultCategoryDataset();
				
		/** esse primeiro valor após o setValue que vou ter que puxar do banco de dados a quantidade que o RH colocar na avaliação */
		
		barra.setValue(Singleton.getInstance().tempo,"Tempo de experiência insuficiente","");
		barra.setValue(Singleton.getInstance().formacao,"Formação irrelevante","");
		barra.setValue(Singleton.getInstance().perfil,"Perfil inadequado","");
		barra.setValue(Singleton.getInstance().modelo,"Modelo de trabalho incoerente com o desejado","");
		barra.setValue(Singleton.getInstance().salario,"Salário incompatível","");
	
		JFreeChart grafico = ChartFactory.createBarChart3D("Motivos de reprovação selecionados pelo RH","Feedback pontual","Quantidade de reprovações",barra,PlotOrientation.VERTICAL,true,true,false);
		
		CategoryPlot barraItem = grafico.getCategoryPlot();
		barraItem.getRenderer().setSeriesPaint(0,Color.ORANGE);
		barraItem.getRenderer().setSeriesPaint(1,Color.BLACK);
		barraItem.getRenderer().setSeriesPaint(2,Color.GREEN);
		barraItem.getRenderer().setSeriesPaint(3,Color.BLUE);
		barraItem.getRenderer().setSeriesPaint(4,Color.YELLOW);
		
		ChartPanel painel = new ChartPanel(grafico);
		add(painel);
	}
		public static void main(String[] args) {
			
		new TelaGraficoRH();
	}
}