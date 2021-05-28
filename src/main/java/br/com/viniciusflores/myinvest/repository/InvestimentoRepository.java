package br.com.viniciusflores.myinvest.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.viniciusflores.myinvest.domain.Investimento;

@Repository
public interface InvestimentoRepository extends PagingAndSortingRepository<Investimento, Long> {

}
