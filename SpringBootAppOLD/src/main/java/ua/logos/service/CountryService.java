package ua.logos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ua.logos.entity.Country;

@Service
public interface CountryService {

void saveCountry(Country country);
	
	Country findCountryById(int id);
	
	List<Country> findAllCountries();	
}
