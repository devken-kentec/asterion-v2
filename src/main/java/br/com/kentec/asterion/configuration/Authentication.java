package br.com.kentec.asterion.configuration;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "${origin.cors.url}", maxAge = 3600)
@RestController
@RequestMapping("/megatron-kentec/api/auth/v1")
public class Authentication {

}
