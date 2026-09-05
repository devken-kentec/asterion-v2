package br.com.kentec.asterion.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kentec.asterion.DTO.MovimentoFinanceiroRecDTO;
import br.com.kentec.asterion.domain.DescricaoReceita;
import br.com.kentec.asterion.domain.MovimentoFinanceiroReceita;
import br.com.kentec.asterion.domain.Periodo;
import br.com.kentec.asterion.domain.User;
import br.com.kentec.asterion.repository.DescricaoReceitaRepository;
import br.com.kentec.asterion.repository.MovimentoFinanceiroRecRepository;
import br.com.kentec.asterion.repository.PeriodoRepository;
import br.com.kentec.asterion.repository.UserReposiroty;


@Service
public class MovimentoFinanceiroRecService {
	
	@Autowired
	private UserReposiroty ur;
	
	@Autowired
	private PeriodoRepository pr;
	
	@Autowired
	private DescricaoReceitaRepository drr;
	
	@Autowired
	private MovimentoFinanceiroRecRepository mfrr;
	
	public List<MovimentoFinanceiroRecDTO> listarTodasReceitas(){
		return mfrr.findAll().stream().map(MovimentoFinanceiroRecDTO::new).collect(Collectors.toList());
	}
	
	public MovimentoFinanceiroReceita salvarReceita(MovimentoFinanceiroRecDTO movFin) {
		MovimentoFinanceiroReceita movFinRec = new MovimentoFinanceiroReceita();
		
		movFinRec.setNumeroDocumento(movFin.getNumeroDocumento());
		movFinRec.setDataReceita(movFin.getDataReceita());
		movFinRec.setDataRecebimento(movFin.getDataRecebimento());
		movFinRec.setStatusRecebimento(movFin.getStatusRecebimento());
		movFinRec.setTipoRecebimento(movFin.getTipoRecebimento());
		movFinRec.setFormaRecebimento(movFin.getFormaRecebimento());
		movFinRec.setValor(movFin.getValor());
		movFinRec.setObservacao(movFin.getObservacao());
		movFinRec.setReceita(movFin.getReceita());
		
		Optional<User> user = ur.findById(movFin.getUserId()); 
		movFinRec.setUser(user.get());
		
		Optional<Periodo> periodo = pr.findById(movFin.getPeriodoId());
		movFinRec.setPeriodo(periodo.get());
		
		Optional<DescricaoReceita> descricaoReceita = drr.findById(movFin.getDescricaoReceitaId());
		movFinRec.setDescricaoReceita(descricaoReceita.get());
		
		var retornoReceita = mfrr.save(movFinRec);
		return retornoReceita;
	}

}
