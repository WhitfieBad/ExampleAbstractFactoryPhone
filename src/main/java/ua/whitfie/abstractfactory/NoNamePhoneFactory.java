package ua.whitfie.abstractfactory;

import ua.whitfie.model.AbstractPhone;
import ua.whitfie.model.NoNamePhone;

public class NoNamePhoneFactory extends FactoryPhone {

    @Override
    AbstractPhone createPhone(String nameModel, String serialNumber) {
        if (serialNumber.equalsIgnoreCase("nosn")) {
            return new NoNamePhone(nameModel, "");
        }
        return new NoNamePhone(nameModel, serialNumber);
    }
}
