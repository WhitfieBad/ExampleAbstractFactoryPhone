package ua.whitfie.abstractfactory;

import ua.whitfie.model.AbstractPhone;
import ua.whitfie.model.SamsungPhone;

public class SamsungPhoneFactory extends FactoryPhone {

    @Override
    AbstractPhone createPhone(String nameModel, String serialNumber) {
        return new SamsungPhone(nameModel, serialNumber);
    }
}
