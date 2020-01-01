package com.shivam.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRespo extends  JpaRepository<ExhangeValue, Long> {
ExhangeValue findByFromAndTo(String from ,String to);
}
