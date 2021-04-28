package ua.whitfie.abstractfactory;

import ua.whitfie.exeptions.NotFoundTypeProduct;
import ua.whitfie.model.AbstractProduct;
import ua.whitfie.model.AppleProduct;

public class UnitedStatesFactory implements ProductCountryFactory<AbstractProduct> {

    @Override
    public AbstractProduct create(String nameCompany, String nameModel, String serialNumber) throws NotFoundTypeProduct {
        switch (nameCompany.toLowerCase()) {
            case "apple" : return new AppleProduct(nameModel, serialNumber);
        }
        throw new NotFoundTypeProduct();
    }
}
