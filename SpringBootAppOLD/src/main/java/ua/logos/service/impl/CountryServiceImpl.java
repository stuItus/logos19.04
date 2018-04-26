package ua.logos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.logos.entity.Country;
import ua.logos.repository.CountryRepository;
import ua.logos.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired private CountryRepository countryRepository;
	
	@Override
	public void saveCountry(Country country) {
		countryRepository.save(country);
	}

	@Override
	public Country findCountryById(int id) {
		return countryRepository.getOne(id);
	}

	@Override
	public List<Country> findAllCountries() {
		return countryRepository.findAll();
	}

}
