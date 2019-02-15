package br.edu.ufca.forms.repository;

import br.edu.ufca.forms.model.Acesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcessoRepository extends JpaRepository<Acesso, Long> {
}
