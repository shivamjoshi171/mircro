package com.shivam.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
public class CurrencyExchangeController {
	private Logger logger=(Logger) LoggerFactory.getLogger(this.getClass());
	@Autowired
	private ExchangeValueRespo exchangeValueRespo;
	@GetMapping(path="currency-exchange-service/{from}/{to}")
		public ExhangeValue getValue(@PathVariable String from,@PathVariable String to){
			//ExhangeValue exhangeValue= new ExhangeValue(1000L,from,to, BigDecimal.valueOf(69));
			ExhangeValue val= exchangeValueRespo.findByFromAndTo(from, to);
			logger.info("{}", val);
			return val;
		}
//	@GetMapping(path="hello")
//	public String yesss(){
//		return "hello";
//	}
}
