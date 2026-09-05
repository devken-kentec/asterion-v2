package br.com.kentec.asterion.configuration;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.Transactional;

import br.com.kentec.asterion.repository.CaixaRepository;
import br.com.kentec.asterion.repository.ContaRepository;
import br.com.kentec.asterion.repository.DescricaoDespesaRepository;
import br.com.kentec.asterion.repository.DescricaoReceitaRepository;
import br.com.kentec.asterion.repository.PeriodoRepository;
import br.com.kentec.asterion.repository.UserReposiroty;
import br.com.kentec.asterion.util.Comum;
import br.com.kentec.asterion.domain.Caixa;
import br.com.kentec.asterion.domain.Conta;
import br.com.kentec.asterion.domain.DescricaoDespesa;
import br.com.kentec.asterion.domain.DescricaoReceita;
import br.com.kentec.asterion.domain.Periodo;
import br.com.kentec.asterion.domain.User;

@Configuration
@Profile("prod")
public class CreateEntitysDefault {
	
	@Autowired
	private UserReposiroty ur;
	
	@Autowired
	private PeriodoRepository pr;
	
	@Autowired
	private DescricaoDespesaRepository ddr;
	
	@Autowired
	private DescricaoReceitaRepository drr;
	
	@Autowired
	private CaixaRepository cxr;
	
	@Autowired
	private ContaRepository ctr;
	
	@Bean
	@Transactional
	CommandLineRunner executar() {
		return args ->{
			long periodo = pr.count();
			if(periodo == 0) {
				List<Periodo> periodos = Arrays.asList(
					new Periodo("06/2026", "Ativo"),		
					new Periodo("07/2026", "Ativo"),		
					new Periodo("08/2026", "Ativo"),	
					new Periodo("09/2026", "Ativo"),
					new Periodo("10/2026", "Ativo"),
					new Periodo("11/2026", "Ativo"),
					new Periodo("12/2026", "Ativo"),
					new Periodo("01/2027", "Ativo"),
					new Periodo("02/2027", "Ativo"),
					new Periodo("02/2027", "Ativo"),
					new Periodo("03/2027", "Ativo"),
					new Periodo("04/2027", "Ativo"),
					new Periodo("05/2027", "Ativo"),
					new Periodo("06/2027", "Ativo"),
					new Periodo("07/2027", "Ativo")
				);
				pr.saveAll(periodos);
			}
			
			long descDesp = ddr.count();
			if(descDesp == 0) {
				List<DescricaoDespesa> descricaoDespesas = Arrays.asList(
					new DescricaoDespesa("Energia Elétrica", "Ativo"),
					new DescricaoDespesa("Agua e Esgoto", "Ativo"),
					new DescricaoDespesa("Aluguel Imovel", "Ativo"),
					new DescricaoDespesa("Combustivel", "Ativo"),
					new DescricaoDespesa("Reparo e Manutenções", "Ativo"),
					new DescricaoDespesa("Material de Expediente", "Ativo"),
					new DescricaoDespesa("Transporte", "Ativo"),
					new DescricaoDespesa("Assinaturas", "Ativo")
			    );
				ddr.saveAll(descricaoDespesas);
			}	
			
			long descRec = drr.count();
			if(descRec == 0) {
				List<DescricaoReceita> descricaoReceitas = Arrays.asList(
					new DescricaoReceita("Salario", "Ativo"),
					new DescricaoReceita("Proventos", "Ativo"),
					new DescricaoReceita("Mensalidade", "Ativo"),
					new DescricaoReceita("Juros", "Ativo"),
					new DescricaoReceita("Rendimentos", "Ativo"),
					new DescricaoReceita("Aluguel", "Ativo")
			    );
				drr.saveAll(descricaoReceitas);
			}	
	
			long users = ur.count();
			if(users == 0) {
				User user = new User();
				user.setNome("Kennedy Tomazete");
				user.setEmail("contato@kentec.com.br");
				user.setRole("DEV-SYSTEM");
				user.setStatus("Ativo");
				user.setSenhaUsuario(Comum.encrypt("devken00"));
				user.setChaveUsuario(UUID.randomUUID().toString());
				ur.save(user);
			}
			
			Optional<User> user = ur.findById(1L);
			
			long caixas = cxr.count();
			if(caixas == 0) {
				Caixa caixa = new Caixa("Teste Desenvolvedor1", user.get(), "Ativo"); 
				cxr.save(caixa);
			}
			
			long contas = ctr.count();
			if(contas == 0) {
				Conta conta = new Conta("Teste Desenvolvedor1", user.get(), "Ativo"); 
				ctr.save(conta);
			}
			
		};
	}
}
