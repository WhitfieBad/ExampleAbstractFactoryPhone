package ua.whitfie.abstractfactory;

import ua.whitfie.model.AbstractPhone;
import ua.whitfie.model.ChinaPhone;

public class ChinaPhoneFactory extends FactoryPhone {

    @Override
    AbstractPhone createPhone(String nameModel, String serialNumber) {
        return new ChinaPhone(nameModel, serialNumber);
    }
}
