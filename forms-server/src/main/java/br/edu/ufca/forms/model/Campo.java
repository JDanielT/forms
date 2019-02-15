package br.edu.ufca.forms.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.management.ConstructorParameters;
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
@EqualsAndHashCode(of = {"id", "name"})
@Entity
@Table(name = "campos")
public class Campo implements Serializable, BaseEntity {

    /**
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "formulario_id")
    private Formulario formulario;

    private String label;

    private String name;

    private String tipo;

    private boolean requerido = true;

    private String guiaUsuario;

    @Column(columnDefinition = "TEXT")
    private String opcoes;

    @ManyToOne(optional = true)
    @JoinColumn(name = "campo_condicao_id")
    private Campo campoCondicao;

    @Column(name = "valor_condicao", columnDefinition = "TEXT")
    private String valorCondicao;

    private Boolean visivel = true;

    private Boolean unico = false;
    
    private Boolean alteravel = true;
    
    @Column(nullable = true)
    private Integer ordem;

}
