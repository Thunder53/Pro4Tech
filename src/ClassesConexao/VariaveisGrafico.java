package ClassesConexao;



import java.util.Date;

import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class VariaveisGrafico {

		private Float tempodeexperienciainsuficiente;
		private Float formacaoirrelevante;
		private Float perfilinadequado;
		private Float modelodetrabalhoincoerentecomodesejado;
		private Float salarioincompativel;

	
	public VariaveisGrafico() {
	}
	
	 public VariaveisGrafico(Float tempodeexperienciainsuficiente, Float formacaoirrelevante, Float perfilinadequado, Float modelodetrabalhoincoerentecomodesejado, Float salarioincompativel) {
		
	       this.tempodeexperienciainsuficiente = tempodeexperienciainsuficiente;
	       this.formacaoirrelevante = formacaoirrelevante;
	       this.perfilinadequado = perfilinadequado;
	       this.modelodetrabalhoincoerentecomodesejado = modelodetrabalhoincoerentecomodesejado;
	       this.salarioincompativel = salarioincompativel;
	}
	    
	
	public Float getTempodeexperienciainsuficiente() {
		return tempodeexperienciainsuficiente;
	}
	
	public void setTempodeexperienciainsuficiente(Float tempodeexperienciainsuficiente) {
		this.tempodeexperienciainsuficiente = tempodeexperienciainsuficiente;
	}
	
	public Float getFormacaoirrelevante() {
		return formacaoirrelevante;
	}
	
	public void setFormacaoirrelevante(Float formacaoirrelevante) {
		this.formacaoirrelevante = formacaoirrelevante;
	}
	
	public Float getPerfilinadequado() {
		return perfilinadequado;
	}
	
	public void setPerfilinadequado(Float perfilinadequado) {
		this.perfilinadequado = perfilinadequado;
	}
	
	public Float getModelodetrabalhoincoerentecomodesejado() {
		return modelodetrabalhoincoerentecomodesejado;
	}
	
	public void setModelodetrabalhoincoerentecomodesejado(Float modelodetrabalhoincoerentecomodesejado) {
		this.modelodetrabalhoincoerentecomodesejado = modelodetrabalhoincoerentecomodesejado;
	}
	
	public Float getSalarioincompativel() {
		return salarioincompativel;
	}
	
	public void setSalarioincompativel(Float salarioincompativel) {
		this.salarioincompativel = salarioincompativel;
	}

}
