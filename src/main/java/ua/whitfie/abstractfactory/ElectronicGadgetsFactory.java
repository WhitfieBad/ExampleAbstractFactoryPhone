package ua.whitfie.abstractfactory;

import ua.whitfie.exeptions.NotFoundTypePhone;

public interface ElectronicGadgetsFactory<T> {
    T create(String nameCompany, String nameModel, String serialNumber) throws NotFoundTypePhone;
}
