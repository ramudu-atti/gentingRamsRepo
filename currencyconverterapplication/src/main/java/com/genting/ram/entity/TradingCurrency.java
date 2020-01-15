package com.genting.ram.entity;

import java.math.BigDecimal;

public interface TradingCurrency {

	public BigDecimal getExchangeRate(Currency baseCurrency,Currency targetCurrency);

	public BigDecimal getExchangedAmount(BigDecimal currencyQuanity,BigDecimal exchangeRate);

}
