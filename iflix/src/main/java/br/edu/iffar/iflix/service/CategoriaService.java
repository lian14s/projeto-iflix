package br.edu.iffar.iflix.service;

import br.edu.iffar.iflix.model.Categoria;
import br.edu.iffar.iflix.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoriaService {
    private CategoriaRepository repo;

    public CategoriaService(CategoriaRepository r) {
        this.repo = r;
    }

    //listar todas as categorias
    public List<Categoria> buscarTodos(){
        return this.repo.findAll();
    }

    public void gravar(Categoria c){
        this.repo.save(c);
    }
}
