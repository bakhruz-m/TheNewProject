package validator.register;


import domain.Person;
import domain.register.CityRegisterCheckerResponse;
import exception.CityRegisterException;

public interface CityRegisterChecker
{
    CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException;
}