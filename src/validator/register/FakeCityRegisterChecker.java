package validator.register;

import domain.Adult;
import domain.Child;
import domain.Person;
import domain.register.CityRegisterCheckerResponse;
import exception.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterChecker
{
    private static final String GOOD_1 = "1000";
    private static final String GOOD_2 = "2000";
    private static final String BAD_1 = "1001";
    private static final String BAD_2 = "2001";
    private static final String ERROR_1 = "1002";
    private static final String ERROR_2 = "2002";

    public CityRegisterCheckerResponse checkPerson(Person person)
            throws CityRegisterException {

        CityRegisterCheckerResponse res = new CityRegisterCheckerResponse();
        Adult t = (Adult) person;
        String string = t.getPassportSeria();
        System.out.println("Number of passport:" + string);
        if (person instanceof Adult) {

        }


        System.out.println(res);

        return res;
    }
}