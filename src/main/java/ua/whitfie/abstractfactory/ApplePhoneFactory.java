package ua.whitfie.abstractfactory;

import ua.whitfie.model.AbstractPhone;
import ua.whitfie.model.ApplePhone;

public class ApplePhoneFactory extends FactoryPhone {

    @Override
    AbstractPhone createPhone(String nameModel, String serialNumber) {
        return new ApplePhone(nameModel, serialNumber);
    }
}
