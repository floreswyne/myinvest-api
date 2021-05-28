package br.com.viniciusflores.myinvest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.viniciusflores.myinvest.domain.Categoria;
import br.com.viniciusflores.myinvest.repository.CategoriaRepository;

@RestController
@RequestMapping("categoria")
public class CategoriaResource {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public List<Categoria> listarTodos() {
		return (List<Categoria>) this.categoriaRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Categoria buscarPeloId(@PathVariable Long id) {
		return this.categoriaRepository.findById(id).orElse(null);
	}
	
	@PostMapping
	public Categoria adicionar(Categoria categoria) {
		return this.categoriaRepository.save(categoria);
	}
	
	@DeleteMapping("/{id}")
	public void removerPeloId(@PathVariable Long id) {
		this.categoriaRepository.deleteById(id);
	}
	
}
