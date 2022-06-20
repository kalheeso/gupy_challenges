package algoritmos.distribuidora;

import java.util.List;

public class Distribuidora {
	private String estado;
	private Double faturamento;
	
	public Distribuidora() {
		
	}

	public Distribuidora(String estado, Double faturamento) {
		super();
		this.estado = estado;
		this.faturamento = faturamento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Double getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(Double faturamento) {
		this.faturamento = faturamento;
	}
	
	public static Double faturamentoTodas(List<Distribuidora> list) {
		Double result = 0.0;
		for (Distribuidora dist: list) {
			result += dist.getFaturamento();
		}
		return result;
	}
	
	public Double porcentagemFaturamento(List<Distribuidora> list) {
		return this.getFaturamento() / Distribuidora.faturamentoTodas(list) * 100;
	}
	
	public String toString() {
		return this.getEstado() + ": " + this.getFaturamento();
	}
}
