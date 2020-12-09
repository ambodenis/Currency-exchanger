package com.ambodenis.currencyexchanger.services;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ambodenis.currencyexchanger.models.ConversionCurrency;
import com.ambodenis.currencyexchanger.models.Currency;
import com.ambodenis.currencyexchanger.repositories.ConversionCurrencyRepository;
import com.ambodenis.currencyexchanger.repositories.CurrencyRepository;

@Service
public class CurrencyService {
	
	private CurrencyRepository currencyRepository;
	private ConversionCurrencyRepository conversionCurrencyRepository;

    public CurrencyService(CurrencyRepository currencyRepository, ConversionCurrencyRepository conversionCurrencyRepository) {
        this.currencyRepository = currencyRepository;
        this.conversionCurrencyRepository = conversionCurrencyRepository;
    }

    public List<Currency> getAllCurrencies() {
        List<Currency> currencyList = this.currencyRepository.findAll();
        currencyList.sort(Comparator.comparing(Currency::getName));
        return currencyList;
    }

    public Optional<Double> convert(ConversionCurrency conversionCurrency) {
        Optional<Currency> toOptional = this.currencyRepository.findById(conversionCurrency.getTo().toUpperCase());
        Optional<Currency> fromOptional = this.currencyRepository.findById(conversionCurrency.getFrom().toUpperCase());

        if(toOptional.isPresent() && fromOptional.isPresent()) {

            if(conversionCurrency.getValue() < 0) {
                return Optional.empty();
            }

            Currency to = toOptional.get();
            Currency from = fromOptional.get();
            Double toValue = to.getValueInEuros();
            Double fromValue = from.getValueInEuros();

            Double result = toValue * conversionCurrency.getValue() / fromValue;

            return Optional.of(result);

        }

        return Optional.empty();
    }
    
    public ConversionCurrency save(ConversionCurrency object) {
        return conversionCurrencyRepository.save(object);
    }
    
    
}
