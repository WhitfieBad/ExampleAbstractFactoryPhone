package ua.whitfie.abstractfactory;

import ua.whitfie.exeptions.NotFoundTypePhone;
import ua.whitfie.model.AbstractPhone;

public abstract class FactoryPhone {

    public static AbstractPhone createPhone(String phoneData) throws NotFoundTypePhone {
        FactoryPhone factoryPhone = null;
        String arrayDataPhone[] = phoneData.split("\\|", 3);

        String namePhone = arrayDataPhone[0];
        String nameModel = arrayDataPhone[1];
        String serialNumber = arrayDataPhone[2].equalsIgnoreCase("nosn") ? "" : arrayDataPhone[2];

        switch (namePhone.toLowerCase()) {
            case "" :
            case "noname" : factoryPhone = new NoNamePhoneFactory(); break;
            case "apple" : factoryPhone = new ApplePhoneFactory(); break;
            case "china" : factoryPhone = new ChinaPhoneFactory(); break;
            case "samsung" : factoryPhone = new SamsungPhoneFactory(); break;
            default: throw new NotFoundTypePhone();
        }

        if (nameModel.isEmpty()) {
            throw new NotFoundTypePhone("Model is Empty");
        } else if (!(factoryPhone instanceof NoNamePhoneFactory) && serialNumber.isEmpty()) {
            throw new NotFoundTypePhone("No Serial Number");
        }

        return factoryPhone.createPhone(nameModel, serialNumber);
    }

    abstract AbstractPhone createPhone(String nameModel, String serialNumber);
}
