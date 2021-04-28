package ua.whitfie.abstractfactory;

import ua.whitfie.exeptions.NotFoundTypeProduct;

public interface ProductCountryFactory<T> {
    T create(String nameCompany, String nameModel, String serialNumber) throws NotFoundTypeProduct;
}
