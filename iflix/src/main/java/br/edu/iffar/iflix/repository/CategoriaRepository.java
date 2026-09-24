package br.edu.iffar.iflix.repository;

import br.edu.iffar.iflix.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository
        extends JpaRepository<Categoria, Integer> {
}
