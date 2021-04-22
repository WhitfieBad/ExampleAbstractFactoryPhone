package ua.whitfie.abstractfactory;

import ua.whitfie.exeptions.NotFoundTypePhone;
import ua.whitfie.model.*;

public class PhoneFactory implements ElectronicGadgetsFactory<AbstractPhone> {

    @Override
    public AbstractPhone create(String nameCompany, String nameModel, String serialNumber) throws NotFoundTypePhone {
        switch (nameCompany.toLowerCase()) {
            case "" : return new NoNamePhone(nameModel, serialNumber);
            case "apple" : return new ApplePhone(nameModel, serialNumber);
            case "china" : return new ChinaPhone(nameModel, serialNumber);
            case "samsung" : return new SamsungPhone(nameModel, serialNumber);
            default: throw new NotFoundTypePhone(nameCompany);
        }
    }
}
