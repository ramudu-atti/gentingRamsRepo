package com.genting.ram.entity;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class ExchangeCurrencyEntity {

	private String baseCurrency;
	private String targetCurrency;
	public String getBaseCurrency() {
		return baseCurrency;
	}
	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}
	public String getTargetCurrency() {
		return targetCurrency;
	}
	public void setTargetCurrency(String targetCurrency) {
		this.targetCurrency = targetCurrency;
	}
	public BigDecimal getBaseQuanity() {
		return baseQuanity;
	}
	public void setBaseQuanity(BigDecimal baseQuanity) {
		this.baseQuanity = baseQuanity;
	}
	public BigDecimal getTargetAmount() {
		return targetAmount;
	}
	public void setTargetAmount(BigDecimal targetAmount) {
		this.targetAmount = targetAmount;
	}
	private BigDecimal baseQuanity;
	private BigDecimal targetAmount;
}
