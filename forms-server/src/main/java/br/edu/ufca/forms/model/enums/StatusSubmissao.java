package br.edu.ufca.forms.model.enums;

public enum StatusSubmissao {
	
	EM_ANALISE("EM ANALISE"), DEFERIDO("DEFERIDO - CONFIRMADA"), INDEFERIDO("INDEFERIDO - CANCELADA");
	
	private String descricao;
	
	private StatusSubmissao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override  
	public String toString() {
		return descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
