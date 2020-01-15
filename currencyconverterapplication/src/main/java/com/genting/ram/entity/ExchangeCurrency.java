package com.genting.ram.entity;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class ExchangeCurrency extends Currency {

	public ExchangeCurrency() {

	}

	public ExchangeCurrency(Integer id, String name) {
		super(id, name);
	}

	@Override
	public BigDecimal getExchangeRate(Currency baseCurrency, Currency targetCurrency) {
		// 1 for sgd, 2for USD
		if (baseCurrency.getId() == 1 && targetCurrency.getId() == 2) {
			return new BigDecimal(0.742164);
		}

		if (baseCurrency.getId() == 2 && targetCurrency.getId() == 1) {
			return new BigDecimal(1.34782);
		}
		return new BigDecimal(1);
	}

	@Override
	public BigDecimal getExchangedAmount(BigDecimal currencyQuanity,BigDecimal exchangeRate){
		
		BigDecimal excahngedAmount=currencyQuanity.multiply(exchangeRate);
  return excahngedAmount;
	}

}
