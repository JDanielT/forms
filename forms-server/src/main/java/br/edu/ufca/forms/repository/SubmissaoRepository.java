package br.edu.ufca.forms.repository;

import br.edu.ufca.forms.model.Submissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmissaoRepository extends JpaRepository<Submissao, Long> {
}
