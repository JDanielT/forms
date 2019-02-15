package br.edu.ufca.forms.repository;

import br.edu.ufca.forms.model.RedefinicaoSenha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedefinicaoSenhaRepository extends JpaRepository<RedefinicaoSenha, Long> {
}
