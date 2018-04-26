package ua.logos.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.logos.repository.CountryRepository;

@Component
public class CheckCountryNameExistValidator implements ConstraintValidator<CheckCountryNameExist, String>{

	@Autowired private CountryRepository countryRepository;
	
	@Override
	public boolean isValid(String countryName, ConstraintValidatorContext arg1) {
		if (countryName == null) return false;
		if (countryRepository.findCountryByName(countryName) != null) return false;
		else return true;
	}

	@Override
	public void initialize(CheckCountryNameExist constraintAnnotation) {

	}

}
