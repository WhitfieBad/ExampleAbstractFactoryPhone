package ua.whitfie.abstractfactory;

import ua.whitfie.exeptions.NotFoundTypePhone;
import ua.whitfie.model.AbstractPhone;

public abstract class FactoryPhone {

    public static AbstractPhone createPhone(String phoneData) throws NotFoundTypePhone {
        FactoryPhone factoryPhone = null;
        String namePhone = "";
        String nameModel = "";
        String serialNumber = "";

        String arrayDataPhone[] = phoneData.split("\\|");
        if (arrayDataPhone.length == 2 || arrayDataPhone.length == 3) {
            namePhone = arrayDataPhone[0];
            nameModel = arrayDataPhone[1];
        } else {
            throw new NotFoundTypePhone();
        }

        if (arrayDataPhone.length == 3 && arrayDataPhone[2].equalsIgnoreCase("nosn")) {
            serialNumber = arrayDataPhone[2];
        }

        switch (namePhone.toLowerCase()) {
            case "" :
            case "noname" : factoryPhone = new NoNamePhoneFactory(); break;
            case "apple" : factoryPhone = new ApplePhoneFactory(); break;
            case "china" : factoryPhone = new ChinaPhoneFactory(); break;
            case "samsung" : factoryPhone = new SamsungPhoneFactory(); break;
            default: throw new NotFoundTypePhone();
        }

        if (nameModel.isEmpty() || (!(factoryPhone instanceof NoNamePhoneFactory) && serialNumber.isEmpty())) {
            throw new NotFoundTypePhone();
        }

        return factoryPhone.createPhone(nameModel, serialNumber);
    }

    abstract AbstractPhone createPhone(String nameModel, String serialNumber);
}
