package br.edu.ufca.forms.repository;

import br.edu.ufca.forms.model.Campo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampoRepository extends JpaRepository<Campo, Long> {
}
