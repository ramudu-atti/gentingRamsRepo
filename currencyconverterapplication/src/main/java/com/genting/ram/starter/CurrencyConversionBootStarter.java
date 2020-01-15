package com.genting.ram.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.genting.ram.entity.Currency;
import com.genting.ram.entity.ExchangeCurrency;

@SpringBootApplication
@ComponentScan({"com.genting.ram.starter","com.genting.ram.endpoints","com.genting.ram.entity","com.genting.ram.config"})
public class CurrencyConversionBootStarter {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionBootStarter.class, args);
        Currency c=  new ExchangeCurrency(1, "ram");
        System.out.println(c.getName());
        
	}

}
