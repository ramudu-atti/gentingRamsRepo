package com.genting.ram.endpoints;

import java.math.BigDecimal;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genting.ram.entity.Currency;
import com.genting.ram.entity.ExchangeCurrency;
import com.genting.ram.entity.ExchangeCurrencyEntity;

@Path("/exchange")
@Service
public class CurrencyExchangeService {

	@Autowired
	private Currency exchangeCurrency;

	@GET
	@Produces("application/json")
	@Path("/get/{basecurrency}/{base}/{targetccy}")
	public Response getCurrentExchangeAmount(@PathParam("basecurrency") String baseCurrencyName,
			@PathParam("base") String baseQuantiy, @PathParam("targetccy") String targetCurrency) {

		ExchangeCurrencyEntity resultEntity = new ExchangeCurrencyEntity();
		resultEntity.setBaseCurrency(baseCurrencyName);
		resultEntity.setBaseQuanity(new BigDecimal(baseQuantiy));

		if ((baseCurrencyName.equalsIgnoreCase("usd") || baseCurrencyName.equalsIgnoreCase("sgd"))
				&& (targetCurrency.equalsIgnoreCase("usd") || targetCurrency.equalsIgnoreCase("sgd"))) {

			resultEntity.setTargetCurrency(targetCurrency);

			// assume 1: for SGD
			// assume 2: for USD
			Currency basexchangeCcy = new ExchangeCurrency(1, baseCurrencyName);
			Currency targetExchangeCcy = new ExchangeCurrency(2, targetCurrency);

			BigDecimal targetRate = exchangeCurrency.getExchangeRate(basexchangeCcy, targetExchangeCcy);

			BigDecimal targetAmount = exchangeCurrency.getExchangedAmount(new BigDecimal(baseQuantiy), targetRate);

			resultEntity.setTargetAmount(targetAmount);
			return Response.status(200).entity(resultEntity).build();

		}
		return Response.status(422).entity(resultEntity).build();
	}
}
