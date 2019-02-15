package br.edu.ufca.forms.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name="itens_submissoes")
public class ItemSubmissao implements Serializable, BaseEntity {

	/**
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="submissao_id", referencedColumnName="id")
	private Submissao submissao;
	
	@ManyToOne
	@JoinColumn(name="campo_id", referencedColumnName="id")
	private Campo campo;
	
	@Column(columnDefinition="TEXT")
	private String conteudo;

}
