package imcvirtual;

public class Atleta extends Pessoa {
	private String esportePraticado;

	public Atleta(String nome, double peso, double altura, String esportePraticado) {
		super(nome, peso, altura);
		this.esportePraticado = esportePraticado;
	}


	@Override
	public double calcularIMC(double altura, double peso) {
		return super.calcularIMC(altura, peso) * 0.95;
	}
	public String getesportePraticado() {
		return esportePraticado;
	}
	 public void setEsportePraticado(String esportePraticado) {
	        this.esportePraticado = esportePraticado;
	    }
	}


