package tan.hung.formatter;

import org.springframework.format.Formatter;
import tan.hung.model.Phone;

import java.text.ParseException;
import java.util.Locale;

public class PhoneFormatter implements Formatter<Phone> {
    @Override
    public Phone parse(String text, Locale locale) throws ParseException {
        String[] temp = text.split("-");
        Phone p = new Phone();
        p.setAreaCode(temp[0]);
        p.setPrefix(temp[1]);
        p.setNumber(temp[2]);
        System.out.println("Inside PhoneFormatter: parse method");
        System.out.println(p);
        return p;
    }

    @Override
    public String print(Phone object, Locale locale) {
        String phoneStrDisplayOnJSPPage = object.getAreaCode() + "&&" + object.getPrefix() + "&&" + object.getNumber();
        System.out.println("Inside PhoneFormatter: print method");
        return phoneStrDisplayOnJSPPage;
    }
}
