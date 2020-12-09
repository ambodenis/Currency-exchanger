package com.ambodenis.currencyexchanger.models;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CurrencyDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private boolean success;
	@Column
    private long timestamp;
	@Column
    private String base;
	@Column
    private String date;
	@ElementCollection
	@Column
    private Map<String, Double> rates;

    public CurrencyDTO() {
    }

    public CurrencyDTO(int id, boolean success, long timestamp, String base, String date, Map<String, Double> rates) {
        this.id = id;
    	this.success = success;
        this.timestamp = timestamp;
        this.base = base;
        this.date = date;
        this.rates = rates;
    }

    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "CurrencyDTO{" +
                "success=" + success +
                ", timestamp=" + timestamp +
                ", base='" + base + '\'' +
                ", date='" + date + '\'' +
                ", rates=" + rates +
                '}';
    }

}
