package br.edu.ufca.forms.model;

import br.edu.ufca.forms.model.enums.StatusSubmissao;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "submissao")
public class Submissao implements Serializable, BaseEntity {

    /**
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_submissao")
    @Temporal(TemporalType.DATE)
    private Date dataSubmissao;

    @Column(name = "ultima_alteracao")
    @Temporal(TemporalType.DATE)
    private Date ultimaAlteracao;

    @ManyToOne
    @JoinColumn(name = "formulario_id", referencedColumnName = "id")
    private Formulario formulario;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    @Enumerated(EnumType.STRING)
    private StatusSubmissao statusSubmissao = StatusSubmissao.EM_ANALISE;

    @Column(columnDefinition = "TEXT")
    private String motivoIndeferimento;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "submissao")
    private List<ItemSubmissao> itemsSubmissao;

}
