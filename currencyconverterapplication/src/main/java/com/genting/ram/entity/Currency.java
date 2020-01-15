package com.genting.ram.entity;

import java.math.BigDecimal;

public abstract class Currency implements TradingCurrency {

	public Currency(){
		
	}

	public Currency(Integer id, String name) {
	this.id=id;
	this.name=name;
	}

	private Integer id;
	private String name;
	
	

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public abstract BigDecimal getExchangeRate(Currency baseCurrency,Currency targetCurrency);

	public abstract BigDecimal getExchangedAmount(BigDecimal currencyQuanity,BigDecimal exchangeRate);
}
