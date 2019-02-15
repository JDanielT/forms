package br.edu.ufca.forms.service;

import br.edu.ufca.forms.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public abstract class AbstractService<T extends BaseEntity> {

    protected abstract JpaRepository getRepository();

    @Transactional
    public T save(T entity) {
        return (T) getRepository().save(entity);
    }

    public List<T> listAll() {
        return getRepository().findAll();
    }

    public void delete(T entity) {
        getRepository().delete(entity);
    }

    public Optional<T> findById(Long id) {
        if (id != null)
            return getRepository().findById(id);

        return null;
    }
}
