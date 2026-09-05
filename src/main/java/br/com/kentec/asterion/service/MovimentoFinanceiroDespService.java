package br.com.kentec.asterion.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kentec.asterion.DTO.MovimentoFinanceiroDespDTO;
import br.com.kentec.asterion.domain.DescricaoDespesa;
import br.com.kentec.asterion.domain.MovimentoFinanceiroDespesa;
import br.com.kentec.asterion.domain.Periodo;
import br.com.kentec.asterion.domain.User;
import br.com.kentec.asterion.repository.DescricaoDespesaRepository;
import br.com.kentec.asterion.repository.MovimentoFinanceiroDespRepository;
import br.com.kentec.asterion.repository.PeriodoRepository;
import br.com.kentec.asterion.repository.UserReposiroty;

@Service
public class MovimentoFinanceiroDespService {
	
	@Autowired
	private UserReposiroty ur;
	
	@Autowired
	private PeriodoRepository pr;
	
	@Autowired
	private DescricaoDespesaRepository ddr;
	
	@Autowired
	private MovimentoFinanceiroDespRepository mfdr;
	
	public List<MovimentoFinanceiroDespDTO> listarTodasDespesas(){
		return mfdr.findAll().stream().map(MovimentoFinanceiroDespDTO::new).collect(Collectors.toList());
	}
	
	public MovimentoFinanceiroDespesa salvarDespesa(MovimentoFinanceiroDespDTO movFin) {
		
		MovimentoFinanceiroDespesa movFinDesp = new MovimentoFinanceiroDespesa();
		
		movFinDesp.setNumeroDocumento(movFin.getNumeroDocumento());
		movFinDesp.setDataDespesa(movFin.getDataDespesa());
		movFinDesp.setDataPagamento(movFin.getDataPagamento());
		movFinDesp.setStatusPagamento(movFin.getStatusPagamento());
		movFinDesp.setTipoPagamento(movFin.getTipoPagamento());
		movFinDesp.setFormaPagamento(movFin.getFormaPagamento());
		movFinDesp.setValor(movFin.getValor());
		movFinDesp.setObservacao(movFin.getObservacao());
		movFinDesp.setDespesa(movFin.getDespesa());
		
		Optional<User> user = ur.findById(movFin.getUserId()); 
		movFinDesp.setUser(user.get());
		
		Optional<Periodo> periodo = pr.findById(movFin.getPeriodoId());
		movFinDesp.setPeriodo(periodo.get());
		
		Optional<DescricaoDespesa> descricaoDespesa = ddr.findById(movFin.getDescricaoDespesaId());
		movFinDesp.setDescricaoDespesa(descricaoDespesa.get());
		
		var retornoDespesa = mfdr.save(movFinDesp);
		return retornoDespesa;
	}
}
