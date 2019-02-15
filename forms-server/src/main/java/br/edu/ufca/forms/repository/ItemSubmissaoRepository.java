package br.edu.ufca.forms.repository;

import br.edu.ufca.forms.model.ItemSubmissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemSubmissaoRepository extends JpaRepository<ItemSubmissao, Long> {
}
