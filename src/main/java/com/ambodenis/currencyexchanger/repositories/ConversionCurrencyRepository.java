package com.ambodenis.currencyexchanger.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ambodenis.currencyexchanger.models.ConversionCurrency;

public interface ConversionCurrencyRepository extends CrudRepository<ConversionCurrency, Long>{

}
