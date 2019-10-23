package secao14Entidades;

public class Funcionario {

	private String nome;
	private Integer horas;
	private Double valorHoras;
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, Integer horas, Double valorHoras) {
		this.nome = nome;
		this.horas = horas;
		this.valorHoras = valorHoras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorHoras() {
		return valorHoras;
	}

	public void setValorHoras(Double valorHoras) {
		this.valorHoras = valorHoras;
	}
	
	public double pagamento() {
		return horas * valorHoras;
	}
}
