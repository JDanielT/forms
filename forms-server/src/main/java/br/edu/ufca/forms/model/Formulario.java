package br.edu.ufca.forms.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name="formularios")
public class Formulario implements Serializable, BaseEntity {
	
	/**
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	
	@Column(length=500)
	private String descricao;
	
	@Column(name="data_inicial")
	@Temporal(TemporalType.DATE)
	private Date dataInicial;
	
	@Column(name="data_final")
	@Temporal(TemporalType.DATE)
	private Date dataFinal;
	
	@ManyToOne
	@JoinColumn(name="usuario_id", referencedColumnName="id")
	private Usuario usuario;
	
	@OneToMany(mappedBy="formulario", cascade=CascadeType.ALL)
	private List<Campo> campos;
	
	@Column(name="formulario_recurso")
	private Boolean formularioRecurso = false;
	
	@ManyToOne(optional = true)
	@JoinColumn(name="formulario_pai")
	private Formulario formularioPai;

}
