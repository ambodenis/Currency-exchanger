package com.ambodenis.currencyexchanger.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ambodenis.currencyexchanger.models.Currency;

public interface CurrencyRepository extends CrudRepository<Currency, String> {
	
	@Override
    List<Currency> findAll();
	
	

}
