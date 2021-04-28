package ua.whitfie.abstractfactory;

import ua.whitfie.exeptions.NotFoundTypeProduct;
import ua.whitfie.model.AbstractProduct;
import ua.whitfie.model.NoNameProduct;

public class NoNameFactory implements ProductCountryFactory<AbstractProduct> {

    @Override
    public AbstractProduct create(String nameCompany, String nameModel, String serialNumber) throws NotFoundTypeProduct {
        return new NoNameProduct(nameModel, "");
    }
}
