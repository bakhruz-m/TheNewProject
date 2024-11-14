package validator;

import domain.Child;
import domain.StudentOrder;
import domain.register.AnswerCityRegister;
import domain.register.CityRegisterCheckerResponse;
import exception.CityRegisterException;
import validator.register.CityRegisterChecker;
import validator.register.FakeCityRegisterChecker;

import java.util.Iterator;
import java.util.List;

public class CityRegisterValidator
{
    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        try {
            CityRegisterCheckerResponse hans = personChecker.checkPerson(so.getHusband());
            CityRegisterCheckerResponse wans = personChecker.checkPerson(so.getWife());
        } catch (CityRegisterException ex) {
            ex.printStackTrace(System.out);
        }

        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}
