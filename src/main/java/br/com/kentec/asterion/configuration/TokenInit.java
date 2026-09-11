package br.com.kentec.asterion.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TokenInit {
	
	private String token;
	
	public TokenInit () {
		this.token = "12EA724922E7154628303BE2082D0FC8D63F6E8DA0DFE0"
				   + "37302E9BEF413E43D357EA498188C28C9005987DE76171E82E"
				   + "4C9FD68D1928186E7116E7A80C61D7D2";
	}

    @Bean
	public String getToken() {
		return token;
	}
}
