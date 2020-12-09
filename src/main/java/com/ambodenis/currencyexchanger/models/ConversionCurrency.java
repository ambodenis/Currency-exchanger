package com.ambodenis.currencyexchanger.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table
public class ConversionCurrency {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String toCurrency;
	@Column
    private String fromCurrency;
    @Column
    private double value;
    @CreationTimestamp
    @Column(name = "exchange_date")
    private LocalDateTime exchangeDate;


    public ConversionCurrency() {
    }

    public ConversionCurrency(Long id ,String toCurrency, String fromCurrency, double value, LocalDateTime exchangeDate) {
    	this.id = id;
    	this.toCurrency = toCurrency;
        this.fromCurrency = fromCurrency;
        this.value = value;
        this.exchangeDate = exchangeDate;
    }
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTo() {
        return toCurrency;
    }

    public void setTo(String to) {
        this.toCurrency = to;
    }

    public String getFrom() {
        return fromCurrency;
    }

    public void setFrom(String from) {
        this.fromCurrency = from;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

	public LocalDateTime getExchangeDate() {
		return exchangeDate;
	}

	public void setExchangeDate(LocalDateTime exchangeDate) {
		this.exchangeDate = exchangeDate;
	}
    

}
