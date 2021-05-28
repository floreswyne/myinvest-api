package br.com.viniciusflores.myinvest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.viniciusflores.myinvest.domain.Investimento;
import br.com.viniciusflores.myinvest.repository.InvestimentoRepository;

@RestController
@RequestMapping("/investimento")
public class InvestimentoResource {

	@Autowired
	private InvestimentoRepository investimentoRepository;
	
	@GetMapping
	public List<Investimento> listarTodos() {
		return (List<Investimento>) this.investimentoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Investimento buscarPeloId(@PathVariable Long id) {
		return this.investimentoRepository.findById(id).orElse(null);
	}
	
	@PostMapping
	public Investimento adicionar(Investimento investimento) {
		return this.investimentoRepository.save(investimento);
	}
	
	@DeleteMapping("/{id}")
	public void removerPeloId(@PathVariable Long id) {
		this.investimentoRepository.deleteById(id);
	}
}
