package validator.register;

import domain.Person;
import domain.register.CityRegisterCheckerResponse;
import exception.CityRegisterException;

public class RealCityRegisterChecker implements CityRegisterChecker
{
    public CityRegisterCheckerResponse checkPerson(Person person)
            throws CityRegisterException {
        return null;
    }
}