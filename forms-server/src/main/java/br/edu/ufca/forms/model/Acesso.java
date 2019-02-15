package br.edu.ufca.forms.model;

import br.edu.ufca.forms.model.enums.TipoUsuario;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name="acessos")
public class Acesso implements Serializable, BaseEntity {

	/**
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique=true)
	private String login;
	
	private String senha;
	
	@Column(name="ultimo_acesso")
	private Date ultimoAcesso;
 	
	@OneToOne
	private Usuario usuario;
	
	@Column(name="tipo_usuario")
	@Enumerated(EnumType.STRING)
	private TipoUsuario tipoUsuario;

}
