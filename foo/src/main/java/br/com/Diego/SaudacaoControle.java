package br.com.Diego;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudacaoControle {

	private static final String template = "Eai, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/Saudacao")
	public Saudacao saudacao (@RequestParam(value = "name", defaultValue = "Word") String name ) {
		return new Saudacao(counter.incrementAndGet(), String.format(template, name));
		
	}
}
